package com.d0lbangi.carinfo.Controller;

import com.d0lbangi.carinfo.service.CompanyInputDto;
import com.d0lbangi.carinfo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class BasicController {

    @Autowired
    CompanyService companyService;

    @RequestMapping("/")
    public String index(Model model) {
        return "index";
    }

    @RequestMapping("/companyForm")
    public String companyForm(Model model) {
        return"companyForm";
    }

    @RequestMapping("saveCompany")
    public String saveCompany(@ModelAttribute(name = "companyInputDTO")CompanyInputDto companyInputDto, Model model) {
        companyService.saveCompanyInputDto(companyInputDto);

        return "index";
    }
}
