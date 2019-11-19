package com.aqacourses.homework_lesson3;
/*
Создайте enum, в виде отдельного класа, который содержит дни недели, в виде MONDAY("Monday", 1).
Напишите методы в этом энаме, один возвращает имя, второй порядковый номер дня.
 */
public enum DaysOfWeek {
    MONDAY("Monday", 1),
    TUESDAY("Tuesday", 2),
    WEDNESDAY("Wednesday", 3),
    THURSDAY("Thursday", 4),
    FRIDAY("Friday", 5),
    SATURDAY("Saturday", 6),
    SUNDAY("Sunday", 7);

    private String day;
    private int numberOfDay;

    DaysOfWeek(String day, int numberOfDay) {
        this.day = day;
        this.numberOfDay = numberOfDay;

    }

    public String getDay(){return day;}
    public int getNumberOfDay(){return numberOfDay;}

}

