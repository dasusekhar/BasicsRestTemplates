package com.example.aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aop.entity.Company;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {

	Company findByCompanyId(long companyId);

}
