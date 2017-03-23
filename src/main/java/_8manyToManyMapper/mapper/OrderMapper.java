package _8manyToManyMapper.mapper;

import _8manyToManyMapper.po.User;

import java.util.List;

/**
 * Created by acey on 17-3-23.
 */
public interface OrderMapper {
     List<User> findOrdersUser();
}
