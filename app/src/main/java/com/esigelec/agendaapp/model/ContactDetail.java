package com.esigelec.agendaapp.model;

public class ContactDetail {
    private String name,address,phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public ContactDetail(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }
}
