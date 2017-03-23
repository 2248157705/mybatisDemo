package _9lazyLoading.mapper;

import _9lazyLoading.po.Order;
import _9lazyLoading.po.User;

import java.util.List;

/**
 * Created by acey on 17-3-23.
 */
public interface OrderMapper {
     List<Order> findOrders();
}
