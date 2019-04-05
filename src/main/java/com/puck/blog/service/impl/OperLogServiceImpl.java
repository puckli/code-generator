package com.puck.blog.service.impl;

import com.puck.blog.entity.OperLog;
import com.puck.blog.mapper.OperLogMapper;
import com.puck.blog.service.IOperLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 操作日志表 服务实现类
 * </p>
 *
 * @author puck
 * @since 2019-04-05
 */
@Service
public class OperLogServiceImpl extends ServiceImpl<OperLogMapper, OperLog> implements IOperLogService {

}
