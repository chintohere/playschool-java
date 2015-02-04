/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8playschool.functional;

import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 *
 * @author kishore.chintoju
 */
public class PrimeNumbers {

    public static void main(String[] args) {

        for (int number = 0; number < 100; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    private static boolean isPrime(int number) {
        
        
        final IntPredicate primePredicate = diviser -> number % diviser == 0;

        return number > 1 && IntStream.range(2, number).noneMatch(primePredicate);

    }

}
