package a0711;

import java.io.FileOutputStream;
import java.io.IOException;

public class Write01 {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("j:/out.txt");
        output.close();     // 생략 가능
    }
}
