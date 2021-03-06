package com.jw.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.jw.dao.UserDao;
import com.jw.pojo.User;

public class UserRealm extends AuthorizingRealm{
	@Autowired
	private UserDao userMapper;

	//获取授权信息
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		String userName=(String) principals.getPrimaryPrincipal();
		SimpleAuthenticationInfo authenticationInfo=new SimpleAuthenticationInfo();		
		return null;
	}

	//获取身份验证信息--登录时候执行
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String userName=(String) token.getPrincipal();//得到用户名
		User user=userMapper.getUserByName(userName);
		if(user!=null){
			return new SimpleAuthenticationInfo(userName, user.getPassword(),null,getName());
		}
		return null;
	}

}
