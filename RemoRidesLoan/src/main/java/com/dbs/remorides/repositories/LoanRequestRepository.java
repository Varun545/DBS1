package com.dbs.remorides.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbs.remorides.model.LoanRequest;

@Repository
public interface LoanRequestRepository extends CrudRepository<LoanRequest, Long> {

}
