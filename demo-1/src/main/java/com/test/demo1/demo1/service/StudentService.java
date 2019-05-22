package com.test.demo1.demo1.service;

import com.test.demo1.demo1.pojo.Student;

import java.util.List;

public interface StudentService {
    int updateStudentsByIdAndName(List<Student> list);
}
