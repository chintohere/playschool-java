/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chintoju.java8playschool.functional;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author kishore.chintoju
 */
public class NumbersGameWithLambda {

    public static void main(String[] args) {
        //find the double of first even number greater than 3

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(numbers.stream().filter(e -> e > 3).filter(e -> e % 2 == 0).findFirst());
    }
}
