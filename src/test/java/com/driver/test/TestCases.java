package com.driver.test;

//import static org.junit.Assert.*;
//import org.junit.jupiter.api.Test;

public class TestCases {
    public static void main(String[] args) {
        B obj = new B();
        String ans =obj.meth();
        System.out.println(ans);
    }
}
class A{
    String meth(){
        return "Invoking method from class A";
    }
}
class B extends A{
    
    String meth(){
        return "Method is overridden in Extendend class B";
    }
}