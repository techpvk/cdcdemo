package com.ozzydemo.cdc.commons.data.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerTransactionRepo extends JpaRepository<CustomerTransaction,Long>
{

}


