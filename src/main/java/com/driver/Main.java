package com.driver;

public class Main {

    public static class Product{
        public int product(int x, int y){return x+y;}

        public int product(int x, int y, int z){return x+y+z;}

        public double product(double x, double y){return x/y;}

    }
    public static void main(String[] args) {

        Product p = new Product();
        int a = p.product(4, 5);
        int b = p.product(6, 7, 8);
        double c = p.product(66.7, 57.6);

    }

}