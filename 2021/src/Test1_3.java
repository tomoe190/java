public class Test1_3 {
    public static void main(String[] args) {
        //不接引用则不会出现异常
        int[] arr={1,2,3,4};
        arr=null;
        if(arr == null){

        }

        //对 空引用 进行解引用则会出现NullPointerException
//        int[] arr=null;
//        System.out.println(arr[0]);
//        System.out.println(arr.length);

        //两个引用指向一个对象，修改对象，其他引用可以看到。
//        int[] arr1=new int[]{1,2,3,4};
//        int[] arr2=arr1;
//        System.out.println(arr1[0]);
//        System.out.println("修改 0 号元素的值");
//        arr2[0]=100;
//        System.out.println(arr1[0]);
    }
}
