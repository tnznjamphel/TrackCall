package com.tenzin.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping(path="api/v1/company")
public class CompanyController {
    private final CompanyService companyService;
    @Autowired
    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<Company> getCompanies(){
        return companyService.getCompanies();
    }
    @PostMapping
    public void registerNewCompany(@RequestBody  Company company){
        companyService.addNewCompany(company);
    }
    @DeleteMapping(path="{companyId}")
    public void deleteCompany(@PathVariable("companyId")Long companyId){
        companyService.deleteCompany(companyId);
    }
    @PutMapping(path = "{companyId}")
    public void updateStudent(
            @PathVariable("companyId")Long companyId,
            @RequestParam(required = false)String salaryAnnually){
        int salary =   Integer.parseInt(salaryAnnually);
        companyService.updateCompany(companyId,salary);
    }
}
