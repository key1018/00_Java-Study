package com.study.Baekjoon;

import java.util.Scanner;

public class Baekjoon {

    public static void main(String[] args){
    	
        Scanner sc = new Scanner(System.in);
        
        
        //10950번 
        
         while(true) {   
             
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();
         if(num1 == 0 && num2 == 0){
             sc.close();
             break;
         }
          System.out.println(num1+num2);
         }
         
         // 10951번
         
         while(sc.hasNextInt()) {  // 입력값이 있을 때 까지 출력
             
         int num1 = sc.nextInt();
         int num2 = sc.nextInt();

          System.out.println(num1+num2);
         }
     }
 }
