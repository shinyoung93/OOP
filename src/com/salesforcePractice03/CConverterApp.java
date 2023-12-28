package com.salesforcePractice03;

public class CConverterApp {

    public static void main(String[] args) {

        double dollar;
        double won;
        
        CConverter.setRate(1118.70);
        
        
        dollar = CConverter.toDoller(1000000);
        System.out.println(dollar);
        //백만원을 달러로 출력

        won = CConverter.toKRW(100);
        System.out.println(won);
        //100달러를 원으로 출력
        
        
    }

}
