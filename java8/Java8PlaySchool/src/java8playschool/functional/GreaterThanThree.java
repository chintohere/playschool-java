/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8playschool.functional;

import java.util.function.Predicate;

/**
 *
 * @author kishore.chintoju
 */
public class GreaterThanThree implements Predicate<Integer> {

    @Override
    public boolean test(Integer t) {
        return t > 3;
    }
    
}
