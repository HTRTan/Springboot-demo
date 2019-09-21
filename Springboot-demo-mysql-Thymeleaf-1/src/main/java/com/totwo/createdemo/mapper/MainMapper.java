package com.totwo.createdemo.mapper;

import com.totwo.createdemo.entity.UserDataBean;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MainMapper {

    //获取全部用户资料
    @Select("Select * From totwo_userdata")
    List<UserDataBean> getAllUserData();

    //通过user_id获取一个用户资料
    @Select("Select * From totwo_userdata Where user_id = #{mUserID}")
    UserDataBean getUserData_ByUserID(int mUserID);

    //通过user_id删除一个用户资料
    @Delete("Delete From totwo_userdata Where user_id = #{mUserID}")
    Integer deleteUserData_ByUserID(int mUserID);

    //通过user_id更新一个用户资料
    @Update("Update totwo_Uuserdata Set username = #{username} , password = #{password} , email = #{email} , phone = #{phone} Where user_id = #{user_id}")
    Integer updateUserData_ByUserID(UserDataBean mUserDataBean);

    //插入一个新的用户资料
    @Insert("Insert Into totwo_userdata( username , password , email , phone ) Values (#{username},#{password},#{email},#{phone})")
    Integer insertUserData(UserDataBean mUserDataBean);

}
