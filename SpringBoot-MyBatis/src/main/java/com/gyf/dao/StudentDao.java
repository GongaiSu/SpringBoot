package com.gyf.dao;

import com.gyf.domain.Student;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 龚燕飞
 */
@Mapper
public interface StudentDao {

    Student getIdByStudent(Integer id);
}
