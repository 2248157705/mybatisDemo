package _6oneToOneMapperReturnMap.mapper;

import _5oneToOneMapperReturnType.po.OrderCustom;

import java.util.List;

/**
 * Created by acey on 17-3-23.
 */
public interface OrderMapper {
     List<OrderCustom> findOrdersUser();
}
