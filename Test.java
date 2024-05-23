
public class Test {
    public static void main(String[] args) {
        //创建一个实例化对象
        Person per1 = new Person();
        //通过对象来调用实例变量、成员方法
        per1.name = "小韩";
        per1.age = 18;
        per1.sex = "女";
        per1.print();
        Person per2 = new Person();
        per2.print();
    }
}

class Person {
    //成员变量（实例变量)，在堆中的每个对象中存储，通过对象调用
    String name;//默认值为null
    int age;//默认值为0
    String sex;//默认值为null

    //成员方法（实例方法），在JVM的方法区中存储，通过对象调用
    void eat(String food) {
        System.out.println(name + "正在吃" + food);
    }

    void print() {
        System.out.println("name:" + name + ", age:" + age + ", sex:" + sex);
    }
}
