package com.d0lbangi.carinfo.service;

import com.d0lbangi.carinfo.domain.Company;
import com.d0lbangi.carinfo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    @Transactional
    public Company saveCompanyInputDto(CompanyInputDto companyInputDto) {

        Company company = new Company();
        company.setCompanyName(companyInputDto.getCompanyName());
        company.setCompanyNation(companyInputDto.getCompanyNation());
        company.setCreatedAt(new Date());
        company.setUpdatedAt(new Date());

        return companyRepository.save(company);
    }

    public Company save(Company company) {
        return companyRepository.save(company);
    }
}
