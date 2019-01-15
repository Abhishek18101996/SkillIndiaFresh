package com.skillIndia.dao;

import com.skillIndia.model.Institution;

public interface InstitutionDao {

	public void addInstitution(Institution p);//insert
	public void updateInstitution(Institution p);//update/modify
	public void removeInstitutionByName(String name);//delete/remove
	public Institution getInstitutionByName(String institutionName);
	
	
}
