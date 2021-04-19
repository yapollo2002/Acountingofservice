package com.yapollo.acountingofservice.repository;

import com.yapollo.acountingofservice.model.RepairReceipt;
import org.springframework.data.repository.CrudRepository;

public interface ReceiptsRepository extends CrudRepository<RepairReceipt, Long> {

    RepairReceipt findByPhoneNumber (int phoneNumber);


}
