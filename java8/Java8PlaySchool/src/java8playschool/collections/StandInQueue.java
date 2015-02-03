/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java8playschool.collections;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.function.Consumer;

/**
 *
 * @author kishore.chintoju
 */
public class StandInQueue {
    
    public static void main(String[] args) {
        Queue queue = new ArrayBlockingQueue(10);
        
        for(int i=0;i<10;i++)
        {
            queue.add("Item - "+ i);
        }
        
//        queue.forEach(new Consumer() {
//
//            @Override
//            public void accept(Object t) {
//                   System.out.println(t);
//            }
//        });
        
       
         queue.forEach((x) ->{System.out.println(x);});
        
                
    }
    
}
