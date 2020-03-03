package com.cts.project.companyservice;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins="*")
@RestController
public class CompanyRestController {
	@Autowired
	CompanyRepo cr;

	@GetMapping("/company")
	public List<Company> findAll() {
		return cr.findAll();
	}

	@GetMapping("/company/{id}")
	public Company findOne(@PathVariable int id) {
		Optional<Company> comp = cr.findById(id);
		Company company = comp.get();
		return company;
	}

	@PostMapping("/company")
	public Company save(@RequestBody Company comp) {
		Company company = cr.save(comp);
		return company;
	}

	@DeleteMapping("/company/{id}")
	public void delete(@PathVariable int id) {
		cr.deleteById(id);
	}

	@PutMapping("/company")
	public Company update(@RequestBody Company comp) {
		Company company = cr.save(comp);
		return company;
	}
}
