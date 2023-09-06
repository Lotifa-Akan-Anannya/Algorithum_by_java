package lab.pkg05;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Scanner;


public class Lab05 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int S;
        System.out.println("Number of coins");
        n = sc.nextInt();
        System.out.println("Enter some coins");
        PriorityQueue <Integer> pq = new PriorityQueue(Collections.reverseOrder());
        
        for(int i = 0;i < n; i++){
            
            pq.add(sc.nextInt());
        }
        
       /* Iterator it = pq.iterator();
          
        for(int i = 0; i < n; i++){
            System.out.println(" "+it.next());
        }
      while(!pq.isEmpty()){
        System.out.println(pq.poll());
    }
      */
    
        System.out.println("Exchanged Currency");
        S = sc.nextInt();
        int c;
        int num;
        while(S>0){
          c = pq.poll();
          if(c<=S){
          num = S/c;
          S = S-c*num;
          System.out.println("Used Coin: "+ c + "Required: "+num+ " times");
          }
          if(pq.isEmpty()){
              break;
          }
        }
        
        
    }
    
}
Lab05.java
Displaying Lab05.java.
Lab Session 05
Md. Ashraf Uddin, PhD
•
Nov 20, 2022
5 points

CSE 246 Lab 06 Greedy Algorithms.docx
Word
Class comments
