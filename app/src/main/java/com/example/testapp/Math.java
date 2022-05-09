package com.example.testapp;

import java.util.regex.Pattern;

public class Math {
    private Pattern pattern = Pattern.compile("-?\\d+(\\.\\d+)?");
    String result = "";

    public String add(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return "Empty";
        }
        if (isNumeric(a) || isNumeric(b)) {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);

            result = String.valueOf(num1 + num2);
        } else {
            result = "Letters and spaces cannot be entered ";
            System.out.println("Letters and spaces cannot be entered.");
        }
        return result;
    }




    public String divide(String a, String b) {
        if (a.isEmpty() || b.isEmpty()) {
            return "Empty";
        }
        if (isNumeric(a) || isNumeric(b)) {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            if (b.equals("0")) {
                return "Can't divide by zero";
            }
            else if(Integer.parseInt(b) % 2 == 0 && Integer.parseInt(a) % 2 == 1 &&Integer.parseInt(b)>Integer.parseInt(a)){
                 return "Comes out a non-integer";
            }
            result = String.valueOf(num1 / num2);
        } else {
            result = "Letters and spaces cannot be entered";
            System.out.println("Letters and spaces cannot be entered.");
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
