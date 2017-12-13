package com.reimbursment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.reimbursment.model.Reimbursment;
import com.reimbursment.service.IReimbursmentService;

@Controller
@RequestMapping("/enroll")
public class ReimbursmentController {

	@Autowired
	IReimbursmentService reimbursmentService;

	@RequestMapping(value = "/{receptId}", method = RequestMethod.GET)
	public @ResponseBody Reimbursment getReimbursment(@PathVariable String receptId) {
		Reimbursment e = reimbursmentService.getReimbursment(receptId);
		return e;
	}
	
	
	//@PrivilegeLevel(value="Read")
	@RequestMapping(value = "/getEnList", method = RequestMethod.GET)
	public @ResponseBody List<Reimbursment> reimbursementlist() {
		List<Reimbursment> enList = reimbursmentService.reimbursementlist();
		/*for(Annotation an : EnrollmentController.class.getMethods()[0].getAnnotations()){
			an.annotationType().e
		}*/
		
		return enList;
	}
	
	
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public @ResponseBody List<Reimbursment> addReimbursement(@RequestBody Reimbursment reimbursment) {
		List<Reimbursment> enList = reimbursmentService.addReimbursement(reimbursment);
		return enList;
	}

	
	
}