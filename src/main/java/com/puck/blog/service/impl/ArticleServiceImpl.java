package com.puck.blog.service.impl;

import com.puck.blog.entity.Article;
import com.puck.blog.mapper.ArticleMapper;
import com.puck.blog.service.IArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author puck
 * @since 2019-04-05
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements IArticleService {

}
