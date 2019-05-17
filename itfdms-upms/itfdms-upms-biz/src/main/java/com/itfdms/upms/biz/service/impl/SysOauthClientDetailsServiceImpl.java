package com.itfdms.upms.biz.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itfdms.common.core.constant.SecurityConstants;
import com.itfdms.upms.api.entity.SysOauthClientDetails;
import com.itfdms.upms.biz.mapper.SysOauthClientDetailsMapper;
import com.itfdms.upms.biz.service.SysOauthClientDetailsService;
import org.springframework.cache.annotation.CacheEvict;

/**
　　* @description: 服务实现类
　　* @param
　　* @return
　　* @throws
　　* @author lxr
　　* @date 2019/5/15 12:12
　　*/
public class SysOauthClientDetailsServiceImpl extends ServiceImpl<SysOauthClientDetailsMapper, SysOauthClientDetails> implements SysOauthClientDetailsService {

	/**
	 * 通过ID删除客户端
	 *
	 * @param id
	 * @return
	 */
	@Override
	@CacheEvict(value = SecurityConstants.CLIENT_DETAILS_KEY, key = "#id")
	public Boolean removeClientDetailsById(String id) {
		return this.removeById(id);
	}

	/**
	 * 根据客户端信息
	 *
	 * @param clientDetails
	 * @return
	 */
	@Override
	@CacheEvict(value = SecurityConstants.CLIENT_DETAILS_KEY, key = "#clientDetails.clientId")
	public Boolean updateClientDetailsById(SysOauthClientDetails clientDetails) {
		return this.updateById(clientDetails);
	}
}
