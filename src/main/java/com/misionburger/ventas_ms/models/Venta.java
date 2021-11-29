package com.misionburger.ventas_ms.models;

import com.misionburger.ventas_ms.models.Plato;
import org.springframework.data.annotation.Id;
import java.util.Date;
import java.util.List;

public class Venta {
    @Id private String id;
    private String username;
    private String full_name;
    private String email;
    private String phone;
    private String address;
    private Date transaction_date;
    private Integer total_bill;
    private List<Plato> platoList;

    public Venta(String id, String username, String full_name, String email, String phone, String address, Date transaction_date, Integer total_bill, List<Plato> platoList) {
        this.id = id;
        this.username = username;
        this.full_name = full_name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.transaction_date = transaction_date;
        this.total_bill = total_bill;
        this.platoList = platoList;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getTransaction_date() {
        return transaction_date;
    }

    public void setTransaction_date(Date transaction_date) {
        this.transaction_date = transaction_date;
    }

    public Integer getTotal_bill() {
        return total_bill;
    }

    public void setTotal_bill(Integer total_bill) {
        this.total_bill = total_bill;
    }

    public List<Plato> getPlatoList() {
        return platoList;
    }

    public void setPlatoList(List<Plato> platoList) {
        this.platoList = platoList;
    }
}
