package org.belajar.functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        System.out.println("isPhoneNumberValid = " + isPhoneNumberValid("0834340234"));
        System.out.println("isPhoneNumberValid = " + isPhoneNumberValid("07000000000"));
        System.out.println("isPhoneNumberValid = " + isPhoneNumberValid("0834340234"));

        System.out.println("With Predicate");
        System.out.println("isPhoneNumberValidPredicate = " + isPhoneNumberValidPredicate.test("0834340234"));
        System.out.println("isPhoneNumberValidPredicate = " + isPhoneNumberValidPredicate.test("07000000000"));
        System.out.println("isPhoneNumberValidPredicate = " + isPhoneNumberValidPredicate.test("0834340234"));

        System.out.println(
                "is Phone Number Valid And Contains Number 3 " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("07190268413"));

        System.out.println(
                "is Phone Number Valid And Contains Number 3 " +
                isPhoneNumberValidPredicate.and(containsNumber3).test("07193268415"));

    }

    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("07") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPredicate = phoneNumber -> phoneNumber.startsWith("07") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber -> phoneNumber.contains("3");


}
