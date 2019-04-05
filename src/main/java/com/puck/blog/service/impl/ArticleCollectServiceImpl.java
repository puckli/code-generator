package com.puck.blog.service.impl;

import com.puck.blog.entity.ArticleCollect;
import com.puck.blog.mapper.ArticleCollectMapper;
import com.puck.blog.service.IArticleCollectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章收藏表 服务实现类
 * </p>
 *
 * @author puck
 * @since 2019-04-05
 */
@Service
public class ArticleCollectServiceImpl extends ServiceImpl<ArticleCollectMapper, ArticleCollect> implements IArticleCollectService {

}
