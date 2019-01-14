package com.skillIndia.dao;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
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

	@Override
	public boolean verifyCandidate(String EmailId, String newPassword) {
		Session session = this.sessionFactory.openSession();
		String query = "from Candidate where EmailId=:EmailId and newPassword=:newPassword";
		System.out.println("query");
		org.hibernate.Query q = session.createQuery(query);
		q.setString("EmailId", EmailId);
		q.setString("newPassword", newPassword);
		List<Candidate> candidateList = q.list();
		if(candidateList.size()==0) {
		return false;
		}
		session.close();
		return true;
	}

}
