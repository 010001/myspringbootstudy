package com.github.fb010001.webfluxdemo.demo;

/**
 * @author fangbin
 * @date 19-6-7
 */

public class Good {

    private int id;
    private String name;
    private String price;

    @Override
    public String toString() {
        return "Good{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Good(int id, String name, String price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
