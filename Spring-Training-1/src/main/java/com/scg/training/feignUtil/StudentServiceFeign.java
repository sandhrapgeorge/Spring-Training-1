package com.scg.training.feignUtil;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.scg.training.aop.ExecutionTime;
import com.scg.training.vo.StudentVO;

@FeignClient(name = "studentservice", url = "http://localhost:8080/students")

public interface StudentServiceFeign {

	@GetMapping
	@ExecutionTime
	List<StudentVO> getStudents() throws InterruptedException;

}
