package com.test.demomybatis.api;

import com.test.demomybatis.pojo.Student;
import com.test.demomybatis.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentApi {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/updateStudentsByIdAndName", method = RequestMethod.POST)
    public int updateStudentsByIdAndName(@RequestBody List<Student> list) {
        Student stu = null;
        for (Student student : list) {
            stu = student;
        }
        return studentService.updateStudentsByIdAndName(stu);
    }
}
