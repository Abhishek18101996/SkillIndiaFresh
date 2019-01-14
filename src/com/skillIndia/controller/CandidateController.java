package com.skillIndia.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
		return "CandidateRegistration";
	}
	
	@RequestMapping(value="/Login",method=RequestMethod.POST)
	public String validateCandidateRegistration(@Valid @ModelAttribute("candidate") Candidate candidate,
			BindingResult bindingResult, Model model, HttpServletRequest request) {
		
		if(bindingResult.hasErrors()) {
			return "error";
		}
		else {
			candidateServiceObject.addCandidate(candidate);
			System.out.println(candidate);
			return "login";
		}
	}
	
}
