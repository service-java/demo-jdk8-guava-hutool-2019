#### JSP数据库操作

* 资源
    * http://book.boxuegu.com/javaweb_advanced/
    

* 基础JDBC

```
jdbc:mysql://localhost:3306/luodb87?autoReconnect=true&useSSL=false


// ODBC桥 忽略
// 调用存储过程 忽略 
// 使用连接池 context.xml 忽略

// 预处理语句

// 高级结果集
can-update-result.jsp // 暂时不可执行

// 使用jstl操作数据库
```

* 使用javabean操作数据库

```
DBCurd // 有冗余,不会再用,只是舍不得删
DBHelper // 初学Java的时候用的, 功能全一点，但不是很好用
https://github.com/luo0412/hello-java/blob/master/FinalLab/src/util/DBHelperTest.java
MySQLDBHelper // 相对还好用
https://github.com/luo0412/hello-java/blob/master/FinalLab/src/util/MySQLDBHelperTest.java

目前 ConnDB // 减少了部分冗余 把数据库信息独立了出去,用properties文件独立保存敏感信息

```

* web.xml配置

```
<context-param>
    <param-name>driver</param-name>
    <param-value>com.mysql.jdbc.Driver</param-value>
</context-param>
<context-param>
    <param-name>url</param-name>
    <param-value>jdbc:mysql://localhost:3306/mydb</param-value>
</context-param>
<context-param>
    <param-name>user</param-name>
    <param-value>root</param-value>
</context-param>
<context-param>
    <param-name>pass</param-name>
    <param-value>root</param-value>
</context-param>
```

* 批处理

```
// demo1
stmt.addBatch(sql1);
stmt.addBatch(sql2);
stmt.addBatch(sql3);
stmt.addBatch(sql4);
stmt.executeBatch();

// demo2
String sql = "INSERT INTO users(name,password,email,birthday)"
					+ "VALUES(?,?,?,?)";
preStmt = conn.prepareStatement(sql);
for (int i = 0; i < 5; i++) {
	preStmt.setString(1, "name" + i);
	preStmt.setString(2, "password" + i);
	preStmt.setString(3, "email" + i + "@itcast.cn");
	preStmt.setDate(4, Date.valueOf("1989-02-19"));
	preStmt.addBatch();
}

preStmt.executeBatch();              
```

* 处理blob clob

```
见代码
```

* 关闭连接

```
	public static void release(Statement stmt, Connection conn) {
		if (stmt != null) {
			try {
				stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			stmt = null;
		}
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			conn = null;
		}
	}
```

* 事务

```
try {
    // 数据库操作
} catch (Exception e) {
	// 回滚事务
	try {
		conn.rollback(); // 不声明也会默认回滚
		System.out.println("转账失败");
	} catch (SQLException e1) {
		e1.printStackTrace();
	}
} finally {
    // 清场close
}
```

* 连接池

```
// DBCP
commons.dbcp.jar

// C3P0 目前最流行
c3p0-0.9.1.2.jar


```