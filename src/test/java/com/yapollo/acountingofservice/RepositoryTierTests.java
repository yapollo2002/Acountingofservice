package com.yapollo.acountingofservice;

import com.yapollo.acountingofservice.model.RepairReceipt;
import com.yapollo.acountingofservice.repository.ReceiptsRepository;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class RepositoryTierTests {

    @Autowired
    ReceiptsRepository repository;

    @Test
    @Order(1)
    public void createReceiptRepositoryTest() {
        RepairReceipt receipt = new RepairReceipt();
        receipt.setPhoneNumber(986320011);
        receipt.setModel("Sony");
        receipt.setIssue("No power");
        receipt.setNotes("Charger");
        RepairReceipt savedDbReceipt = repository.save(receipt);

        assertThat(savedDbReceipt).isNotNull();
    }

    @Test
    @Order(2)
    public void findAllReceiptsRepositoryTest() {
        List<RepairReceipt> receipts = (List)repository.findAll();

        assertThat(receipts).isNotNull();

    }

    @Test
    @Order(3)
    public void findByTelnumRepositoryTest() {
        RepairReceipt fetchedReceipt = repository.findByPhoneNumber(986320011);


        assertThat(fetchedReceipt).isNotNull();

    }

    @Test
    @Order(4)
    public void updateReceiptRepositoryTest() {
        RepairReceipt fetchedReceipt = repository.findByPhoneNumber(986320011);
        fetchedReceipt.setNotes("Nope charger");
        repository.save(fetchedReceipt);
        RepairReceipt updatedDBReceipt = repository.findByPhoneNumber(986320011);

        assertThat(updatedDBReceipt.getNotes()).isEqualTo("Nope charger");
    }

    @Test
    @Order(5)
    public void deleteReceiptRepositoryTest() {
        RepairReceipt fetchedReceipt = repository.findByPhoneNumber(986320011);
        int fetchReceiptId = fetchedReceipt.getId();
        repository.deleteById(fetchReceiptId);
        RepairReceipt deletedReceipt = repository.findByPhoneNumber(986320011);

        assertThat(deletedReceipt).isNull();

    }

}
