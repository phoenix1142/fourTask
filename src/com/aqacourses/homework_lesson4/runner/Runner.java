package com.aqacourses.homework_lesson4.runner;

import com.aqacourses.homework_lesson4.student.Student;
import com.aqacourses.homework_lesson4.student.StudentMogilyanka;
import com.aqacourses.homework_lesson4.student.StudentNki;
import com.aqacourses.homework_lesson4.student.StudentPedin;

import java.util.List;

public class Runner {

    /**
     * Add some student to DBs
     *
     * @param args
     */
    public static void main(String[] args) {

        // Create instance of NKI student
        StudentNki studentNki = new StudentNki();

        // Imagine that GUI opens
        studentNki.openGui();

        // Parse data
        List<String> data = studentNki.parseData();

        // Write data to 'DB'
        studentNki.writeToDb(data);

        // Clear list for reusing
        data.clear();

        // Create instance of Mogilyanka student
        StudentMogilyanka studentMogilyanka = new StudentMogilyanka();

        // Imagine that GUI opens one more time
        studentMogilyanka.openGui();

        // Parse data again
        data = studentMogilyanka.parseData();

        // Write data to another 'DB'
        studentMogilyanka.writeToDb(data);

        // It's possible to create instance of class in that way
        // using inheritance
        Student student1 = new StudentMogilyanka();
        Student student2 = new StudentNki();

        // create StudentPedin object and choose file to parse
        StudentPedin studentPedin = new StudentPedin();
        studentPedin.writeToDb(studentPedin.parseFiledInterface("src/resources/My-DB.txt"));

    }

    // Overloading as is
    private void setId(int id) {

    }

    private void setId(String id) {

    }

    private void setId(String idString, int id) {

    }

    private void setId() {

    }

}
