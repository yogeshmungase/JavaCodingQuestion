package org.example.basic;

public class ShallowCopy {
    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("HP", 430000);
        Laptop laptop2 = laptop1;

        System.out.println(laptop1 +" : "+ laptop2);

        System.out.println("After Modification :");
        laptop2.setLaptopBrand("Dell");
        laptop2.setLaptopPrice(120000);

        System.out.println(laptop1 +" : "+ laptop2);
    }
}
