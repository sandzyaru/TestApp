package com.example.testapp;

import java.util.regex.Pattern;
public class Math {
    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    String result = "";

    public String add(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return "Empty";
        }
        if (isNumeric(a) && isNumeric(b)) {

            if (a.contains(".") || b.contains(".")) {
                return "Enter an Integer";
            }else{
                int num1 = Integer.parseInt(a);
                int num2 = Integer.parseInt(b);
                result = String.valueOf(num1 + num2);
            }

            }else {
                result = "Letters cannot be entered";
            }
            return result;
        }




    public String divide(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return "Empty";
        }
        if (isNumeric(a) || isNumeric(b)) {

            if (b.equals("0")) {
                return "Can't divide by zero";
            }
            if (a.contains(".") || b.contains(".")) {

                return "Enter an Integer";
            }else{
                if( Integer.parseInt(b)>Integer.parseInt(a)){
                    if(Integer.parseInt(b) % 2 == 0 || Integer.parseInt(a) % 2 == 1 ) {
                        return "Comes out a non-integer";
                    }
                }
                else if(Integer.parseInt(a)>Integer.parseInt(b) && Integer.parseInt(a) % 2 == 1 && Integer.parseInt(b) % 2 == 0 ){
                    return "Comes out a non-integer";
                }else {
                    result = "Letters and spaces cannot be entered";
                    System.out.println("Letters and spaces cannot be entered.");
                }

            }
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            result = String.valueOf(num1 / num2);
        }
        return result;
    }



    public boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        return pattern.matcher(strNum).matches();
    }
}

