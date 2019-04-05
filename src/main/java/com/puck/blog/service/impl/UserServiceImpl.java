package com.puck.blog.service.impl;

import com.puck.blog.entity.User;
import com.puck.blog.mapper.UserMapper;
import com.puck.blog.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户 服务实现类
 * </p>
 *
 * @author puck
 * @since 2019-04-05
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
