package com.spring.demo.controller;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.spring.demo.model.SampleModel;
import com.spring.demo.service.SampleService;

@RestController
@RequestMapping("/home")
public class SampleController 
{
	@Autowired
	SampleService service;
	
	@GetMapping("/get")
	public String greet(SampleModel sampleModel)
	{
		return "<h1>Good Morning</h1>"+" "+sampleModel.getFirstName()+" "+sampleModel.getLastName();
	
	}
	
	@PostMapping("/post")
    public SampleModel insert(@RequestBody SampleModel sampleModel)
    {
		SampleModel model = service.add(sampleModel);
		return model;
    }
	
	@GetMapping("/getByRollNo/{rollno}")
	public Optional<SampleModel> getByRollNo(@PathVariable int rollno)
	{
		Optional<SampleModel> model = service.getByRollNumber(rollno);
		return model;
	}
}
