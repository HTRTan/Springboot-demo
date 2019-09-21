package com.totwo.createdemo.servicelmpl;



import com.totwo.createdemo.entity.UserDataBean;
import com.totwo.createdemo.mapper.MainMapper;
import com.totwo.createdemo.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MainServicelmpl implements MainService {
    @Autowired
    private MainMapper mMainMapper;


    @Override
    public List<UserDataBean> getAllUserData() {
        //这里可以写一些业务逻辑
        List<UserDataBean> mUserDataBean = mMainMapper.getAllUserData();//与mapper层操作数据库，这里是获取所有用户资料
        return mUserDataBean;
//        return mMainMapper.getAllUserData(); //可以直接输出
    }

    @Override
    public UserDataBean getUserData_ByUserID(int mUserID) {
        return mMainMapper.getUserData_ByUserID(mUserID);
    }

    @Override
    public Integer deleteUserData_ByUserID(int mUserID) {
        return mMainMapper.deleteUserData_ByUserID(mUserID);
    }

    @Override
    public Integer updateUserData_ByUserID(UserDataBean mUserDataBean) {
        return mMainMapper.updateUserData_ByUserID(mUserDataBean);
    }

    @Override
    public Integer insertUserData(UserDataBean mUserDataBean) {
        return mMainMapper.insertUserData(mUserDataBean);
    }
}
