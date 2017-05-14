package oooEntryTest.utils;

import java.io.*;
import java.util.Arrays;

/**
 *  Created by Vorobiei on 18.05.2016.
 */
public class FileUtils {
    public static String readFile(String path) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(new File("src/resources/WarAndPeace.txt")));
        StringBuilder sb = new StringBuilder();
        while (br.ready()){
            sb.append(br.readLine()).append("\n");
        }
        return sb.toString().substring(1);
    }
}
