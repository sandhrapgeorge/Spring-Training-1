package com.scg.training.feignUtil;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "javadesignpatternservice", url = "http://localhost:8084/BDP")

public interface JavaDesignPatternService {

	@GetMapping("/state")
	String stateDesign();

	@GetMapping("/strategy")
	String strategyDesign();

	@GetMapping("/template")
	String templateDesign();

	@GetMapping("/visitor")
	String visitorDesign();
}
