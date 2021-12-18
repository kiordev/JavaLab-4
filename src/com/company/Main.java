package com.company;

public class Main {

    void Task_One(){
        ExtendedClass a =new ExtendedClass();
        ExtendedClass c =new ExtendedClass();
        System.out.println("a.equals(a) - "+a.equals(a));
        String b="";
        System.out.println("a.equals(String b=\"\") - "+a.equals(b));
        if(a.hashCode()==c.hashCode())
            System.out.println("a.hashCode()==c.hashCode() - true");
        else
            System.out.println("a.hashCode()==c.hashCode() - false");
        System.out.println(a);

    }
    public static void main(String[] args) {

    }
}
