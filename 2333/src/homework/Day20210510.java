package homework;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.Int;

public class Day20210510 {
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        while (input.hasNextLine()) {
//            String snum = input.nextLine();
//            int num = Integer.parseInt(snum);
//            countOfBottle(num);
//        }
//    }
//
//    private static void countOfBottle(int num) {
//        int count = 0;
//        while (num >= 2) {
//            if (num == 2) {
//                System.out.println(count + 1);
//                return ;
//            }
//            count = num / 3;
//            num = num % 3;
//        }
//        System.out.println(count);
//    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String s1 = in.nextLine();
            String s2 = in.nextLine();
            String max = s1.length() >= s2.length()?s1:s2;
            String min = s1.length() >= s2.length()?s2:s1;
            int l = 0;
            String s ="";
            for(int i=0;i<min.length();i++){
                for(int j=i+1;j<=min.length();j++){
                    if(max.contains(min.substring(i,j)) && j-i>l){
                        l=j-i;
                        s=min.substring(i,j);
                    }
                }
            }
            System.out.println(s);
        }
    }
}

