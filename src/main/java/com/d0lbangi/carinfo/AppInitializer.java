package com.d0lbangi.carinfo;

import com.d0lbangi.carinfo.domain.Company;
import com.d0lbangi.carinfo.service.CompanyService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class AppInitializer {


	@Autowired
	CompanyService companyService;

	@PostConstruct
	private void init(){

		Company company = new Company();
		company.setUpdatedAt(new Date());
		company.setCreatedAt(new Date());
		company.setCompanyNation("이탈리아");
		company.setCompanyName("페라리");

		Company company1 = new Company();
		company1.setUpdatedAt(new Date());
		company1.setCreatedAt(new Date());
		company1.setCompanyNation("이탈리아");
		company1.setCompanyName("람보르기니");

		Company company2 = new Company();
		company2.setUpdatedAt(new Date());
		company2.setCreatedAt(new Date());
		company2.setCompanyNation("독일");
		company2.setCompanyName("BMW");

		Company company3 = new Company();
		company3.setUpdatedAt(new Date());
		company3.setCreatedAt(new Date());
		company3.setCompanyNation("한국");
		company3.setCompanyName("현대");

		companyService.save(company);
		companyService.save(company1);
		companyService.save(company2);
		companyService.save(company3);

	}
}
