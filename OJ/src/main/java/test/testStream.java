package test;

import java.io.FileInputStream;
import java.io.IOException;

public class testStream {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("e:/test.txt");
//        String s = "hello";
//        fileOutputStream.write(s.getBytes());
//        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("e:/test.txt");
        while (true) {
            int c = fileInputStream.read();
            if (c == -1) {
                // c 是读取到的字节
                // 如果读取文件完毕了，就会返回 -1
                break;
            }
            System.out.print((byte)c);
        }
        fileInputStream.close();
    }
}
