package com.test.demo1.demo1.service.impl;

import com.test.demo1.demo1.dao.StudentDAO;
import com.test.demo1.demo1.pojo.Student;
import com.test.demo1.demo1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public int updateStudentsByIdAndName(List<Student> list) {
        return studentDAO.updateStudentsByIdAndName(list);
    }
}
