package com.d0lbangi.carinfo.Controller;

import com.d0lbangi.carinfo.domain.Car;
import com.d0lbangi.carinfo.domain.Company;
import com.d0lbangi.carinfo.service.CarInputDto;
import com.d0lbangi.carinfo.service.CarService;
import com.d0lbangi.carinfo.service.CompanyInputDto;
import com.d0lbangi.carinfo.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class BasicController {

    @Autowired
    CompanyService companyService;
    @Autowired
    CarService carService;

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

    @RequestMapping("/companyList")
    public String companyList(@PageableDefault Pageable pageable, Model model) {
        Page<Company> companyList = companyService.getCompanyPage(pageable);
        model.addAttribute("companyList", companyList);
        return "companyList";
    }

    @RequestMapping("/carForm")
    public String saveCar(@ModelAttribute(name="carInputDTO") CarInputDto carInputDto, Model model) {
        carService.saveCarInputDto(carInputDto);
        return "index";
    }

    @RequestMapping("/carList")
    public String carList(@PageableDefault Pageable pageable, Model model) {
        Page<Car> carList = carService.getCarPage(pageable);
        model.addAttribute("carList", carList);
        return "carList";
    }

    @RequestMapping("/carListNopage")
    public String carListNoPage(Model model) {
        List<Car> carList = carService.getCarList();
        model.addAttribute("carList", carList);
        return "carListNoPage";
    }
}
