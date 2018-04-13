package test.performance;

import java.util.ArrayList;
import java.util.List;

/**
 * 这个类用于测试发生"java.lang.OutOfMemoryError: java heap space"异常
 * <p>
 * VM Args: -Xms50m -Xmx50m -XX:+HeapDumpOnOutOfMemoryError
 *
 * @project benchmark-performance
 * @time 2018/3/22 15:41
 */
public class OutOfMemInSpaceTest {

    public static void main(String[] args) {
        int i = 0;
        int block = 5 * 1024 * 1024;    // 5M
        List<byte[]> list = new ArrayList<>();
        while (true) {
            list.add(new byte[block]);
            System.out.println("分配次数：" + (++i));
        }
    }

}
