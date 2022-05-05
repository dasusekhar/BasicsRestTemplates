package com.example.aop.service;

import java.util.List;

import com.example.aop.Vo.RestTemplateVo;
import com.example.aop.Vo.User;
import com.example.aop.entity.Company;

public interface CompanyService {

	RestTemplateVo getAllByIds(long companyId);



	Company saveCom(Company company);



	List<User> getAllIn();

	

}
