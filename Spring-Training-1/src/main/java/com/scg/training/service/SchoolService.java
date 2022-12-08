package com.scg.training.service;

import java.util.List;

import com.scg.training.vo.SchoolVO;

public interface SchoolService {

	String saveSchool(String city) throws InterruptedException;

	List<SchoolVO> getSchool();

	SchoolVO getSchoolById(int id);

	SchoolVO getBySchoolName(String name);

	String deleteSchool(int id);

	SchoolVO updateShoolById(SchoolVO departmentVo);

	List<SchoolVO> searchBySchoolName(String name);

}
