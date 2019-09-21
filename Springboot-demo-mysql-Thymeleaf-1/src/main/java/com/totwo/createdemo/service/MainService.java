package com.totwo.createdemo.service;


import com.totwo.createdemo.entity.UserDataBean;

import java.util.List;

public interface MainService {

    /**
     * 获取全部用户资料
     * @return
     */
    List<UserDataBean> getAllUserData();

    /**
     * 通过user_id获取一个用户资料
     * @param mUserID
     * @return
     */
    UserDataBean getUserData_ByUserID(int mUserID);

    /**
     * 通过user_id删除一个用户资料
     * @param mUserID
     * @return
     */
    Integer deleteUserData_ByUserID(int mUserID);

    /**
     * 通过user_id更新一个用户资料
     * @param mUserDataBean
     * @return
     */
    Integer updateUserData_ByUserID(UserDataBean mUserDataBean);

    /**
     * 插入一个新的用户资料
     * @param mUserDataBean
     * @return
     */
    Integer insertUserData(UserDataBean mUserDataBean);

}
