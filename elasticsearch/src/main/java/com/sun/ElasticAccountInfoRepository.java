package com.sun;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ElasticAccountInfoRepository extends ElasticsearchRepository<AccountInfo,String> {
    //TODO define the search
    AccountInfo findByAccountName(String accountName);



}