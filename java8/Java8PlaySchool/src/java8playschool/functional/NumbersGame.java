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
public class NumbersGame {

    public static void main(String[] args) {
        //find the double of first even number greater than 3

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        int result = 0;

        for (Integer number : numbers) {
            if (number > 3 && number % 2 == 0) {
                result = number;
                break;
            }
        }
        System.out.println(result);

    }
}
