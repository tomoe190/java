public class Test2_1 {
    public static void main(String[] args) {

    }
    public static int fibonacci(int N) {
        if (N <= 2) {
            return 1;
        }
        return fibonacci(N - 1) + fibonacci(N - 2);
    }

    public static int factorial(int num) {
        if(num < 2) {
            return num;
        }
        return factorial(num - 1) * num;
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
