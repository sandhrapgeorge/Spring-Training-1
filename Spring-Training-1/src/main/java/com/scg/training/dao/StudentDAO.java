package com.scg.training.dao;

import com.scg.training.vo.StudentVO;

//@Repository
public interface StudentDAO {

	StudentVO insert(StudentVO studentVO) throws Exception;

	StudentVO readById(int id) throws Exception;

	StudentVO update(StudentVO studentVO) throws Exception;
}
