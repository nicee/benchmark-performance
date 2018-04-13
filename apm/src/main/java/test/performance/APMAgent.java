package test.performance;

import java.lang.instrument.Instrumentation;

/**
 * 这个类用于创建一个APM Agent的入口，可适配 -javaagent 参数
 *
 * @project benchmark-performance
 * @time 2018/3/23 16:37
 */
public class APMAgent {

    /**
     * 此方法是执行在Main函数方法之前的方法，它需要通过指定 -javaagent 来实现
     *
     * @param args
     * @param instrumentation
     */
    public static void premain(String args, Instrumentation instrumentation) {
        System.out.println("Running in premian...");
        SimpleTransformer logger = new SimpleTransformer();
        instrumentation.addTransformer(logger);
    }

}
