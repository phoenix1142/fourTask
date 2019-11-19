package com.aqacourses.homework_lesson4.student;

import java.util.List;

public class Student extends AbstractStudent {

    /**
     * Verify that data is not empty
     *
     * @param data
     * @return true if not empty false otherwise
     */
    protected boolean isDataValid(List<String> data) {
        if (!data.isEmpty()) {
            return true;
        }
        return false;
    }

}
