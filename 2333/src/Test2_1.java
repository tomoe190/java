public class Test2_1 {
    public static void main(String[] args) {

    }
    public static void func4(int N,int M) {
        int count = 0;
        for (int i = 0; i < N ; i++) {
            for (int j = 0; j < N ; j++) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void func3(int N,int M) {
        int count = 0;
        for (int k = 0; k < M; k++) {
            count++;
        }
        for (int k = 0; k < N ; k++) {
            count++;
        }
        System.out.println(count);
    }

    public static void func2(int N) {
        int count = 0;
        for (int i = 0; i < 2 * N ; i++) {
            count++;
        }
        int M = 10;
        while ((M--) > 0) {
            count++;
        }
        System.out.println(count);
    }

    public static void func1(int N) {
        int count = 0;
        for (int i = 0; i < 10; i++) {
            count++;
        }
        System.out.println(count);
    }


}
