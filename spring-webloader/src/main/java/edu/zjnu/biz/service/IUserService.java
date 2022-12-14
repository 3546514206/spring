package edu.zjnu.biz.service;

import edu.zjnu.biz.entity.User;

import java.util.List;

/**
 * @description: IUserService
 * @author: 杨海波
 * @date: 2022-05-19 08:59
 **/
public interface IUserService {

    /**
     *
     * @param id
     */
    User getUserInfoById(Long id);

    /**
     *
     * @param id
     * @return
     */
    List<User> getUserVOS(long id);
}
