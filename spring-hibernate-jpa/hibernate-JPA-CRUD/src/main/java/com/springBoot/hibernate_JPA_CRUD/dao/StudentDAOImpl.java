package com.springBoot.hibernate_JPA_CRUD.dao;

import com.springBoot.hibernate_JPA_CRUD.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class StudentDAOImpl implements StudentDAO{

    //define the field for entity manager

   private EntityManager entityManager;
    //Inject the entity manager
    @Autowired
    public void StudentDAOImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    //implement save method

    @Override
    @Transactional
    public void save(Student student){
        entityManager.persist(student);
    }

    @Override
    public Student findById(Integer id) {
        return entityManager.find(Student.class,1);
    }


    @Override
    public List<Student> findAll() {
       //create a query

        TypedQuery<Student> theQuery=entityManager.createQuery("FROM Student order by last_name desc",Student.class);

        //return query results
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String theLastName) {
        //create a query
        TypedQuery<Student> theQuery= entityManager.createQuery("FROM Student WHERE last_name=:theData",Student.class);

        //set query paraameter
        theQuery.setParameter("theData",theLastName);

        //return query results

        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student student) {
        entityManager.merge(student);
    }

    @Override
    @Transactional
    public void delete(Integer id) {

        //retrieve the student
        Student st=entityManager.find(Student.class,id);
        //delete the student
        entityManager.remove(st);
    }

    @Override
    @Transactional
    public int deleteAll() {
        int no=entityManager.createQuery("DELETE FROM Student").executeUpdate();
        return no;

    }
}
