package com.dbs.remorides.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dbs.remorides.model.LoanStatusMaster;

@Repository
public interface LoanStatusMasterRepository  extends CrudRepository<LoanStatusMaster, Long>{

}
