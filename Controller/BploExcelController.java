package com.bfpoms.bfpoms.Controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
//import java.net.http.HttpHeaders;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.poi.ss.usermodel.DateUtil;
//import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.bfpoms.bfpoms.Entity.BploExcelEntity;
import com.bfpoms.bfpoms.Repository.BploExcelRepository;



@RestController
@RequestMapping("/bplo")
@CrossOrigin
public class BploExcelController {

	
	@Autowired
	private BploExcelRepository Bplorepo;
	
	@GetMapping("/print")
	public String printApplocation() {
		return "Labad Naman!!!";
	}
	
	@GetMapping("getBPLO")
	public List<BploExcelEntity> getAllBploExcel(){
		return Bplorepo.findAll();
	}


	
	
	@PostMapping("/upload")
	public String uploadExcelFile(@RequestParam("BPLO-List-Sample") MultipartFile file) {
			
		   try (Workbook workbook = new XSSFWorkbook(file.getInputStream())) {
	            Sheet sheet = workbook.getSheetAt(0);
	
		
	    
		for (int i = 1; i <= sheet.getLastRowNum(); i++) {
			
			Row row = sheet.getRow(i);
			BploExcelEntity newBploExcelEntity = new BploExcelEntity();
			
			
			//newBploExcelEntity = Bplorepo.findById(i).get();
			
			newBploExcelEntity.setPermit_no((int) row.getCell(1).getNumericCellValue());
		    
		    if (row.getCell(2) != null) {
		        if (DateUtil.isCellDateFormatted(row.getCell(2))) {
		            // Handle date cell
		            SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		            newBploExcelEntity.setDate_operated(sdf.format(row.getCell(2).getDateCellValue()));
		        } else {
		            // Handle string cell
		            newBploExcelEntity.setDate_operated(row.getCell(2).getStringCellValue());
		        }
		    }
		    if (row.getCell(3) != null) {
		    	if(DateUtil.isCellDateFormatted(row.getCell(3))) {
		    		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		    		newBploExcelEntity.setDate_assessed(sdf.format(row.getCell(3).getDateCellValue()));
		    	}else {
		    		newBploExcelEntity.setDate_assessed(row.getCell(3).getStringCellValue());
		    	}
		    }
		    newBploExcelEntity.setBusiness_name(row.getCell(4).getStringCellValue());
            newBploExcelEntity.setCorp_name(row.getCell(5).getStringCellValue());
            newBploExcelEntity.setAddress(row.getCell(6).getStringCellValue());
            newBploExcelEntity.setBarangay(row.getCell(7).getStringCellValue());
            newBploExcelEntity.setStation_aor(row.getCell(8).getStringCellValue());
            newBploExcelEntity.setName_owner(row.getCell(9).getStringCellValue());
            newBploExcelEntity.setLine_of_business(row.getCell(10).getStringCellValue());
            newBploExcelEntity.setNature_of_business(row.getCell(11).getStringCellValue());
		    

			Bplorepo.save(newBploExcelEntity);
			}
		
		return "File uploaded, new records added to the database. ";
	}catch (IOException e) {
		e.printStackTrace();
		return "Error Uploading File";
	}
	
	}
	
	@GetMapping("/download")
	@ResponseBody
	public ResponseEntity<byte[]> downloadExcelFile(){
		try (Workbook workbook = new XSSFWorkbook()) {
			List<BploExcelEntity> data = Bplorepo.findAll();
			
			//Workbook workbook = new XSSFWorkbook();
			
			Sheet sheet = workbook.createSheet("BPLO-List-Sample");
			int rownum = 0;
			
			for (BploExcelEntity newBploEntity : data) {
				
				Row row = sheet.createRow(rownum++);
				
				row.createCell(0).setCellValue(newBploEntity.getId());
				row.createCell(1).setCellValue(newBploEntity.getPermit_no());
				row.createCell(2).setCellValue(newBploEntity.getDate_operated());
				row.createCell(3).setCellValue(newBploEntity.getDate_assessed());
				row.createCell(4).setCellValue(newBploEntity.getBusiness_name());
				row.createCell(5).setCellValue(newBploEntity.getCorp_name());
				row.createCell(6).setCellValue(newBploEntity.getAddress());
				row.createCell(7).setCellValue(newBploEntity.getBarangay());
				row.createCell(8).setCellValue(newBploEntity.getStation_aor());
				row.createCell(9).setCellValue(newBploEntity.getName_owner());
				row.createCell(10).setCellValue(newBploEntity.getLine_of_business());
				row.createCell(11).setCellValue(newBploEntity.getNature_of_business());
				
			}
			
			ByteArrayOutputStream excelStream = new ByteArrayOutputStream();
			workbook.write(excelStream);
			
			 HttpHeaders headers = new HttpHeaders();
			 headers.setContentType(MediaType.parseMediaType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"));
		     headers.setContentDispositionFormData("attachment", "BPLO-List-Sample.xlsx");
		     
		        return ResponseEntity.ok()
		                .headers(headers)
		                .body(excelStream.toByteArray());

		}catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.badRequest().build();
		}
		
	}
	
}
	
	
	


