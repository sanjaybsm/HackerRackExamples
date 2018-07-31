package com.sanjay.hackerack.basic;

public class TimeConversion {

    public static void main(String[] args) {
        System.out.println(convert24HourFormat("12:40:22AM"));
    }

    public static String convert24HourFormat(String s){

        String[] t =  s.split(":");
        int n = Integer.valueOf(t[0]);
        if(s.contains("PM")){
           String trimmedString =  s.replace("PM"," ").trim();

           if(n < 12){
               n = n+12;
           }

           return trimmedString.replace(t[0],String.valueOf(n));
        }else{
            String trimmedString =  s.replace("AM"," ").trim();
            if(n >= 12) {
                return trimmedString.replace(t[0],"00");
            }else{
                return trimmedString;
            }


        }

    }
}
