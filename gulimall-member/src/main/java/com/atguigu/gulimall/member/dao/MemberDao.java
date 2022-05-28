package com.atguigu.gulimall.member.dao;

import com.atguigu.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xiongyuan
 * @email xiongyuanadd@163.com
 * @date 2022-05-15 21:28:18
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
