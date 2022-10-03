package com.tenzin.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table
public class Company {
    @Id
    @SequenceGenerator(
            name="company_sequence",
            sequenceName = "company_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "company_sequence"
    )
    private Long id;
    private String company_name;
    private String location;
    private String job_title;
    private String contract_type;
    private int salary_annually;
    private int salary_hourly;
    private String recruiter_company;
    private String recruiter_name;
    private LocalDate date_entry;
    public Company(){

    }
    public Company(Long id, String company_name, String location, String job_title, String contract_type, int salary_annually, int salary_hourly, String recruiter_company, String recruiter_name, LocalDate date_entry) {
        this.id = id;
        this.company_name = company_name;
        this.location = location;
        this.job_title = job_title;
        this.contract_type = contract_type;
        this.salary_annually = salary_annually;
        this.salary_hourly = salary_hourly;
        this.recruiter_company = recruiter_company;
        this.recruiter_name = recruiter_name;
        this.date_entry = date_entry;
    }

    public Company(String company_name, String location, String job_title, String contract_type, int salary_annually, int salary_hourly, String recruiter_company, String recruiter_name, LocalDate date_entry) {
        this.company_name = company_name;
        this.location = location;
        this.job_title = job_title;
        this.contract_type = contract_type;
        this.salary_annually = salary_annually;
        this.salary_hourly = salary_hourly;
        this.recruiter_company = recruiter_company;
        this.recruiter_name = recruiter_name;
        this.date_entry = date_entry;
    }

    public Long getId() {
        return id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getLocation() {
        return location;
    }

    public String getJob_title() {
        return job_title;
    }

    public String getContract_type() {
        return contract_type;
    }

    public int getSalary_annually() {
        return salary_annually;
    }

    public int getSalary_hourly() {
        return salary_hourly;
    }

    public String getRecruiter_company() {
        return recruiter_company;
    }

    public String getRecruiter_name() {
        return recruiter_name;
    }

    public LocalDate getDate_entry() {
        return date_entry;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setJob_title(String job_title) {
        this.job_title = job_title;
    }

    public void setContract_type(String contract_type) {
        this.contract_type = contract_type;
    }

    public void setSalary_annually(int salary_annually) {
        this.salary_annually = salary_annually;
    }

    public void setSalary_hourly(int salary_hourly) {
        this.salary_hourly = salary_hourly;
    }

    public void setRecruiter_company(String recruiter_company) {
        this.recruiter_company = recruiter_company;
    }

    public void setRecruiter_name(String recruiter_name) {
        this.recruiter_name = recruiter_name;
    }

    public void setDate_entry(LocalDate date_entry) {
        this.date_entry = date_entry;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", company_name='" + company_name + '\'' +
                ", location='" + location + '\'' +
                ", job_title='" + job_title + '\'' +
                ", contract_type='" + contract_type + '\'' +
                ", salary_annually=" + salary_annually +
                ", salary_hourly=" + salary_hourly +
                ", recruiter_company='" + recruiter_company + '\'' +
                ", recruiter_name='" + recruiter_name + '\'' +
                ", date_entry=" + date_entry +
                '}';
    }
}
