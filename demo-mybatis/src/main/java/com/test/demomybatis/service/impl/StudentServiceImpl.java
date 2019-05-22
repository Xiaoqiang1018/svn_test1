package com.test.demomybatis.service.impl;

import com.test.demomybatis.dao.StudentDAO;
import com.test.demomybatis.pojo.Student;
import com.test.demomybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDAO studentDAO;

    @Override
    public int updateStudentsByIdAndName(Student p) {
        return studentDAO.updateStudentsByIdAndName(p);
    }
}
