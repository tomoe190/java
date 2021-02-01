import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i);
                String tmp = stringBuffer.toString();
                if(!tmp.contains(String.valueOf(ch))) {
                    stringBuffer.append(ch);
                }
            }
            System.out.println(stringBuffer);
        }
    }
}


