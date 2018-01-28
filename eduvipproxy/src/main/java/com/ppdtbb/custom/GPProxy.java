package com.ppdtbb.custom;

import java.lang.reflect.Method;

/**
 * 生成代理对象的代码
 */
public class GPProxy {

    private static String ln = "\\r\\n";

    public static Object newProxyInstance(GPClassLoader classLoader, Class<?> interfaces) {

        //1、生成源代码
        String proxySrc = generateSrc(interfaces);

        //2、将生成的源代码输出到磁盘，保存为.java文件

        //3、编译源代码，并且生成.class文件

        //4、将class文件中的内容，动态加载到JVM中来

        //5、返回被代理后的代理对象

        return null;
    }

    private static String generateSrc(Class<?> interfaces) {

        StringBuffer src = new StringBuffer();
        src.append("package com.ppdtbb.custom;" + ln);
        src.append("import java.lang.reflect.Method" + ln);
        src.append("public class $Proxy0 implements " + interfaces.getName() + "{" + ln);

        src.append("GPInvocationHandler h;" + ln);
        src.append("public $Proxy0(GPInvocationHandler h) {" + ln);
        src.append("this.h = h;" + ln);
        for(Method m : interfaces.getMethods()) {
            src.append("public " + m.getReturnType() + " " + m.getName());
        }
        src.append("}" + ln);

        src.append("}");

        return "";
    }

}
