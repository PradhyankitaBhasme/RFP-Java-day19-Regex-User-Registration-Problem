package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) throws InvalidUserDetailsException {
        UserRegistrationRegex regex = new UserRegistrationRegex();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name: ");
        regex.validateFirstName(scanner.next());

        System.out.println("\nEnter last name: ");
        regex.validateLastName(scanner.next());

        System.out.println("\nEnter email: ");
        regex.validateEmail(scanner.next());

        System.out.println("\nEnter mobile no as per format: (e.g. 91 9867859848) ");
        scanner.nextLine();
        regex.validateMobileNo(scanner.nextLine());

        System.out.println("\nEnter Password:");
        regex.validatePassword(scanner.next());

        System.out.println("\nValid Emails: ");
        regex.validateEmail(scanner.next());
    }
}