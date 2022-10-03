package com.tenzin.model;

import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.function.Function;

@Repository
public interface CompanyRepository extends JpaRepository<Company,Long> {

    Optional<Company> findCompanyById(Long ID);
    //Query
    //@Query("select c from company c where c.company_name=?1")
   // Optional<Company>findByCompanyName(String company_name);


}

