package com.socialj.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.socialj.repository.socialjInfoRespository;
import com.socialj.exception.ResourceNotFoundException;
import com.socialj.model.socialjinfo;

@RestController
@RequestMapping("/api")
public class socialjInfoController {
	
	@Autowired
	private socialjInfoRespository sjrep;
	
	@GetMapping("/title/{id}")
	public socialjinfo getTitleDescByID(@PathVariable(value="id") Integer id) {
		//TODO: return title and description
		return sjrep.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("socialjInfo", "id", id));
	}
	
	@PostMapping("/newtitle")
	public socialjinfo createSocialjinfo(@Valid @RequestBody socialjinfo socialjinfo) {
		return sjrep.save(socialjinfo);
	}
	
	@GetMapping("/titles")
	public List<socialjinfo> getAllTitles(){
		return sjrep.findAll();
	}
}
