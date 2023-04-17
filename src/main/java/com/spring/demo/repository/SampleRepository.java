package com.spring.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.*;
import com.spring.demo.model.SampleModel;
@Repository
public interface SampleRepository extends JpaRepository<SampleModel,Integer>{

}
