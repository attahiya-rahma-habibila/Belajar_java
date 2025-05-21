package com.belajar2;

// Superclass
class Hewan {
    void bersuara() {
        System.out.println("Hewan mengeluarkan suara");
    }
}

// Subclass
class Anjing extends Hewan {
    @Override
    void bersuara() {
        System.out.println("Anjing menggonggong");
    }
}

public class Main {
    public static void main(String[] args) {
        Hewan hewan1 = new Hewan();
        Hewan hewan2 = new Anjing(); // Polymorphism

        hewan1.bersuara(); // Output: Hewan mengeluarkan suara
        hewan2.bersuara(); // Output: Anjing menggonggong
    }
}
