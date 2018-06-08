package com.pinyougou.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.pinyougou.pojo.TbSeller;
import com.pinyougou.sellergoods.service.SellerService;

/**
 * 认证类
 * @author tong
 *
 */
public class UserDetailsServiceImpl implements UserDetailsService{

	//	跟dubbo扫描不同属于一个包，改用配置的形式
	private SellerService sellerService;

	public void setSellerService(SellerService sellerService) {
		this.sellerService = sellerService;
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("经过了UserDetailsServiceImpl");
		//构建角色列表
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ROLE_SELLER"));
		//得到商家对象
		TbSeller seller = sellerService.findOne(username);
		if(seller!=null){
			if(seller.getStatus().equals("1")){
				// 通过审核
				return new User(username, seller.getPassword(), authorities);
			}
		}
		return null;
		
	}

}
