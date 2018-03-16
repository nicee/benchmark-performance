package test.performance;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.performance.service.IWorkService;

/**
 * dubbo消费端启动类，通过此类可以调用ServerStarter中提供的服务
 * <p>
 * 通过使用Spring提供读取xml文件的方式，加载dubbo-client.xml配置文件进行消费接口调用
 *
 * @project benchmark-performance
 * @time 2018/3/15 15:23
 */
public class DubboClientStarter {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-client.xml");
        IWorkService workService = applicationContext.getBean(IWorkService.class);

        workService.connect();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println("invoke result: " + workService.work());
        }
        System.out.println("test cost: " + (System.currentTimeMillis() - start));

        // Collectors.toMap(SimplePOJO::getName, SimplePOJO::getName, i -> i)));
        // 关闭，退出
        applicationContext.stop();
    }

}
