package com.scg.training.service;

import java.util.List;

import com.scg.training.vo.SchoolVO;

public interface SchoolService {

	SchoolVO saveSchool(SchoolVO departmentVo);

	List<SchoolVO> getSchool();

	SchoolVO getSchoolById(int id);

	SchoolVO findBySchoolName(String name);

	String deleteSchool(int id);

	SchoolVO updateShoolById(SchoolVO departmentVo);

}
