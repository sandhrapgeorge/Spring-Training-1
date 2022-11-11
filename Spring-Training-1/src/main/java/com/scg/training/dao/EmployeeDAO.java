package com.scg.training.dao;

import com.scg.training.entity.Employee;
import com.scg.training.vo.StudentVO;

public interface EmployeeDAO {

	Employee insert(StudentVO studentVO) throws Exception;

}
