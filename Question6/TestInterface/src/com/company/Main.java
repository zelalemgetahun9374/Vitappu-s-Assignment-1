package com.company;

public class Main {

    public static void main(String[] args) {
	    Circle c=new Circle();
        Rectangle r=new Rectangle();
        Drawable d[]= {c,r};
        for (int i = 0; i < d.length; i++) {
            d[i].draw();
        }
    }
}
