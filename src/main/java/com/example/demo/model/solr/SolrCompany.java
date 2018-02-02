package com.example.demo.model.solr;

import lombok.Getter;
import lombok.Setter;
import org.apache.solr.client.solrj.beans.Field;
import org.springframework.data.solr.core.mapping.SolrDocument;

import java.util.List;

@Setter@Getter
@SolrDocument(solrCoreName = "xy_company")
public class SolrCompany {
    @Field("id")
    private String id;                                 //企业Id
    @Field("companyName_txt")
    private String companyName;                    //企业名称
    @Field("count_s")
    private String count_s;                            //企业成员数
    @Field("logo_s")
    private String logo_s;                             //企业logo
    @Field("authenticateStatus_s")
    private String authenticateStatus_s;            //企业认证状态
    @Field("workstageId_is")
    List<Integer> workstageId_is;                   //社区id

}
