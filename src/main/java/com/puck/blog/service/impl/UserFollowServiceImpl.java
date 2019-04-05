package com.puck.blog.service.impl;

import com.puck.blog.entity.UserFollow;
import com.puck.blog.mapper.UserFollowMapper;
import com.puck.blog.service.IUserFollowService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户关注 服务实现类
 * </p>
 *
 * @author puck
 * @since 2019-04-05
 */
@Service
public class UserFollowServiceImpl extends ServiceImpl<UserFollowMapper, UserFollow> implements IUserFollowService {

}
