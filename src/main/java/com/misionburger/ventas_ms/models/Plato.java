package com.misionburger.ventas_ms.models;

import org.springframework.data.annotation.Id;

public class Plato {
    @Id
    private String id;
    private String name_plato;
    private String desc_plato;
    private Integer price;
    private Integer amount;
    private String url_img;

    public Plato(String id, String name_plato, String desc_plato, Integer price, Integer amount, String url_img) {
        this.id = id;
        this.name_plato = name_plato;
        this.desc_plato = desc_plato;
        this.price = price;
        this.amount = amount;
        this.url_img = url_img;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName_plato() {
        return name_plato;
    }

    public void setName_plato(String name_plato) {
        this.name_plato = name_plato;
    }

    public String getDesc_plato() {
        return desc_plato;
    }

    public void setDesc_plato(String desc_plato) {
        this.desc_plato = desc_plato;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getUrl_img() {
        return url_img;
    }

    public void setUrl_img(String url_img) {
        this.url_img = url_img;
    }
}
