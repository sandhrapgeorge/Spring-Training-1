package com.scg.training.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController3 {
//@request header

//	@GetMapping("testing/double")
//	public String doubleNumber(@RequestHeader("my-number") final int myNumber) {
//		return "Number is : " + myNumber;
//	}

//	@GetMapping("/testing/list")
//	public String getBaseUrl(@RequestHeader final HttpHeaders headers) {
//		System.out.println("host :" + headers.getHost());
//		return "hi";
//	}

//	@GetMapping("testing/list")
//	public String listAllHeaders(@RequestHeader final Map<String, String> headers) {
//
//		headers.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
//		return ("number of header contents" + headers.size());
//
//	}

//	@GetMapping("testing/list")
//	public ResponseEntity<String> evaluateDefaultHeaderValue(
//			@RequestHeader(value = "my-number", defaultValue = "3600") final int optionalHeader) {
//		// return new ResponseEntity<>(String.format("Optional Header is %d",
//		// optionalHeader), HttpStatus.OK);
//		return ResponseEntity.ok().body(String.format("Optional Header is %d", optionalHeader));
//	}

	@GetMapping("/response-header")
	public ResponseEntity<String> usingResponseEntityBuilderAndHttpHeaders() {
		final HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.set("school", "mar basil");
		responseHeaders.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));
		return ResponseEntity.ok().headers(responseHeaders).body("Response with header using ResponseEntity");
	}
}
