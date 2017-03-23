package _5oneToOneMapperReturnType.po;

/**
 * Created by acey on 17-3-23.
 *
 */

//通过映射订单和用户得到的结果，让此类尽量继承字段较多的pojo
public class OrderCustom extends Order {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
