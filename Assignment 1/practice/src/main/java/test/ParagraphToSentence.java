package test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ParagraphToSentence {
    public static String readFileAsString(String fileName)throws Exception
    {
//        String fileName = "/Users/pankaj/source.txt";
        Path path = Paths.get(fileName);
        byte[] bytes = Files.readAllBytes(path);
        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);
        String output = "";
        for(String s: allLines)
        {
            output=output+s.replaceAll("\n","")+" ";
        }

        return output;
    }
    public static void write(String output)
    {
        try {
//            FileWriter myWriter = new FileWriter("/media/ubuntu/DataLinux/Mtech/AZ-coding/practice/src/main/resources/output.txt",true);
            FileWriter myWriter = new FileWriter("/media/ubuntu/DataLinux/Mtech/AZ-coding/practice/src/main/resources/outputBingFix.txt",true);
            myWriter.write(output);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) throws Exception {

//        String s=readFileAsString("/media/ubuntu/DataLinux/Mtech/AZ-coding/practice/src/main/java/test/InputString.txt");
        String s=readFileAsString("/media/ubuntu/DataLinux/Mtech/AZ-coding/practice/src/main/resources/bingT.txt");
//        System.out.println(s);
//        String output="";
        /* Sentence separation*/
//        Arrays.stream(s.replaceAll("\n"," ").replaceAll("\\. ",".").split("\\.")).forEach(s1 -> write(s1+".\n"));
        /*Remove spaces*/
        Arrays.stream(s.replaceAll("\n"," ").replaceAll("।( )*","।").split("।")).forEach(s1 -> write(s1+"।\n"));
    }
}
