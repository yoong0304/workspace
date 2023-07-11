package a0711;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Read02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("j:/out.txt"));
        while(true) {
            String line = br.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        br.close();
    }
}
