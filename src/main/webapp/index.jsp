<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="css/index.css" type="text/css">
<html>
<body>
<!--登录注册二选一弹出框-->
<div id="loginOrRegister">
	<!--标题-->
	<div class="title">
		<span class="login colorRed" οnclick="goLogin()">登录</span>
		<span class="register" οnclick="goRegister()">注册</span>
	</div>
	<!--具体信息-->
	<div id="formInformation">
		<!--登录界面-->
		<form action="www.baidu.com" method="post" class="loginForm">
			<ul class="box box1">
				<li>
					<label for="account">账号</label>
					<input type="text" placeholder="请输入您的账号（即手机号）" class="account" id="account" />
					<span class="error"></span>
				</li>
				<li>
					<label for="password">密码</label>
					<input type="password" class="password" id="password" placeholder="请输入密码" />
					<span class="error"></span>
				</li>
				<li>
					<label for="authCode">验证码</label>
					<input type="text" class="sradd photokey" id="authCode" placeholder="请输入收到的验证码" />
					<span class="add authCode"></span>
					<span class="error"></span>
				</li>
			</ul>
			<div class="submit">
				<input type="submit" value="立即登录" />
			</div>
		</form>
		<!--注册界面-->
		<form action="www.baidu.com" method="post" class="registerForm">
			<ul class="box box2">
				<li>
					<label for="phone">手机</label>
					<input type="text" placeholder="请输入您的手机号码" id="phone" maxlength="11" />
					<span class="error"></span>
				</li>
				<li>
					<label for="authCode2">验证码</label>
					<input type="text" class="sradd phonekey" id="authCode2" placeholder="请输入收到的验证码" />
					<span class="add sendaAuthCode">发送验证码</span>
					<span class="error"></span>
				</li>
				<li>
					<label for="password2">密码</label>
					<input type="password" class="password" id="password2" placeholder="请输入密码" />
					<span class="error"></span>
				</li>
				<li>
					<label for="password3">确认密码</label>
					<input type="password" class="email" id="password3" placeholder="请再次输入密码" />
					<span class="error"></span>
				</li>
			</ul>
			<div class="submit">
				<input type="submit" value="立即注册" />
			</div>
		</form>
	</div>
</div>
</body>
</html>
