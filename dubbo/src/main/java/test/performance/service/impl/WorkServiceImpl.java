package test.performance.service.impl;

import test.performance.data.SimplePOJO;
import test.performance.service.IWorkService;

/**
 * 实现一个普通的业务接口
 *
 * @project benchmark-performance
 * @time 2018/3/15 14:18
 */
public class WorkServiceImpl implements IWorkService {

    @Override
    public void connect() throws Exception {
        System.out.println("connect over");
    }

    @Override
    public Object work() throws Exception {
        return new SimplePOJO("nicee", "nicee");
    }

}
