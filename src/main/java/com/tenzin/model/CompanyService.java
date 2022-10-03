package com.tenzin.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    private CompanyRepository companyRepository;
    @Autowired
    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }
    public List<Company> getCompanies(){
        return companyRepository.findAll();
    }
    public void addNewCompany(Company company){
        Optional<Company> companyOptional = companyRepository.findCompanyById(company.getId());
        if(companyOptional.isPresent())
            throw new IllegalStateException("id already taken");
        companyRepository.save(company);
       // System.out.println(company);

    }
    public void deleteCompany(Long companyId){
        boolean exists = companyRepository.existsById(companyId);
        if(!exists){
            throw new IllegalStateException("company with id "+companyId+" does not exits");
        }
        companyRepository.deleteById(companyId);
    }
    @Transactional
    public void updateCompany(Long companyId,int salaryAnnually){
        Company company = companyRepository.findById(companyId)
                .orElseThrow(()->new IllegalStateException("company with id "+companyId+" does not exists"));
        if(salaryAnnually>=0 && salaryAnnually!=company.getSalary_annually())
            company.setSalary_annually(salaryAnnually);
    }
}
