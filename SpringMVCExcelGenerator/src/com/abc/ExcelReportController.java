package com.abc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/")
public class ExcelReportController {

	@Autowired
    ExcelDao excelDao;
	
	
	
	@RequestMapping(value = "/downloadExcel" , method=RequestMethod.GET)
	public ModelAndView getReport(HttpServletRequest request, HttpServletResponse response)
	{
		String reportType= request.getParameter("type");
		List<User>userList=excelDao.getUserList();
		if(reportType!=null && reportType.equals("excel"))
		{
			
			return new ModelAndView(new ExcelReportView(),"userList",userList);
			
		}
		
		//else if *pdf* code for pdf
	
		//default before Type comes in 
		return new ModelAndView("userReport","userList",userList);
		
		
		
	}
}
