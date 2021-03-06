package com.rannaghar.web.model;

import java.util.List;

public class Employee {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private String gender;
    private String city_uuid;
    
    //private String city;
    //private String joiningDate;


    public String getCity_uuid() {
		return city_uuid;
	}

	public void setCity_uuid(String city_uuid) {
		this.city_uuid = city_uuid;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", age=" + age + ", gender=" + gender + ", city_uuid=" + city_uuid + "]";
	}



   

   
}
