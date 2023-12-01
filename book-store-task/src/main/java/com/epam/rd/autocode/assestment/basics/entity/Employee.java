package com.epam.rd.autocode.assestment.basics.entity;

import java.time.LocalDate;
import java.util.Objects;

class Employee extends User {
    private String phone;
    private LocalDate birthDate;

    // Default constructor
    public Employee() {
        super();
    }

    // Parameterized constructor
    public Employee(long id, String email, String password, String name, String phone, LocalDate birthDate) {
        super(id, email, password, name);
        this.phone = phone;
        this.birthDate = birthDate;
    }

    // Getters and setters
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    // equals and hashCode
    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(phone, employee.phone) &&
                Objects.equals(birthDate, employee.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), phone, birthDate);
    }

    // toString
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", dateOfBirth=" + birthDate +
                '}';
    }
}
