package com.example.myapp.model;

public class Person {
    private String emri,mbiemri, telefoni;

    public Person(String emri, String mbiemri, String telefoni) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.telefoni = telefoni;
    }

    public String getEmri() {
        return emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public String getTelefoni() {
        return telefoni;
    }
}
