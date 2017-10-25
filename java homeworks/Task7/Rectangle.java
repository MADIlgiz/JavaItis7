package com.company;

public class Rectangle {
    int a;
    int b;
    char nameofrectangle;

    public Rectangle(char nameofrectangle, int a, int b) {
        this.a = a;
        this.b = b;
        this.nameofrectangle = nameofrectangle;
    }
    int area() {
        int S = this.a*this.b;
        return S;
    }



    }

