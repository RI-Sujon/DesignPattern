package strategy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ConvertToJSON implements IConvert{

    final File input = new File("src//strategy//input.txt");
    List<String> output = new ArrayList<>();
    BufferedReader reader = null;
    BufferedWriter writer = null;

    public void execute(){
        try {
            reader = new BufferedReader(new FileReader(input));
            String line ;
            output.add("{") ;
            while((line = reader.readLine()) != null){
                String str =line.replaceAll(" ", "\": \"") ;
                str = "\t\"" + str + "\"";
                output.add(str);
            }
            output.add("}") ;

            reader.close();

            writer = new BufferedWriter(new FileWriter(new File("src//strategy//output.json")));
            int i = 0 ;
            for (String s : output) {
                writer.write(s);
                if(i==0){}
                else if(i<output.size()-2){writer.write(",");}
                writer.newLine();
                i++ ;
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

