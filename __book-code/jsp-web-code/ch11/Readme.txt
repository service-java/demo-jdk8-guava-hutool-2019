
  1.database为数据库创建的语句，按照本章的文章叙述来建立数据库、创建数据表

  2.如果需要修改数据库联接，请修改文件WEB-INF\classes\org\pan\util\DBConnectionManager.java
    第18~21行:
    
    private String driverName = "org.gjt.mm.mysql.Driver"; 
    private String url = "jdbc:mysql://localhost:3306/business?useUnicode=true&characterEncoding=GBK";  
    private String user = root
    private String password = "";

  3.根据第一章建立站点的方法建立虚拟站点/business,
    访问首页:http://localhost:8000/business/index.jsp