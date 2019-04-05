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
 * 用户
 * </p>
 *
 * @author puck
 * @since 2019-04-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 账号名
     */
    private String name;

    /**
     * 昵称
     */
    private String nickname;

    private String password;

    /**
     * phone
     */
    private String phone;

    /**
     * email
     */
    private String email;

    /**
     * age
     */
    private Integer age;

    /**
     * 用户类型，1普通用户,1024管理员
     */
    private Integer type;

    /**
     * 用户账号状态,1正常，2冻结
     */
    private Integer status;

    /**
     * 关注数
     */
    private Integer follow;

    /**
     * 创建人
     */
    private Long creator;

    /**
     * 扩展信息
     */
    private String extendFields;

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
