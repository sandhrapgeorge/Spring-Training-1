package com.scg.training.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.scg.training.aop.ExecutionTime;
import com.scg.training.feignUtil.JavaDesignPatternService;
import com.scg.training.feignUtil.StudentServiceFeign;
import com.scg.training.vo.StudentVO;

@RestController
@RequestMapping("feign")
public class FeignController {

	@Autowired
	JavaDesignPatternService javaDesignPatternService;

	@Autowired
	StudentServiceFeign studentService1;

	@GetMapping("/state-pattern")
	public String stateDesign() {
		return javaDesignPatternService.stateDesign();
	}

	@GetMapping("/strategy-pattern")
	public String strategyDesign() {
		return javaDesignPatternService.strategyDesign();
	}

	@GetMapping("/template-pattern")
	public String templateDesign() {
		return javaDesignPatternService.templateDesign();
	}

	@GetMapping("/visitor-pattern")
	public String visitorDesign() {
		return javaDesignPatternService.visitorDesign();
	}

	@GetMapping("/student-record")
	@ExecutionTime
	List<StudentVO> getStudentsRecords() throws InterruptedException {
		return studentService1.getStudents();

	}

}
