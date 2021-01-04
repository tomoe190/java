package test1_4;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

//一个类要包含那些属性和方法，根据实际场景确定
public class Cat {
    public String name;
    public String gender;
    public int age;
    public String breed;
    public String color;

//    public void eat(String food){
//        System.out.println(name+"正在吃"+food);
//    }
//
//    public void sleep(){
//        System.out.println(name+"正在睡觉");
//    }

    public Cat(){
        name = "糯米";
        gender = "公猫";
        age = 1;
        breed = "中华田园猫";
        color = "橘色";
    }

    {
        name = "苹果";
    }



//    public Cat(String name){
//        //表示当前对象的引用，相当于“我”
//        //this.name 成员变量
//        this.name = name;
//    }
}
