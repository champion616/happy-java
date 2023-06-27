package com.example.enumtype;

public class DaySwitchTest {
    public static void main(String[] args){
        Day day = Day.SUNDAY;

        switch(day){
            case FRIDAY:
                System.out.println("금요일입니다.");
                break;
            case MONDAY:
                System.out.println("월요일입니다.");
                break;
            case SUNDAY:
                System.out.println("일요일입니다.");
                break;
            default:
                System.out.println("낫요일");
        }
    }
}
