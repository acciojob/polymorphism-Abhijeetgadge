package com.driver;

public class Main {

    public static class Products{
        public int product(int x, int y){return x+y;}

        public int product(int x, int y, int z){return x+y+z;}

        public double product(double x, double y){return x/y;}

    }
    public static void main(String[] args) {

        Products p = new Products();
        p.product(3, 4);
        p.product(5.5, 6.6);
        p.product(3, 5, 7);

    }

}