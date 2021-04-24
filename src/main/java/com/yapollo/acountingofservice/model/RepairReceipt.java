package com.yapollo.acountingofservice.model;

import javax.persistence.*;

@Entity
@Table(name= "repair_receipt")
public class RepairReceipt {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @Column(name="phone_number")
    private Integer phoneNumber;

    @Column
    private String model;


    @Column
    private String issue;

    @Column
    private String notes;

    public Integer getId() { return id;   }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPhoneNumber() { return  phoneNumber; }

    public void setPhoneNumber(Integer number) { this.phoneNumber = number;   }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getIssue() {
        return issue;
    }

    public void setIssue(String issue) {
        this.issue = issue;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }



}
