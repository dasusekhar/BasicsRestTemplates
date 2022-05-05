package com.example.aop.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.aop.Vo.RestAll;
import com.example.aop.Vo.RestTemplateVo;
import com.example.aop.Vo.User;
import com.example.aop.entity.Company;
import com.example.aop.repository.CompanyRepository;

@Service
public class CompanyServiceImpl implements CompanyService {
	@Autowired
	private CompanyRepository companyRepository;
	@Autowired
	private RestTemplate restTemplate;

	
	@Override
	public RestTemplateVo getAllByIds(long companyId) {
		RestTemplateVo vo=new RestTemplateVo();
		Company com=companyRepository.findByCompanyId(companyId);
		User user=restTemplate.getForObject("http://localhost:9091/user/getById/"+com.getId(),User.class );
		vo.setCompany(com);
		vo.setUser(user);
		
		return vo;
	}

	
		
	

	
	@Override
	public List<User> getAllIn() {
		//List<User> ge=new ArrayList<>();
	RestAll vo=new RestAll();
	User usr=new User();
		
		User user=restTemplate.getForObject("http://localhost:9091/user/getAll",User.class);
	

        vo.setUsers(usr)
		return vo;
	}





	@Override
	public Company saveCom(Company company) {
		
		return companyRepository.save(company);
	}
	

	
	
	

}
