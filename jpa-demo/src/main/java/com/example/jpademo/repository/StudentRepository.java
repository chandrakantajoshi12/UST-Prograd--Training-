package com.example.jpademo.repository;

import com.example.jpademo.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;
//Controller ---Service---Repository---> Database
// Controller can not connect with database with  the help of repository we can connect with database to controller

//Service -- it is not advies to you to use repository directly to the controller


public  interface StudentRepository extends  JpaRepository<Student,Long>{
}

