package com.ppdtbb.proxy.jdk;

public class TestFindLove {

    public static void main(String[] args) {
        //new XiaoXingxing().findLove();

        try {
            Person obj = (Person) new Meipo().getInstance(new XiaoXingxing());
            obj.findLove();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
