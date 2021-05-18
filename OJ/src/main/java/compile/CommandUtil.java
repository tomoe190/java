package compile;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

// 通过这个类来创建进程，并执行javac、java 等命令
public class CommandUtil {

    // run 方法用来创建进程并执行命令
    // cmd 表示要执行的命令，比如 javac
    // stdoutFile 指定标准输出写到哪个文件中
    // stderrFile 指定标准错误写到哪个文件中
    public static int run (String cmd,String stdoutFile,String stderrFile) throws IOException, InterruptedException {
        // 新创建一个进程，用 Runtime 这样的类完成进程的创建
        // 注意：Runtime 有现成的唯一的实例，不需要创建新的实例
        Process process = Runtime.getRuntime().exec(cmd);

        // 获取新进程的输出结果
        if (stdoutFile != null) {
            // 通过这个对象读取到当前新进程的标准输出的内容
            InputStream stdoutFrom = process.getInputStream();
            // 从新进程中依次读取每个字节，写入到 stdoutTo
            FileOutputStream stdoutTo = new FileOutputStream(stdoutFile);
            while (true) {
                int c = stdoutFrom.read();
                if (c == -1) {
                    break;
                }
                stdoutTo.write(c);
            }
            // 循环结束即文件读写完毕，关闭文件
            stdoutFrom.close();
            stdoutTo.close();
        }

        // 再针对标准错误进行重定向
        if (stderrFile != null) {
            InputStream stderrFrom = process.getErrorStream();
            FileOutputStream stderrTo = new FileOutputStream(stderrFile);
            while (true) {
                int c = stderrFrom.read();
                if (c == -1) {
                    break;
                }
                stderrTo.write(c);
            }
            stderrFrom.close();
            stderrTo.close();
        }
        // 等待新进程结束，并获取到退出码
        int exitCode = process.waitFor();
        return exitCode;
    }

}
