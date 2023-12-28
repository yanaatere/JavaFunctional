package org.belajar.combinatorpattern;

import java.time.LocalDate;

import static org.belajar.combinatorpattern.CustomerRegistrationValidator.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Alicer", "Alice@gmail.com", "+0890478983495"
                , LocalDate.of(2000, 1, 1)
        );

        /*CustomerValidatorService validatorService = new CustomerValidatorService();
        System.out.println("validatorService = " +  validatorService.isValid(customer));*/

        //if Valid We Can Strore Customer in DB

        //Using Combinator Pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(IsAnAdult())
                .apply(customer);

        System.out.println("result = " + result);
        if (result != ValidationResult.SUCCESS) {
            throw new IllegalStateException("result Error = " + result.name());
        }
    }
}
