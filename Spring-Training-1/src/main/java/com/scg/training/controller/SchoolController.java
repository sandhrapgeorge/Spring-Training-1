package com.scg.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.scg.training.service.SchoolService;
import com.scg.training.vo.SchoolVO;

public class SchoolController {

	@Autowired
	private SchoolService schoolService;

	@PostMapping
	public SchoolVO saveSchool(@RequestBody final SchoolVO departmentVo) {
		return schoolService.saveSchool(departmentVo);

	}

	@GetMapping
	public List<SchoolVO> getDepartment() {
		return schoolService.getSchool();

	}

	@GetMapping("/id/{id}")
	public SchoolVO getSchoolById(@PathVariable final int id) {
		return schoolService.getSchoolById(id);

	}

	@GetMapping("/name/{name}")
	public SchoolVO findByName(@PathVariable final String name) {
		return schoolService.findBySchoolName(name);
	}

	@DeleteMapping("/{id}")
	public String deleteSchool(@PathVariable final int id) {
		return schoolService.deleteSchool(id);

	}

	@PutMapping
	public SchoolVO updateSchoolById(@RequestBody final SchoolVO DepartmentVo) {
		return schoolService.updateShoolById(DepartmentVo);
	}

}
