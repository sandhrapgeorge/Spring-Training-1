package com.scg.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.training.feignUtil.JavaDesignPatternService;
import com.scg.training.service.SchoolService;
import com.scg.training.vo.SchoolVO;

@RestController
@RequestMapping("schools")
public class SchoolController {
	@Autowired
	JavaDesignPatternService javaDesignPatternService;
	@Autowired
	private SchoolService schoolService;

	@PostMapping("/{city}")
	public String saveSchool(@PathVariable final String city) throws InterruptedException {
		return schoolService.saveSchool(city);

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
	public SchoolVO getBySchoolName(@PathVariable final String name) {
		return schoolService.getBySchoolName(name);
	}

	@DeleteMapping("/{id}")
	public String deleteSchool(@PathVariable final int id) {
		return schoolService.deleteSchool(id);

	}

	@PutMapping
	public String updateSchoolById(@RequestBody final SchoolVO DepartmentVo) {
		return javaDesignPatternService.stateDesign();
		// return schoolService.updateShoolById(DepartmentVo);
	}

	@GetMapping("/search/{name}")
	public List<SchoolVO> searchByName(@PathVariable final String name) {
		return schoolService.searchBySchoolName(name);
	}

}
