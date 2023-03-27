package io_binary_file.copy_binary;

import java.io.*;

public class FileCopyBinary {
    public static void main(String[] args) {
        String sourceFile = "module_2/src/io_binary_file/copy_binary/SourceFile.dat";
        String targetFile = "module_2/src/io_binary_file/copy_binary/TargetFile.dat";
        File file = new File(sourceFile);
        if (!file.exists()) {
            System.out.println("File source không tồn tại !");
            return;
        }
        if (new File(targetFile).exists()) {
            System.out.println("File target đã tồn tại !");
        }
        try {
            InputStream inputStream = new FileInputStream(sourceFile);
            OutputStream outputStream = new FileOutputStream(targetFile);
            byte[] buffer = new byte[1024];
            int lenght;
            while ((lenght = inputStream.read(buffer)) > 0) {
                outputStream.write(buffer, 0, lenght);
            }
            inputStream.close();
            outputStream.close();
            System.out.println("Có " + file.length() * 2 + " byte trong file ");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
