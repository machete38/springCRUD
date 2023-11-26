package com.machete38.springCRUD.dao;

import com.machete38.springCRUD.model.Employee;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    private EntityManager entityManager;
    @Override
    public List<Employee> get() {
       Session currentSession = entityManager.unwrap(Session.class);
       Query<Employee> query = currentSession.createQuery("from Employee",Employee.class);
       List<Employee> list = query.getResultList();
       return list;
    }

    @Override
    public Employee get(int id) {
        return null;
    }

    @Override
    public void save(Employee emp) {
       Session currentSession = entityManager.unwrap(Session.class);
       currentSession.save(emp);
    }

    @Override
    public void delete(int id) {

    }
}
