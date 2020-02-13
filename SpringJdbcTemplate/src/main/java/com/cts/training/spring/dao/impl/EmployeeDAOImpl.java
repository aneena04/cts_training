package com.cts.training.spring.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

import com.cts.training.spring.dao.EmployeeDAO;
import com.cts.training.spring.model.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {

	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean saveEmployee(Employee employee) {

		String query = "insert into employee values(?,?,?,?)";
		try {
			jdbcTemplate.update(query, employee.getId(), employee.getName(), employee.getEmail(), employee.getSalary());
			return true;
		} catch (DataAccessException e) {
			e.printStackTrace();
			return false;
		}

	}

	public boolean updateEmployee(Employee employee) {
		String query = "update employee set name=?,email=?,salary=? where id =?";
				try {
				jdbcTemplate.update(query, employee.getName(), 
				employee.getEmail(),employee.getSalary(), employee.getId());
				return true;
				}
				catch (DataAccessException e) {
				e.printStackTrace();
				
				return false;
				}
	}

	public boolean deleteEmployee(Employee employee) {
		String query = "delete from employee where id =?";
		try {
		jdbcTemplate.update(query, employee.getId());
		return true;
		} catch (DataAccessException e) {
		e.printStackTrace();
		return false;
		}

	}

	public Employee getEmployeeById(int id) {
		String query = "select * from employee where id = ?";
		RowMapper<Employee> rowMapper = new BeanPropertyRowMapper<Employee>(Employee.class);
		return jdbcTemplate.queryForObject(query, rowMapper, id);

	}

	public List<Employee> getAllEmployees() {
		return jdbcTemplate.query("select * from employee", new ResultSetExtractor<List<Employee>>()
		{
		public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		List<Employee> list = new ArrayList<Employee>();
		while (rs.next()) {
		Employee employee = new Employee();
		employee.setId(rs.getInt(1));
		employee.setName(rs.getString(2));
		employee.setEmail(rs.getString(3));
		employee.setSalary(rs.getLong(4));
		list.add(employee);
		}
		return list;
		}
		});
	}

}
