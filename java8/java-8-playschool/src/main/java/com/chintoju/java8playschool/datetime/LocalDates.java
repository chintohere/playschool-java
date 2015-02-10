/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8playschool.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author kishore.chintoju
 */
public class LocalDates {
    public static void main(String[] args) {
        LocalDate date  = LocalDate.now();
        System.out.println(date);
        
        System.out.println(date.format(DateTimeFormatter.ISO_WEEK_DATE));
    }
}
