/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConvertToCSV implements IConvert {
    final File input = new File("src//strategy//input.txt");
    List<String> output = new ArrayList<>();
    BufferedReader reader = null;
    BufferedWriter writer = null;

    public void execute(){
        try {
            reader = new BufferedReader(new FileReader(input));
            String line;
            while((line = reader.readLine()) != null){
                output.add(line.replaceAll(" ", ","));
            }

            reader.close();

            writer = new BufferedWriter(new FileWriter(new File("src//strategy//output.csv")));
            for (String s : output) {
                writer.write(s);
                writer.newLine();
            }

            writer.flush();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
