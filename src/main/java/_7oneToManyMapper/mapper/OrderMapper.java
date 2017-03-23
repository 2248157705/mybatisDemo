package _7oneToManyMapper.mapper;

import _7oneToManyMapper.po.Order;

import java.util.List;

/**
 * Created by acey on 17-3-23.
 */
public interface OrderMapper {
     List<Order> findOrdersUser();
}
