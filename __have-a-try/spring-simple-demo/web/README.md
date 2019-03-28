#### Spring-demo

* 分布注册

```
// 导入spring3.2相关jar 

// 依次加入以下文件
model/User.java 实体
validator/UserValidator.java // 验空以及是否合法
controller.UserRegController // 分布注册向导控制器

WEB-INF/dipatcher-servlet.xml
配置web.xml // 并且加入filter解决中文乱码问题

reg.jsp
contact.jsp
survey.jsp
success.jsp


访问 http://localhost:8686/reg.do

```