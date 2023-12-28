package org.belajar.functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {

    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/services";
    static Supplier<List<String>> getDBConnectionUrlSuppliers = () ->
            List.of("jdbc://localhost:5432/services",
                    "jdbc://localhost:5432/user");

    public static void main(String[] args) {
        System.out.println("getDBConnectionUrl = " + getDBConnectionUrl());
        System.out.println("getDBConnectionUrlSupplier = " + getDBConnectionUrlSupplier.get());
        System.out.println("getDBConnectionUrlSuppliers = " + getDBConnectionUrlSuppliers.get());
    }

    static String getDBConnectionUrl() {
        return "jdbc://localhost:5432/services";
    }
}
