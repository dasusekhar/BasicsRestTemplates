package com.example.aop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.aop.Vo.RestTemplateVo;
import com.example.aop.Vo.User;
import com.example.aop.entity.Company;
import com.example.aop.service.CompanyService;

@RestController
@RequestMapping("/coms")
public class CompanyController {
	@Autowired
	private CompanyService companyService;
	@GetMapping("/getByIds/{companyId}")
	public ResponseEntity<?> getAllInfos(@PathVariable long companyId)
	{
		RestTemplateVo getas=companyService.getAllByIds(companyId);
		return new ResponseEntity<>(getas,HttpStatus.OK);
	}
	/*
	@GetMapping("/getAllUsers")
	public ResponseEntity<?> getAllInfoss()
	{
		RestTemplateVo getass=companyService.getAll();
		return new ResponseEntity<>(getass,HttpStatus.OK);
	}
	*/
	@PostMapping("/save")
	public ResponseEntity<?> saveCompany(@RequestBody Company company)
	{
		Company save=companyService.saveCom(company);
		return new ResponseEntity<>(save,HttpStatus.OK);
	}
	@GetMapping("/getSo")
	public ResponseEntity<List<?>>getA()
	{
		List<User> users=companyService.getAllIn();
		return new ResponseEntity<>(users,HttpStatus.ACCEPTED);
	}
	

}
