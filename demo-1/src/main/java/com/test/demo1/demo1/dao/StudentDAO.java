package com.test.demo1.demo1.dao;

import com.test.demo1.demo1.pojo.Student;

import java.util.List;

public interface StudentDAO {

    /**
     * 批量更新学生信息
     *
     * @param list
     * @return
     */
    int updateStudentsByIdAndName(List<Student> list);
}
