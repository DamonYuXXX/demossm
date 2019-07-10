package com.demo.service;

import com.demo.dao.entity.UserEntity;

public interface UserService {
    /**
     * 创建用户
     *
     * @param userEntity
     * @return
     */
    Integer createUser(UserEntity userEntity);

    /**
     * 更新用户
     *
     * @param userEntity
     * @return
     */
    Integer updateUser(UserEntity userEntity);

    /**
     * 删除用户
     *
     * @param id
     * @return
     */
    Integer deleteUser(Integer id);

    /**
     * 根据用户id查询用户
     *
     * @param id
     * @return
     */
    UserEntity getUserById(Integer id);
}
