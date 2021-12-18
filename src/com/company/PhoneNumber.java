package com.company;

public class PhoneNumber implements Cloneable, Comparable<PhoneNumber>  {
    private final short areaCode;
    private final String number;

    PhoneNumber(short areaCode, String phoneNumber) {
        phoneNumber = getCorrectNumber(phoneNumber);
        if(!checkNumber(phoneNumber)) {
            this.ErrorIncorrectPhoneNumber();
        }
        this.areaCode = areaCode;
        this.number = phoneNumber;
    }

    private void ErrorIncorrectPhoneNumber() {
        System.out.println("Error: Wrong Number!");
        System. exit(1);
    }
    private short getAreaCode() {
        return areaCode;
    }

    public String getNumber() {
        return number;
    }

    private static String getCorrectNumber(String phoneNumber){
        if( phoneNumber == null){
            return "";
        }
        phoneNumber = phoneNumber.replace(" ", "");
        phoneNumber = phoneNumber.replace("-", "");
        phoneNumber = phoneNumber.replace("(", "");
        return phoneNumber.replace(")", "");
    }


    private static boolean checkNumber(String phoneNumber) {

        if(!(phoneNumber.length() >= 5 && phoneNumber.length() <= 12)){
            return false;
        }
        for (char c : phoneNumber.toCharArray()){
            if(!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return areaCode == that.areaCode && number.equals(that.number);
    }

    @Override
    public int hashCode() {
        int hash = (int) Long.parseLong("1" + number.substring(0,3));
        return hash;
    }

    @Override
    public String toString(){
        return String.format("+%d%s", areaCode,number);
    }

    @Override
    public PhoneNumber clone (){
        PhoneNumber clone = null;
        try {
            clone = new PhoneNumber(areaCode, number);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public int compareTo(PhoneNumber o) {
        //если возврат отрицательный, то текущей объект - выше
        if(o == null){
            return -1;
        }
        int answer = (int)(this.areaCode - o.getAreaCode());
        if(answer == 0) {
            long dif = Long.parseLong("1" + this.number) - Long.parseLong("1" + o.getNumber());
            if(dif != 0){
                answer = dif < 0? -1 : 1;
            }
        }
        return answer;
    }
}

