package com.d0lbangi.carinfo.service;

import com.d0lbangi.carinfo.domain.Company;
import com.d0lbangi.carinfo.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.*;
import java.util.Date;
import java.util.List;

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

    public void saveAll(List<Company> companyList) {
        companyRepository.saveAll(companyList);
    }

    public Page<Company> getCompanyPage(Pageable pageable) {

        int page= (pageable.getPageNumber() == 0) ? 0 : (pageable.getPageNumber() -1);
        pageable = PageRequest.of(page, 10, Sort.by(Sort.Direction.DESC, "id"));

        return companyRepository.findAll(pageable);
    }

    public List<Company> findAll() {
        return companyRepository.findAll();
    }

    public Company find(Long companyId) {
        return companyRepository.findById(companyId).get();
    }
}
