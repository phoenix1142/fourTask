package com.aqacourses.homework_lesson4.student;

import com.aqacourses.homework_lesson4.interfaces.ParseFileInterface;
import com.aqacourses.homework_lesson4.interfaces.WriteToDbInterface;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentPedin extends Student implements ParseFileInterface, WriteToDbInterface {
    private BufferedReader bufferedReader;
    private FileWriter fileWriter;
    private PrintWriter printWriter;

    /**
     * Parse student data in file
     * @param pathToFile
     * @return
     */
    @Override
    public List<String> parseFiledInterface(String pathToFile) {
        List<String> result = new ArrayList<>();
        try {
            openConnection(pathToFile);
            String str;
            while((str=bufferedReader.readLine())!=null){
                result.add(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
return result;
    }

    /**
     * Write student data to My DB
     * @param data
     */
    @Override
    public void writeToDb(List<String> data) {
        try {
            if(!isValidData(data)){
                return;
            }
            openConnectionToDb();
            if (isDataValid(data)) {
                for (String datum : data) {
                    printWriter.println(getDate() + " - " + datum);
                }
                printWriter.print("=====================\n");
                System.out.println("All data is written to My DB");
                closeConnectionToDb();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private void openConnection(String path) throws IOException {
        File file = new File(path);
        bufferedReader = new BufferedReader(new FileReader(file));


    }
    private void openConnectionToDb() throws IOException {
        String path = "src/resources/My-DB.txt";
        fileWriter = new FileWriter(path);
        printWriter = new PrintWriter(fileWriter);
    }

    /**
     * CLose connection to MySQL DB
     */
    private void closeConnectionToDb() throws IOException {
        printWriter.close();
        fileWriter.close();
        System.out.println("Close connection to MySQL DB");
    }
}
