package test.performance.data;

import java.io.Serializable;

/**
 * 一个简单POJO对象
 *
 * @project benchmark-performance
 * @time 2018/3/15 16:11
 */
public class SimplePOJO implements Serializable {

    private String name;

    private String password;

    public SimplePOJO(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "SimplePOJO{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
