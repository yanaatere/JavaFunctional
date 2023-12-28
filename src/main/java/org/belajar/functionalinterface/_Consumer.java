package org.belajar.functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        Customer yana = new Customer("Yana", "9999999");

        //Normal Java Function
        greatCustomer(yana);

        //Customer Functional Interface
        greatCustomerConsumer.accept(yana);
        greatCustomerConsumerV2.accept(yana, Boolean.FALSE);
    }

    static  void greatCustomer(Customer customer){
        System.out.println("Hello " + customer.customerName+ ", thanks! for registering phone numbers " + customer.customerPhoneNumber);
    }

    static Consumer<Customer> greatCustomerConsumer = customer -> System.out.println("Hello " + customer.customerName+ ", thanks! for registering phone numbers " + customer.customerPhoneNumber);
    static BiConsumer<Customer, Boolean> greatCustomerConsumerV2 = (customer, showPhoneNumber) ->
            System.out.println("Hello " + customer.customerName+ ", thanks! for registering phone numbers "
                    + (showPhoneNumber ? customer.customerPhoneNumber : "xxxxxxxx"));

    static class Customer{
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
