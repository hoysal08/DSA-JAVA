package IOstreams;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class WordFrequency {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> freqencyMap = new HashMap<>();
        File ipFile = new File("src/IOstreams/ip.txt");
        BufferedReader reader = new BufferedReader(new FileReader(ipFile));
        reader.lines().forEach(newLine -> {
            Integer count = freqencyMap.getOrDefault(newLine, 0);
            freqencyMap.put(newLine, ++count);
        });
        reader.close();
        String opFileName = "src/IOstreams/op.txt";
        File myObj = new File(opFileName);
        if (myObj.createNewFile()) {
            System.out.println("File created: " + myObj.getName());
        } else {
            System.out.println("File already exists.");
        }
        FileWriter writer = new FileWriter(opFileName);
        writer.write(freqencyMap.toString());
        writer.close();
        System.out.println(freqencyMap.toString());
    }
}
