package com.aqacourses.homework_lesson3;
/*
Создайте абстрактный класс который содержит конструктор что принимает виде параметра int numOfMonth и содержит абстрактный метод printPhrase
Также абстрактный класс содержит в себе энам (да так можно), который содержит в себе все месяца.в виде JANUARY, FEBRUARY и так далее.
Также содержит не абстрактный метод  getMonthNameByNum который используя numOfMonth возвращает месяц по номеру.

 */
public abstract class AbstractClass {
    private int numOfMonth;
   public AbstractClass(int numOfMonth){ }   //конструктор

    abstract void printPhrase();       // абстрактный метод

    private enum MonthsOfTheYear {          //   enum месяцев
        JANAURY("Janaury"),
        FEBRUARY("February"),
        MARCH("March"),
        APRIL("April"),
        MAY("May"),
        JUNE("June"),
        JULY("July"),
        AUGUST("August"),
        SEPTEMBER("September"),
        OCTOBER("October"),
        NOVEMBER("November"),
        DECEMBER("December");

        private String month;

       MonthsOfTheYear(String month) { this.month = month; }

        public String getMonthNameByNum(int numOfMonth){
            switch (numOfMonth){
                case 1:return MonthsOfTheYear.JANAURY.name();
                case 2:return MonthsOfTheYear.FEBRUARY.name();
                case 3:return MonthsOfTheYear.MARCH.name();
                case 4:return MonthsOfTheYear.APRIL.name();
                case 5:return MonthsOfTheYear.MAY.name();
                case 6:return MonthsOfTheYear.JUNE.name();
                case 7:return MonthsOfTheYear.JULY.name();
                case 8:return MonthsOfTheYear.AUGUST.name();
                case 9:return MonthsOfTheYear.SEPTEMBER.name();
                case 10:return MonthsOfTheYear.OCTOBER.name();
                case 11:return MonthsOfTheYear.NOVEMBER.name();
                case 12:return MonthsOfTheYear.DECEMBER.name();
                default: return "Нет такого месяца";

            }
        }
    }




}


