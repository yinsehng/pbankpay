package com.pbankpay.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.pbankpay.dao.IUserDao;
import com.pbankpay.model.User;
import com.pbankpay.model.UserExtend;
import com.pbankpay.service.IUserService;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements IUserService {
    
    //自动装配
    @Resource
    private IUserDao userDao;
    
    /**
     * 分页
     */
    public List<UserExtend> queryUserPager(int pageNO, int size) {
        int skip=(pageNO-1)*size;
        return userDao.queryUserPager(skip, size);
    }
    
    /**
     * 查询用户总数
     */
    public int queryUserCount() {
        return userDao.queryUserCount();
    }
    
    /**
     * 根据用户id查询用户
     */
    public User queryUserById(int userid){
        return userDao.queryUserById(userid);
    }
    
    /**
     * 新增用户
     */
    public int insertUser(User user){
        return userDao.insertUser(user);
    }
    
    /**
     * 修改用户
     */
    public int updateUser(User user){
        return userDao.updateUser(user);
    }
    
    /**
     * 根据用户id删除用户
     */
    public int deleteUserById(int user_id){
        return userDao.deleteUserById(user_id);
    }
    
    /**
     * 删除多个用户
     */
    public int deleteUsers(int[] userIds){
        return userDao.deleteUsers(userIds);
    }
}