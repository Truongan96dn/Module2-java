package io_text;

import java.io.*;
import java.util.Arrays;

public class ReadATextFile {
    public static void main(String[] args) throws FileNotFoundException {

        try {
            File inFile = new File("module_2/src/io_text/countrylist.txt");
            FileReader fileReader = new FileReader(inFile);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = "";
            String[] nation;
            while ((line = reader.readLine()) != null) {
                nation = line.split(",");
                Country country = new Country();
                country.setId(Integer.parseInt(nation[0]));
                country.setCountryCode(nation[1]);
                country.setCountryName(nation[2]);
                System.out.println(country);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

