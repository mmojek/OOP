package com.infoshare.oop.card;



//Enum - dodawany do kazdego konstruktoroa, wywolywany w klasie main
public enum CustomerType {
    COMPANY("Firma"),
    INDIVIDUAL("Klient Indywidualny");

    private final String name;

    CustomerType(String name) {
        this.name = name;

    }

    @Override

    public String toString() {
        return name;
    }
}
