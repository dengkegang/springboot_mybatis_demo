package com.elifen.spring_demo.mapper;

import com.elifen.spring_demo.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    List<User> findAll();

    User findOneUser(Integer id);

    int insertOneUser(User user);

    int updateOneUser(User user);

    int deleteOneUser(Integer id);

}
