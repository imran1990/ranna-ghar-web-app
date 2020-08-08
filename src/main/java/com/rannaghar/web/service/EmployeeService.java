package com.rannaghar.web.service;

import com.rannaghar.web.dto.EmployeeDto;
import com.rannaghar.web.model.City;
import com.rannaghar.web.model.Employee;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    
    public List<EmployeeDto> getEmployeeList(){
    	String query = "select e.uuid,"
    			+ "e.first_name,"
    			+ "e.last_name,"
    			+ "e.email,"
    			+ "e.age,"
    			+ "e.gender,"
    			+ "c.city_name " + 
    			"from tbl_employee e, tbl_city c " + 
    			"where e.city_uuid = c.uuid;";
    	List<Map<String, Object>> fetchedItems = jdbcTemplate.queryForList(query);
    	List<EmployeeDto> employeeDtoList = new ArrayList();
    	
    	
        
    	
    	for (Map<String, Object> item : fetchedItems) {
    		EmployeeDto employeeDto = new EmployeeDto();
    		
    		employeeDto.setId(item.get("uuid").toString());
    		employeeDto.setFirstName(item.get("first_name").toString());
    		employeeDto.setLastName(item.get("last_name").toString());
    		employeeDto.setEmail(item.get("email").toString());
    		employeeDto.setAge((Integer) item.get("age"));
    		employeeDto.setGender(item.get("gender").toString());
    		employeeDto.setCity(item.get("city_name").toString());
    		
    		employeeDtoList.add(employeeDto);
    	}return employeeDtoList;
    	
    }



	public List<EmployeeDto> findByCityName(String cityName) {
		// TODO Auto-generated method stub
		String query = "select e.uuid,e.first_name,e.last_name,e.email,e.age,e.gender,c.city_name " + 
				"from tbl_employee e, tbl_city c " + 
				"where e.city_uuid = c.uuid " + 
				"and c.city_name ilike '"+cityName+"' ;";
		
		List<Map<String, Object>> fetchedItems = jdbcTemplate.queryForList(query);
    	List<EmployeeDto> employeeDtoList = new ArrayList();
    	
    	
        
    	
    	for (Map<String, Object> item : fetchedItems) {
    		EmployeeDto employeeDto = new EmployeeDto();
    		
    		employeeDto.setId(item.get("uuid").toString());
    		employeeDto.setFirstName(item.get("first_name").toString());
    		employeeDto.setLastName(item.get("last_name").toString());
    		employeeDto.setEmail(item.get("email").toString());
    		employeeDto.setAge((Integer) item.get("age"));
    		employeeDto.setGender(item.get("gender").toString());
    		employeeDto.setCity(item.get("city_name").toString());
    		
    		employeeDtoList.add(employeeDto);
    	}
    	return employeeDtoList;
	}
   
}
