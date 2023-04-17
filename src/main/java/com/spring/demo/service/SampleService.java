package com.spring.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.model.SampleModel;
import com.spring.demo.repository.SampleRepository;

@Service
public class SampleService 
{
	@Autowired
	SampleRepository repo;

	public SampleModel add(SampleModel sampleModel) 
	{
	  return repo.save(sampleModel);
		
	}

	public Optional<SampleModel> getByRollNumber(int rollno) 
	{
		Optional<SampleModel> model = repo.findById(rollno);
		if(repo.findById(rollno).isPresent())
		{
			return model;
		}
		else
		{
			return null;
		}
	}
	
}
