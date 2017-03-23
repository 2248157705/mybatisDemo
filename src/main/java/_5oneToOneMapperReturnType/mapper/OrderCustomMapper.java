package _5oneToOneMapperReturnType.mapper;

import _5oneToOneMapperReturnType.po.OrderCustom;

import java.util.List;

/**
 * Created by acey on 17-3-23.
 */
public interface OrderCustomMapper {
     List<OrderCustom> findOrdersUser();
}
