package test.performance;

/**
 * 这个类用于测试发生"java.lang.StackOverflowError"异常
 * <p>
 * JVM ARGS: -Xms50m -Xmx50m -Xss256k -XX:+HeapDumpOnOutOfMemoryError
 *
 * @project benchmark-performance
 * @time 2018/3/22 17:30
 */
public class StackOverflowErrorTest {

    static int deep = 0;

    private static void increaseDeep() {
        deep += 1;
        increaseDeep();
    }

    public static void main(String[] args) {
        try {
            increaseDeep();
        } finally {
            System.out.println("当前函数递归执行次数: " + deep);
        }
    }

}
