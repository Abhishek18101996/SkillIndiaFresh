package com.skillIndia.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.tomcat.jni.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.skillIndia.model.BankDetails;
import com.skillIndia.model.Candidate;
import com.skillIndia.service.CandidateService;

@Controller
public class CandidateController {

	@Autowired
	CandidateService candidateServiceObject;

	public void setCandidateServiceObject(CandidateService candidateServiceObject) {
		this.candidateServiceObject = candidateServiceObject;
	}
	
	@RequestMapping("/CandidateRegistration")
	public String showRegPage(Model model) {
		model.addAttribute("candidate", new Candidate());
		/*model.addAttribute("address", new Address());
		model.addAttribute("bankDetails", new BankDetails());*/
		return "CandidateRegistration";
	}
	
	@RequestMapping(value="/Login",method=RequestMethod.POST)
	public String validateCandidateRegistration(@ Valid @ModelAttribute("candidate") Candidate candidate,
			BindingResult result, Model model, HttpServletRequest request) {
			candidateServiceObject.addCandidate(candidate);
			System.out.println(candidate);
			return "login";
	}
	
	@RequestMapping(value="/CandidateDashboard",method=RequestMethod.POST)
	public String validateCandidateLogin(@Valid @ModelAttribute("candidate") Candidate candidate,
			BindingResult bindingResult, Model model, HttpServletRequest request) {
		String candidateUserId = request.getParameter("username");
		String candidatePassword = request.getParameter("password");
		if(candidateServiceObject.verifyCandidate(candidateUserId, candidatePassword)) {
		return "CandidateDashboard";
	}
		return "error";
	
}
}