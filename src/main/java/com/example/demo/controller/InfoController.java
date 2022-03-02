package com.example.demo.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.controller.service.InfoService;
import com.example.demo.request.InfoRequest;
import com.example.demo.response.InfoResponse;

@RestController
public class InfoController {
	@Autowired
	InfoService service;

	@PostMapping("/bfhl")
	public InfoResponse getInformation(@RequestBody InfoRequest req) {
		return service.getInformation(req);
	}
}
