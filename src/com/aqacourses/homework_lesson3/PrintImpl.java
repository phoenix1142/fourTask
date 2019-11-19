package com.aqacourses.homework_lesson3;

import static com.aqacourses.homework_lesson3.DaysOfWeek.*;

/*
Создайте класс который имплементит интерфейс. printPhrase пусть выводит в консоль фразу на ваш выбор
returnDayNameByNum возвращает имя дня по номеру.
returnDayNumByName возвращает номер по имени.
Используйте созданный энам с константами. Можете сделать switch
 */
public class PrintImpl implements Print {

    @Override
    public void printPhrase() {
        System.out.println("На данный момент тяжко всё это дается!");
    }

    @Override
    public String returnDayNameByNum(int numOfDay) {
        String day;
        switch (numOfDay){
            case 1:day = DaysOfWeek.MONDAY.getDay();
                    break;
            case 2: day = DaysOfWeek.TUESDAY.getDay();
                    break;
            case 3: day = DaysOfWeek.WEDNESDAY.getDay();
                    break;
            case 4: day = DaysOfWeek.THURSDAY.getDay();
                    break;
            case 5: day = DaysOfWeek.FRIDAY.getDay();
                    break;
            case 6: day = DaysOfWeek.SATURDAY.getDay();
                    break;
            case 7: day = DaysOfWeek.SUNDAY.getDay();
                    break;
            default:
                day = "Нет такого дня!";
        }
    return day;
    }

    @Override
    public int returnDayNumByName(String name) {
        int numberOfDay;
        switch (name){
            case "MONDAY":numberOfDay = DaysOfWeek.MONDAY.getNumberOfDay();
            break;
            case "TUESDAY":numberOfDay = DaysOfWeek.TUESDAY.getNumberOfDay();
                break;
            case "WEDNESDAY": numberOfDay = DaysOfWeek.WEDNESDAY.getNumberOfDay();
                break;
            case "THURSDAY": numberOfDay = DaysOfWeek.THURSDAY.getNumberOfDay();
                break;
            case "FRIDAY": numberOfDay = DaysOfWeek.FRIDAY.getNumberOfDay();
                break;
            case "SATURDAY": numberOfDay = DaysOfWeek.SATURDAY.getNumberOfDay();
                break;
            case "SUNDAY": numberOfDay = DaysOfWeek.SUNDAY.getNumberOfDay();
                break;
                default:
                    return -1;
        }
        return numberOfDay;
    }
}
