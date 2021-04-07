package com.zhangjava.design.prototype;

import java.io.*;

/**
 * 深拷贝示例2，反序列化实现方式
 *
 * @author zhangxu
 * @date 2021/4/7 17:23
 */
public class DeepCopy2 implements Serializable {

    // 基本类型数据
    private String name;
    private int age;

    // 引用类型数据
    private Sheep sheep;

    /**
     * 反序列化属性拷贝
     *
     * @return
     */
    public DeepCopy2 cloneObject() {
        DeepCopy2 deepCopy2 = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            deepCopy2 = (DeepCopy2) ois.readObject();
        } catch (IOException | ClassNotFoundException ioException) {
            ioException.printStackTrace();
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
                if (oos != null) {
                    oos.close();
                }
                if (bis != null) {
                    bis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        }

        return deepCopy2;
    }

    public static void main(String[] args) {
        DeepCopy2 deepCopy = new DeepCopy2();
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
        DeepCopy2 deepCopy2 = deepCopy.cloneObject();
        System.out.println(deepCopy2);
        System.out.println(deepCopy2.getSheep().hashCode());
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
