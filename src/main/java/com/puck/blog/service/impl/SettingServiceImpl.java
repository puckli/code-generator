package com.puck.blog.service.impl;

import com.puck.blog.entity.Setting;
import com.puck.blog.mapper.SettingMapper;
import com.puck.blog.service.ISettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 系统设置表 服务实现类
 * </p>
 *
 * @author puck
 * @since 2019-04-05
 */
@Service
public class SettingServiceImpl extends ServiceImpl<SettingMapper, Setting> implements ISettingService {

}
