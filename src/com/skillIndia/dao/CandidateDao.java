package com.skillIndia.dao;

import org.springframework.stereotype.Repository;

import com.skillIndia.model.Candidate;

@Repository
public interface CandidateDao {

	public void addCandidate(Candidate candidate);
	
}
