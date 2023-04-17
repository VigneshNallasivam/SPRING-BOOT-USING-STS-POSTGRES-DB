package com.spring.demo;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
public class SampleApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(SampleApplication.class, args);
	}

}
