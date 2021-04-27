package com.yapollo.acountingofservice.repository;

import com.yapollo.acountingofservice.model.RepairReceipt;
import org.springframework.data.repository.CrudRepository;

public interface ReceiptsRepository extends CrudRepository<RepairReceipt, Integer> {

    Iterable <RepairReceipt> findByPhoneNumber (Integer phoneNumber);


}
