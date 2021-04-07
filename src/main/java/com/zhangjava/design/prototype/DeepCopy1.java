package com.zhangjava.design.prototype;

/**
 * 深拷贝示例1
 *
 * @author zhangxu
 * @date 2021/4/7 17:23
 */
public class DeepCopy1 implements Cloneable {

    // 基本类型数据
    private String name;
    private int age;

    // 引用类型数据
    private Sheep sheep;

    @Override
    protected DeepCopy1 clone() throws CloneNotSupportedException {
        // 基本类型数据，直接对象拷贝就行
        DeepCopy1 deepCopy1 = (DeepCopy1) super.clone();
        // 对引用类型的数据进行单独拷贝处理
        deepCopy1.sheep = sheep.clone();
        return deepCopy1;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        DeepCopy1 deepCopy = new DeepCopy1();
        deepCopy.setAge(18);
        deepCopy.setName("张三");

        Sheep sheep = new Sheep();
        sheep.setName("多利");
        sheep.setAge(2);

        deepCopy.setSheep(sheep);
        System.out.println(deepCopy);
        System.out.println(deepCopy.getSheep().hashCode());

        System.out.println("======== 拷贝数据 ========");

        // 对象拷贝
        DeepCopy1 deepCopy1 = deepCopy.clone();
        System.out.println(deepCopy1);
        System.out.println(deepCopy1.getSheep().hashCode());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sheep getSheep() {
        return sheep;
    }

    public void setSheep(Sheep sheep) {
        this.sheep = sheep;
    }

    @Override
    public String toString() {
        return "DeepCopy{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sheep=" + sheep +
                '}';
    }
}
