<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<form action="" method="post">
	<table>
		<tbody>
			<tr>
				<td><label for="login-username">帐号：</label>
				</td>
				<td><input type="text" name="username" vlaue=""
					autocomplete="off" id="login-username" class="input-box">
				</td>
			</tr>
			<tr>
				<td><label for="login-password">密码：</label>
				</td>
				<td><input type="password" name="password" vlaue=""
					autocomplete="off" id="login-password" class="input-box">
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td class="autologin-container"><input type="checkbox"
					value="1" id="login-auto" name="autologin" class="login-auto">
					<label for="login-auto" class="login-auto-label">一周内自动登录</label> <a
					target="_blank" href="http://www.kuaipan.cn/account_reset.htm"
					id="forget-password" class="login-forget-password">忘记密码？</a>
				</td>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<td><input type="submit" value="立即登录" id="login-submit">
					<input type="button" value="注册" id="login-register">
				</td>
			</tr>
		</tbody>
	</table>
</form>