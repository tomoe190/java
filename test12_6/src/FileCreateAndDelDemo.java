import java.io.File;
import java.io.IOException;

//public class FileCreateAndDelDemo {
//    public static void main(String[] args) {
//        File file=new File("Hello.txt");
//        File dir=new File("\\creatDir");
//        System.out.println("文件是否存在："+file.exists());
//        System.out.println("文件夹是否存在："+dir.exists());
//
//        if (!file.exists()){
//            try{
//                file.createNewFile();
//            } catch(IOException e){
//                e.printStackTrace();
//            }
//        }
//        if(!dir.exists()){
//            dir.mkdir();
//        }
//        System.out.println("文件是否存在："+file.exists());
//        System.out.println("文件夹是否存在："+dir.exists());
//        System.out.println("文件的绝对路径是："+file.getAbsolutePath());
//        System.out.println("文件夹的绝对路径是"+dir.getAbsolutePath());
//
//        file.delete();
//        System.out.println("文件是否存在："+file.exists());
//    }
//
//
//}


public class FileCreateAndDelDemo{
    public static void main(String[] args) throws IOException {
        File file=new File("Hello.txt");
        File dir=new File("\\creatDir");
        System.out.println("文件是否存在："+file.exists());
        System.out.println("文件夹是否存在："+dir.exists());

        if(!file.exists()){
            try{
                file.createNewFile();
            }catch(IOException e){
                e.printStackTrace();
            }
        }
        if(!dir.exists()){
            dir.mkdir();
        }


        System.out.println("文件是否存在："+file.exists());
        System.out.println("文件夹是否存在："+dir.exists());
        System.out.println("文件的绝对路径是："+file.getAbsolutePath());
        System.out.println("文件夹的绝对路径是："+dir.getAbsolutePath());

        file.delete();
        System.out.println("文件是否存在"+file.exists());

    }




}