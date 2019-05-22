package com.test.demomybatis.dao;

import com.test.demomybatis.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

public interface StudentDAO {

    /**
     * 批量更新学生信息
     *
     * @param list
     * @return
     */
//    int updateStudentsByIdAndName(List<Student> list);

    int updateStudentsByIdAndName(Student param);

    int deleteByidsAndNames(List<Map<String, Object>> list);

}
