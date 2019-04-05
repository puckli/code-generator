package com.puck.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author puck
 * @since 2019-04-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 作者:userId
     */
    private Long author;

    /**
     * 标题
     */
    private String title;

    /**
     * 摘要
     */
    private String summary;

    /**
     * 内容
     */
    private String content;

    /**
     * 标签，多个逗号隔开
     */
    private String tags;

    /**
     * 点击量
     */
    private Long click;

    /**
     * 点赞数
     */
    private Long like;

    /**
     * 收藏数
     */
    private Long collect;

    /**
     * 可见性：1所有人，2仅自己，3关注我的
     */
    private Integer visible;

    /**
     * 状态，1正常，4草稿状态
     */
    private Integer status;

    /**
     * 创建时间
     */
    private LocalDateTime created;

    /**
     * 修改时间
     */
    private LocalDateTime modified;

    /**
     * 是否有效1,-1
     */
    private Integer yn;


}
