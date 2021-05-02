package com.yapollo.acountingofservice.repository;

import com.yapollo.acountingofservice.model.RepairReceipt;
import org.springframework.data.repository.CrudRepository;
import org.w3c.dom.stylesheets.LinkStyle;

import java.util.List;

public interface ReceiptsRepository extends CrudRepository<RepairReceipt, Integer> {

    List<RepairReceipt> findByPhoneNumber (Integer phoneNumber);


}
