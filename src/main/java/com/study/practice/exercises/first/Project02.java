package com.study.practice.exercises.first;

/**
 * -**判断 101-200 之间有多少个素数，并输出所有素数。
 * */
public class Project02 {
    public static void main(String[] args){
        for(int number=101 ; number<=200 ; number++){
            if(isPrime(number)){
                System.out.println(number +"是否是素数：" + isPrime(number));
            }
        }
    }
    //true 是素数， false 是 合数，默认是素数
    public static Boolean isPrime(Integer number){
        if(number==1 || number==2 || number==3){
            return true;
        }
        for(int i=2 ; i<Math.sqrt(number) ; i++){
            if( number % i==0){
                return false;
            }
        }

        return true;
    }
}
