package com.aqacourses.homework_lesson1;
/* Создаем массив с типом данных int размером 4.
С помощью if / else if берем каждую ячейку и если элемент четный выводим в консоль слово True.
Если нечетный False. Цикл не используйте. До них еще доберемся.
 */

public class Array {
    public static void main(String[] args) {
        int [] intArray = new int[4];
        intArray = new int[]{0, 1, 2, 3};

       if (intArray[0] != 0 & intArray[0]%2 == 0){      // если бы по условию задачи,не нужно было использовать конкретно else if , поставил бы сразу && этого было бы достаточно
           System.out.println("True");
       }
       else if(intArray[0] != 0 && intArray[0]%2 == 0){
           System.out.println("True");
       }
       else{
           System.out.println("False");
       }

        if (intArray[1] != 0 & intArray[1]%2 == 0){
            System.out.println("True");
        }
        else if(intArray[1] != 0 && intArray[1]%2 == 0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        if (intArray[2] != 0 & intArray[2]%2 == 0){
            System.out.println("True");
        }
        else if(intArray[2] != 0 && intArray[2]%2 == 0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

        if (intArray[3] != 0 & intArray[3]%2 == 0){
            System.out.println("True");
        }
        else if(intArray[3] != 0 && intArray[3]%2 == 0){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }

    }

}
