package test.performance;

import com.alibaba.dubbo.container.Main;

/**
 * dubbo服务端启动类，通过使用dubbo框架中默认的Main类来运行启动服务
 * <p>
 * 默认采用spring容器启动dubbo服务，且读取配置文件为 META-INF/spring/*.xml
 *
 * @project benchmark-performance
 * @time 2018/3/15 14:36
 */
public class DubboServerStarter {

    public static void main(String[] args) {
        Main.main(args);
    }

}
