package com.rannaghar.web.service;

import com.rannaghar.web.dto.EmployeeDto;
import com.rannaghar.web.model.City;
import com.rannaghar.web.model.Employee;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
@Service
public class EmployeeService {
	
	private final JdbcTemplate jdbcTemplate;
	
	public EmployeeService(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate=jdbcTemplate;
	}
	
	
    
    public void save(EmployeeDto employeeDto,City city){
    	String insertStatement = "INSERT INTO tbl_employee(uuid,"
    			+ " first_name,"
    			+ " last_name,"
    			+ "email,"
    			+ "age,"
    			+ "gender,"
    			+ "city_uuid)\n" + 
    			"VALUES (?, ?, ?, ?, ?, ?, ?);";
    	
    	Employee employee = new Employee();
        BeanUtils.copyProperties(employeeDto, employee);
        employee.setCity_uuid(city.getId());
        
        jdbcTemplate.update(insertStatement,
        		employee.getId(),
        		employee.getFirstName(),
        		employee.getLastName(),
        		employee.getEmail(),
        		employee.getAge(),
        		employee.getGender(),
        		employee.getCity_uuid());
        
    }
}
