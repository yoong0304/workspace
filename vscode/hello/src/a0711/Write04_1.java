package a0711;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Write04_1 {
    public static void main(String[] args) throws IOException {

        PrintWriter pw = new PrintWriter("j:/out1.txt");
        for(int i = 1; i < 11; i++) {
            String data = i + "번째 줄입니다.\n";
            pw.write(data);
        }
        pw.close();

        // printWriter를 사용할 경우에는 생성자 파라미터로 파일명 대신 추가로 열린 FileWriter에 객체를 전달해야한다.
        PrintWriter pw2 = new PrintWriter(new FileWriter("j:/out1.txt", true));
        for(int i = 11; i < 21; i++) {
            String data = i + "번째 줄입니다.\n";
            pw2.write(data);
        }
        pw2.close();


    }
}
