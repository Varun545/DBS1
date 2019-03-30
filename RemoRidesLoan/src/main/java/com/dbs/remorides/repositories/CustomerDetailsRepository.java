package com.dbs.remorides.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbs.remorides.model.CustomerDetails;



@Repository
public interface CustomerDetailsRepository extends CrudRepository<CustomerDetails, Long> {

}
