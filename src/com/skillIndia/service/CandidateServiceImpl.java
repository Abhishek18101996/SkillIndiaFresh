package com.skillIndia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillIndia.dao.CandidateDao;
import com.skillIndia.model.Candidate;

@Service
public class CandidateServiceImpl implements CandidateService{

	@Autowired
	CandidateDao candidateDaoObject;
	
	public void setCandidateDaoObject(CandidateDao candidateDaoObject) {
		this.candidateDaoObject = candidateDaoObject;
	}

	@Override
	public void addCandidate(Candidate candidate) {
		candidateDaoObject.addCandidate(candidate);
	}

}
