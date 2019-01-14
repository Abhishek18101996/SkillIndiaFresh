package com.skillIndia.service;

import org.springframework.stereotype.Service;

import com.skillIndia.model.Candidate;

@Service
public interface CandidateService {

	public void addCandidate(Candidate candidate);
	
}
