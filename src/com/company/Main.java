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

    void Task_Two(){
        PhoneNumber myPhoneNumber = new PhoneNumber((short) 1,"380982405433");
        PhoneNumber myPhoneNumber2 = new PhoneNumber((short) 1,"380661078221");
        PhoneNumber clone = myPhoneNumber.clone();
        System.out.println("myPhoneNumber.equals(clone) - "+myPhoneNumber.equals(clone));
        System.out.println("myPhoneNumber.hashCode()==clone.hashCode() - "+(myPhoneNumber.hashCode()==clone.hashCode()));
        System.out.println("First number - +"+myPhoneNumber.getNumber());
        System.out.println("Second number - +"+myPhoneNumber2.getNumber());
        System.out.println("myPhoneNumber.compareTo(myPhoneNumber2) - "+myPhoneNumber.compareTo(myPhoneNumber2));

    }
    public static void main(String[] args) {

    }
}
