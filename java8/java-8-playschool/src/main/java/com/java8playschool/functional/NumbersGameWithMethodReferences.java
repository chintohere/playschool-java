/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8playschool.functional;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kishore.chintoju
 */
public class NumbersGameWithMethodReferences {

    public static void main(String[] args) {
        //find the double of first even number greater than 3

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(numbers.stream().filter(new GreaterThanThree()).filter(NumbersGameWithMethodReferences::isEven).findFirst());
    }

    public static boolean isGreaterThanThree(Integer i) {
        return i > 3;
    }

    public static boolean isEven(Integer i) {
        return i % 2 == 0;
    }
}
