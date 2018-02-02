package com.example.demo.dao.solr;

import com.example.demo.model.solr.SolrCompany;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface CompanyRepository extends SolrCrudRepository<SolrCompany,String> {
    List<SolrCompany> findByCompanyName(String companyName);
}
