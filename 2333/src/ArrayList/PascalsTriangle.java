package ArrayList;

import java.util.ArrayList;
import java.util.List;
//
//public class PascalsTriangle {
//    public List<List<Integer>> generate(int numRows) {
//        if (numRows <= 0) {
//            return new ArrayList<>();
//        }
//        List<List<Integer>> result = new ArrayList<>();
//
//        List<Integer> firstLine = new ArrayList<>();
//        firstLine.add(1);
//        result.add(firstLine);
//        if (numRows == 1) {
//            return result;
//        }
//
//        List<Integer> secondLine = new ArrayList<>();
//        secondLine.add(1);
//        secondLine.add(1);
//        result.add(secondLine);
//        if (numRows == 2) {
//            return result;
//        }
//
//        for (int row = 3; row <= numRows; row++) {
//            List<Integer> curLine = new ArrayList<>();
//            curLine.add(1);
//            List<Integer> prevLine = result.get(row - 1 - 1);
//            for (int col = 2; col <= row - 1; col++) {
//                curLine.add(prevLine.get(col - 1) + prevLine.get(col - 1 - 1));
//                result.add(curLine);
//            }
//            curLine.add(1);
//        }
//        return result;
//    }
//}

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();

        // 第 1 行
        List<Integer> firstLine = new ArrayList<>();
        firstLine.add(1);
        result.add(firstLine);
        if (numRows == 1) {
            return result;
        }

        // 第 2 行
        List<Integer> secondLine = new ArrayList<>();
        secondLine.add(1);
        secondLine.add(1);
        result.add(secondLine);
        if (numRows == 2) {
            return result;
        }

        // 第 3 ~ n 行
        for (int row = 3; row <= numRows; row++) {
            List<Integer> curLine = new ArrayList<>();
            curLine.add(1);
            List<Integer> prevLine = result.get(row - 1 - 1);
            for (int col = 2; col <= row - 1; col++) {
                int num1 = prevLine.get(col - 1 - 1);
                int num2 = prevLine.get(col - 1);
                curLine.add(num1 + num2);
            }
            curLine.add(1);
            result.add(curLine);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}