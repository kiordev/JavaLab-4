package com.company;

import java.util.Objects;

public class ExtendedClass {
    private byte b;
    private int i;
    private double d;
    private String s;


    @Override
    public boolean equals(Object anObject){
        if (this == anObject) return true;
        if(anObject == null || anObject.getClass() != this.getClass()){
            return false;
        }
        ExtendedClass that = (ExtendedClass) anObject;
        return (that.b == this.b &&
                that.i == this.i &&
                that.d == this.d &&
                s == null ? that.s == null : this.s.equals(that.s));
    }

    @Override
    public int hashCode() {
        return Objects.hash(b, i, d, s);
    }

    @Override
    public String toString(){
        return String.format("object of class %s in which b = %d, i = %d, d = %f, s = %s",
                this.getClass(),b, i, d, s );
    }
}

