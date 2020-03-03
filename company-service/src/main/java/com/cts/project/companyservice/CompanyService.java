package com.cts.project.companyservice;

import java.util.List;


public interface CompanyService {
	public Company insert(Company companyDTO);
	public void remove(int id);
	public Company update(Company companyDTO);
	public Company getById(int id);
	public List<Company> getAll();


}
