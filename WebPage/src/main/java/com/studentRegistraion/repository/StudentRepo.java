package com.studentRegistraion.repository;

import org.springframework.data.repository.CrudRepository;

import com.studentRegistraion.model.StudentRegistraion;

public interface StudentRepo extends CrudRepository<StudentRegistraion, Long>{

}
