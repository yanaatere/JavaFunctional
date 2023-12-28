package org.belajar.functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function Takes 1 Argument and Produce 1 result
        int increment = incrementByOne(0);
        System.out.println("increment = " + increment);

        Integer increment2 = incrementByOneFunction.apply(1);
        System.out.println("increment2 = " + increment2);

        // Chaining Function
        Integer multiplyBy10 = multiplyBy10Function.apply(increment2);
        System.out.println("multiplyBy10 = " + multiplyBy10);

        Function<Integer, Integer> addByOneAndMultipleBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println("addByOneAndMultipleBy10 = " + addByOneAndMultipleBy10.apply(4));

        //Bi Function Takes 1 Argument and Produce 1 result
        System.out.println("incrementByOneAndMultiply = " + incrementByOneAndMultiply(4,100));

        System.out.println("incrementByOneAndMultiplyFunction = " + incrementByOneAndMultiplyFunction.apply(4,100));
    }

    static int incrementByOne(int number) {
        return number + 1;
    }

    static Function<Integer, Integer> incrementByOneFunction =
            number -> number + 1;
    static Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int incrementByOneAndMultiply(int number, int numToMultiply) {
        return (number + 1) * numToMultiply;
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyFunction =
            (numberToIncrementByOne, numberToMultipleBy) -> (numberToIncrementByOne + 1) * numberToMultipleBy;
}
