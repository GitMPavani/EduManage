package com.developerstack.edumanage.model;

public class Teacher {
    String code;
    String name;
    String address;
    private  String contact;



    public Teacher() {
    }

    public Teacher(String code, String name, String address, String contact) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
