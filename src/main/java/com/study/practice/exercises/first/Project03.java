package com.study.practice.exercises.first;

/**
 *  打印出所有的 " 水仙花数 " ，所谓 " 水仙花数 "是指一个三位数， 其各位数字立方和等于
 * 该数本身
 * */
public class Project03 {
    public static  void main(String[] args){
        for(int i=100;i<1000;i++){
            if(narcissisticNumber(i)){
                System.out.println("水仙花为：" + i);
            }
        }
    }
    public static Boolean narcissisticNumber(Integer num){
        if(num<100 || num>999){
            return false;
        }
        int hundredDigitNumber = (int) Math.floor((num/100));
        int tenDigitNumber = (int) Math.floor((num/10)-(hundredDigitNumber*10));
        int singleDigitNumber =  num%10;
        int sum = (int) Math.pow(hundredDigitNumber,3)+(int) Math.pow(tenDigitNumber,3)+(int) Math.pow(singleDigitNumber,3);
        if(sum == num){
            return true;
        }
        return false;
    }


}
