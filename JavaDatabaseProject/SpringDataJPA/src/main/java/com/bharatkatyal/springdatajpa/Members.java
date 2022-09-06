package com.bharatkatyal.springdatajpa;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Members {
    @Id
    @GeneratedValue
    private Long id;
    private String firstName;
    private String lastName;
    private Boolean active;
    public Boolean getActive() {
        return active;
    }
    public void setActive(Boolean active) {
        this.active = active;
    }
    public Members(String firstName, String lastName, Boolean active) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.active = active;
    }
    public Members() {
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
    @Override
    public String toString() {
        return "Members{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", active=" + active +
                '}';
    }
}
