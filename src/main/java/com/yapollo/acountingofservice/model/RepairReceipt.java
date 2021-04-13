package com.yapollo.acountingofservice.model;

import javax.persistence.*;

@Entity
@Table(name="ACOUNTINGOFSERVICE")
public class RepairReceipt {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int id;

    @Column
    private int phoneNumber;

    @Column
    private String model;

    @Column
    private String issue;

    @Column
    private String notes;



}
