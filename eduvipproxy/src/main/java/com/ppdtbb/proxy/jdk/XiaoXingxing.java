package com.ppdtbb.proxy.jdk;

//小星星、单身
public class XiaoXingxing implements Person {

    private String sex = "女";
    private String name = "小星星";

    public void findLove() {
        System.out.println("我叫" + this.name + ",性别：" + this.getSex() + ",我找对象的要求是：");
        System.out.println("高富帅");
        System.out.println("有房有车的");
        System.out.println("身高要求180cm以上，体重70kg");
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
