package com.cognizant.dao;

import java.util.List;

import com.cognizant.model.Student;

public interface StudentDao {
    public int insert();
   public List<Student> getAll();
}
