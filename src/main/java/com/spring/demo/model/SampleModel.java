package com.spring.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
public class SampleModel 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollno;
	private String firstName;
	private String lastName;
	public SampleModel(SampleModel sampleModel) 
	{
		
	}
	
	public SampleModel() 
	{
		
	}
	
	public int getRollno() 
	{
		return rollno;
	}
	
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	
	public String getFirstName() 
	{
		return firstName;
	}
	
	public void setFirstName(String firstName) 
	{
		this.firstName = firstName;
	}
	
	public String getLastName() 
	{
		return lastName;
	}
	
	public void setLastName(String lastName) 
	{
		this.lastName = lastName;
	}
	
}
