package com.epam.rd.autocode.assestment.basics.entity;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
public class Employee {
    private String phone;
    private LocalDate birthDate;

    public Employee() {
        super();
    }

    public Employee(long id, String email, String password, String name, String phone, LocalDate birthDate) {
        super(id, email, password, name);
        this.phone = phone;
        this.birthDate = birthDate;
    }

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
    @Override
    public String toString() {
        return "Employee{" +
                "phone='" + phone + '\'' +
                ", birthDate=" + birthDate +
                "} " + super.toString();
    }
}
