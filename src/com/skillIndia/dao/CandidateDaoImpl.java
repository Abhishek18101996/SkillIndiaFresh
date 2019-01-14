package com.skillIndia.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.skillIndia.model.Candidate;

@Repository
public class CandidateDaoImpl implements CandidateDao{

	static Transaction tcx;
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sf) {
	this.sessionFactory = sf;
    }
    
	@Override
	public void addCandidate(Candidate candidate) {
		Session session = this.sessionFactory.openSession();
		tcx = session.beginTransaction();
		System.out.println(candidate);
		session.save(candidate);
		tcx.commit();
		session.close();
	}

}
