package case_study_module_2.furama_management.utils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public static List<String> readFile(String path){
        FileReader fileReader = null;
        List<String> stringList = new ArrayList<>();
        String line ="";
        try {
            fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line=bufferedReader.readLine())!=null){
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }return stringList;
    }
    public static void writeFile(String path, List<String> list,boolean append){
        try {
            FileWriter fileWriter=new FileWriter(path,append);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (String line:list) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
