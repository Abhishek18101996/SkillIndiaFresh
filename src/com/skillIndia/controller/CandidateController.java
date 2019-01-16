package com.skillIndia.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.skillIndia.model.Candidate;
import com.skillIndia.service.CandidateService;

@Controller
@SessionAttributes({"candidate","EmailId","logincandidate","loginEmailId","loginNewPassword"})
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
	
	//To add a Candidate
	@RequestMapping(value="/CanLogin",method=RequestMethod.POST)
	public String validateCandidateRegistration(@ModelAttribute("candidate")@Valid Candidate candidate,
			BindingResult result, Model model,HttpSession session) {
		System.out.println("result"+result.toString());
		if(!result.hasErrors()) {
			//New Candidate add it 	
			candidateServiceObject.addCandidate(candidate);
			session.setAttribute("EmailId", candidate.getEmailId());
			session.setAttribute("candidate", candidate);
			System.out.println(candidate);
			}
			return "CandidateLogin";
	}
	
	@RequestMapping(value = "/candidatelogin")
	public String LoginPage(Model model,HttpSession session) {
		
		model.addAttribute("candidate", new Candidate());
		return "CandidateLogin";
	}

	
	@RequestMapping(value="/CandidateDashboard")
	public ModelAndView validateCandidateLogin(@Valid @ModelAttribute("candidate") Candidate candidate,
			BindingResult bindingResult, Model model, HttpSession session,HttpServletRequest request) {
		ModelAndView mav = new ModelAndView();
		String EmailId = request.getParameter("username");
		String newPassword = request.getParameter("password");
		if(candidateServiceObject.verifyCandidate(EmailId, newPassword)) {
			System.out.println("Login success");
			Candidate sessionCandidate = this.candidateServiceObject.returnCandidate(candidate);
			System.out.println("object");
			session.setAttribute("logincandidate", sessionCandidate);
			session.setAttribute("loginEmailId", candidate.getEmailId());
			session.setAttribute("loginNewPassword", candidate.getNewPassword());
			System.out.println(" "+session.getAttribute("EmailId"));
			System.out.println(" "+session.getAttribute("NewPassword"));
			System.out.println(" "+session.getAttribute("UserId"));
			mav.addObject("UserId", candidate.getUserId());
			mav.setViewName("CandidateDashboard");
			System.out.println("session not created");
	}
		
		else {
			mav.setViewName("error");
		}
		return mav;
	
}
}