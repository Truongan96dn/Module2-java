package student_management_example.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    // tạo method ghi => write
    // dùng static
    // xác thông đầu vào của method
    // + tên file
    // + dữ liệu (String , List<String>)

    public static void writeStringToFile(String pathFile, String text, boolean append){
        File file = new File(pathFile);
        FileWriter fileWriter =null;
        BufferedWriter bufferedWriter =null;

        try {
            fileWriter = new FileWriter(file,append); // true ghi thêm, false : ghi đè
            bufferedWriter= new BufferedWriter(fileWriter);
            bufferedWriter.write(text);
            bufferedWriter.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    // tạo method để đọc dữ liệu => read
    // dung static
    // xác định đầu vào :
    // + tên file
    // xác định đầu ra :List<Sring>
    public static List<String> readFileToListString(String pathFile){
        List<String> stringList = new ArrayList<>();
        File file = new File(pathFile);
        FileReader fileReader = null;
        BufferedReader bufferedReader =null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line=null;
            while ((line= bufferedReader.readLine())!=null){
                stringList.add(line);
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stringList;
    }
}
