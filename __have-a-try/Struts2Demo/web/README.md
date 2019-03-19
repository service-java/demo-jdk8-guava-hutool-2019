#### Struts2Demo

* 说明

```
// 教训 IDEA已经不能再方便了
// out文件夹的artifacts下的war_exploded就相当于eclipse下的war
// 但是我被惯性带过去了, 在Grammar做了不少不必要的路径配置 eg. classes lib

// Java有改动注意Build/Rebuild
// 必要时注意重启tomcat

http://localhost:8686/ 
// 直接访问的就是index.jsp

http://localhost:8686/first.action 
// 对应的处理由success.jsp来响应

// 主要改动的文件
NEW src/action/UserAction.java
src/struts.xml
WEB-INF/web.xml
index.jsp success.jsp

```

* 动态Action

```
// 改动 struts.xml  web.xml
// New DynamicUserAction.java

    <!-- 动态Action -->
    <package name="User"  extends="struts-default"  >
        <action name="userAction" class="action.DynamicUserAction">
            <result name="add">add.jsp</result>
            <result name="del">del.jsp</result>
            <result name="update">update.jsp</result>
            <result name="show">show.jsp</result>
        </action>
        <action name="add">
            <result>/add.jsp</result>
        </action>
    </package>

    <filter-mapping>
        <filter-name>struts2</filter-name>
        <url-pattern>/*</url-pattern>
    </filter-mapping>
        
```

* 一个较完整的struts.xml

```

<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE struts PUBLIC "-//Apache Software Foundation//DTD Struts Configuration 2.1//EN" 
"http://struts.apache.org/dtds/struts-2.1.dtd">
<struts>
	<!-- 开发模式 -->
	<constant name="struts.devMode" value="true"></constant>
	<!-- Action后缀 -->
	<constant name="struts.action.extension" value="action"></constant>
	<!-- 配置文件 -->
	<include file="struts.xml"></include>
	<!-- 配置Bean -->
	<bean class="" name=""></bean>
	<package name="linkAction"  extends="struts-default"  >
		<!-- 配置拦截器 -->
		<interceptors name="" class="">
			<interceptor-stack name="">
				<interceptor-ref name=""></interceptor-ref>
			</interceptor-stack>
		</interceptors>
		<action name="User" class="com.itzcn.action.UserAction">
			<result name="add">add.jsp</result>
			<result name="del">del.jsp</result>
			<result name="up">up.jsp</result>
			<result name="show">show.jsp</result>
		</action>
	</package>
</struts>    

```

* 域模型与驱动模型

```

```

* 使用拦截器过滤文字

```
// New interceptor/MyInterceptor.java
// New MessageAction
// text-index.jsp text-success.jsp

// struts.xml


```