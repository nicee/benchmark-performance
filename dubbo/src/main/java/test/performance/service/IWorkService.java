package test.performance.service;

/**
 * 定义一个服务接口
 *
 * @project benchmark-performance
 * @time 2018/3/15 14:16
 */
public interface IWorkService {

    /**
     * 此方法用于首次消费端连接提供端的网络连接
     *
     * @throws Exception
     */
    void connect() throws Exception;

    /**
     * 业务消费方法
     *
     * @return
     * @throws Exception
     */
    Object work() throws Exception;

}
