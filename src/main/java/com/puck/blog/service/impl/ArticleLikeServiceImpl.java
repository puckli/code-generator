package com.puck.blog.service.impl;

import com.puck.blog.entity.ArticleLike;
import com.puck.blog.mapper.ArticleLikeMapper;
import com.puck.blog.service.IArticleLikeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章点赞表 服务实现类
 * </p>
 *
 * @author puck
 * @since 2019-04-05
 */
@Service
public class ArticleLikeServiceImpl extends ServiceImpl<ArticleLikeMapper, ArticleLike> implements IArticleLikeService {

}
