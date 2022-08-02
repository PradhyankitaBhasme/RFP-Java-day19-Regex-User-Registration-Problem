package com.bridgelabz;

import java.util.regex.Pattern;

public class UserRegistrationRegex {
    public void validateName(String name){
//        firstName or lastName starts with Cap and has minimum 3 characters
        Pattern pattern=Pattern.compile("^[A-Z][a-zA-Z]{2,}");
        boolean isValid = pattern.matcher(name).matches();
        if (isValid){
            System.out.println(name+" is valid");
        }else
            System.out.println(name+" is not valid");
    }
    public void validateEmail(String email){
/*        E.g. abc.xyz@bl.co.in
        Email has 3 mandatory parts (abc, bl & co) and 2 optional (xyz & in)
        with precise @ and . positions
 */
        Pattern pattern=Pattern.compile("^[a-zA-Z0-9]+([._-][a-zA-Z0-9]+)*@([a-z]+)([.][a-z])*(\\.[a-z]+)$");
        boolean isValid = pattern.matcher(email).matches();
        if (isValid){
            System.out.println("email is valid");
        }else
            System.out.println("email is not valid");
    }

    public void validateMobileNo(String mobileNo){
        Pattern pattern=Pattern.compile("^[\\d]{2}\\s[\\d]{10}$");
        boolean isValid = pattern.matcher(mobileNo).matches();
        if (isValid){
            System.out.println("mobile is valid");
        }else {
            System.out.println("mobile is not valid");
        }
    }

    public void validatePassword(String password){
        boolean isValid=true;
        validatePassRule1(password);
    }
    boolean validatePassRule1(String password){
        //minimum 8 characters
        Pattern pattern=Pattern.compile("[\\w]{8,}");
        Boolean isValid=pattern.matcher(password).matches();
        if (isValid){
            System.out.println("Rule1 Pass...");
        }else {
            System.out.println("Invalid Password! \nPassword must have minimum 8 characters");
        }
        return isValid;
    }
}
