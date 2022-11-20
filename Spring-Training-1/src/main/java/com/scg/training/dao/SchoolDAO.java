package com.scg.training.dao;

import java.util.List;

import com.scg.training.entity.School;
import com.scg.training.vo.SchoolVO;

public interface SchoolDAO {
	String saveSchool(School school);

	void update(int i);

	void readRecord();

	SchoolVO getBySchoolName(String name);

	List<SchoolVO> searchBySchoolName(String name);

}
