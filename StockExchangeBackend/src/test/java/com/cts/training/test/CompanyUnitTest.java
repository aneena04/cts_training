package com.cts.training.test;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.training.dao.CompanyDAO;
import com.cts.training.model.Company;
import com.cts.training.model.User;

public class CompanyUnitTest {

	private static AnnotationConfigApplicationContext context;
	@Autowired
	private static CompanyDAO companyDAO;
	private static Company company;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.cts.training");
		context.refresh();
		company = (Company) context.getBean("company");
		companyDAO = (CompanyDAO) context.getBean("companyDAO");

	}

	@Test
	public void test_update_company_success() {
		Company c = companyDAO.getCompanyById(101);
		c.setCeoName("Abdus Saboor");
		assertEquals(true, companyDAO.updateCompany(c));
	}

	/*
	 * @Test public void test_add_company() { Company c = new Company(35, "HDFC",
	 * "banking", "hameemsha", 674757734687.0); assertEquals(true,
	 * companyDAO.saveCompany(c)); }
	 */

	@Test
	public void testGetAllCompanies() {
		List<Company> company = companyDAO.getAllCompanies();
		assertEquals(2, company.size());
	}

//	@Test
//	public void testDeleteCompany() {
//		Company c1= companyDAO.getCompanyById(111);
//		assertEquals(true, companyDAO.daleteCompany(c1));
//	}
//
//	@Test(expected = NullPointerException.class)
//	public void testDeleteUserFail() {
//		Company c = companyDAO.getCompanyById(66);
//		assertEquals(true, companyDAO.daleteCompany(c));
//	}
//
	@Test
	public void testGetCompanyById() {
		Company c = companyDAO.getCompanyById(35);
		assertEquals("hameemsha", c.getCeoName());
	}
}
