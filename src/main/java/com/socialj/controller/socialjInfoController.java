package com.socialj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.socialj.repository.socialjInfoRespository;
import com.socialj.model.socialjInfo;

@RestController
public class socialjInfoController {
	
	@Autowired
	private socialjInfoRespository sjrep;
	
	@GetMapping("/home")
	public socialjInfo getTitleDesc() {
		//TODO: return title and description
		return null;
	}
}
