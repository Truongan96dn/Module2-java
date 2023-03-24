package io_text.copy_file_text;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader("module_2/src/io_text/copy_file_text/SourceFile.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            int count = 0;
            while((line = bufferedReader.readLine()) != null){
                for (int i = 0; i < line.length(); i++) {
                    if(line.charAt(i) !=' '){
                        count++;
                    }
                }
                FileWriter fileWriter = new FileWriter("module_2/src/io_text/copy_file_text/TargetFile",true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.close();
            }
            System.out.println("có  "+count +" ký tự trong tệp");
        } catch (FileNotFoundException e) {
            System.out.println("tệp tin nguồn không đúng hoặc không tồn tại ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
