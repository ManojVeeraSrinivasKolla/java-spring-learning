package com.springBoot.hibernate_JPA_CRUD.dao;

import com.springBoot.hibernate_JPA_CRUD.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student student);

    Student findById(Integer id);

    List<Student> findAll();
    List<Student> findByLastName(String theLastName);
    void update(Student student);

    void  delete(Integer id);

    int deleteAll();

}
