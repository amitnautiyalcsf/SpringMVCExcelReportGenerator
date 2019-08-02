package com.abc;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

public class ExcelReportView extends AbstractXlsView {

	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
	
		response.setHeader("Content-Disposition","attachment; filename=\"users.xls\"");
		
		List<User>userList = (List<User>) model.get("userList");
		Sheet sheet = workbook.createSheet("user List");
		Row headerRow= sheet.createRow(0);
		headerRow.createCell(0).setCellValue("ID");
		headerRow.createCell(1).setCellValue("User Name");
		headerRow.createCell(2).setCellValue("First Name");
		headerRow.createCell(3).setCellValue("Last Name");
		
		int row=1;
		for(User user : userList)
		{
			
			Row dataRow=sheet.createRow(row++);
			dataRow.createCell(0).setCellValue(user.getId());
			dataRow.createCell(1).setCellValue(user.getUsername());
			dataRow.createCell(2).setCellValue(user.getFirstName());
			dataRow.createCell(3).setCellValue(user.getLastName());
			
		}
	
		
		
	}

}
