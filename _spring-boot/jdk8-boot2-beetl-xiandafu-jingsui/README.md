# README


# aop

```
http://127.0.0.1:8080/say?name=luo0412
```

# mvc

```python
http://127.0.0.1:8080/error

http://127.0.0.1:8080/beetl/user
http://127.0.0.1:8080/beetl/user/detail
http://127.0.0.1:8080/freemarker/user?id=1


http://127.0.0.1:8080/javabean/user/update3?id=2&name=myname
http://127.0.0.1:8080/javabean/user/update3?name=myname

// @InitBinder
// Fri Sep 22 00:00:00 CST 2017
http://127.0.0.1:8080/databind/date?d=2017-09-22%2021:30:15


http://127.0.0.1:8080/jackson/date/now
http://127.0.0.1:8080/jackson/json/tree
http://127.0.0.1:8080/jackson/json/databind
http://127.0.0.1:8080/jackson/obj/serial

http://127.0.0.1:8080/json/user/1
http://127.0.0.1:8080/json/date/now
http://127.0.0.1:8080/json/date?date=2017-09-22%2021:30:15

http://localhost:8080/url/user/list
http://localhost:8080/url/user/2
http://localhost:8080/url/user/test/consume

// 调用了公共方法 一定有值
http://localhost:8080/attr/user/1

http://localhost:8080/model/user/1
http://localhost:8080/model/user/get/1

// 订单
http://127.0.0.1:8080/addOrder.html
```

# jackson

```$xslt
http://localhost:8080/stream/parser
http://localhost:8080/stream/generator
http://localhost:8080/hello

http://localhost:8080/user/customize
http://localhost:8080/user/
http://localhost:8080/user/dept
```

# beetl

```$xslt
http://localhost:8080
http://localhost:8080/test
http://127.0.0.1:8080/user/userlist.html
http://127.0.0.1:8080/api/user/1.json
```

# jdbctemplate

```$xslt
http://localhost:8080/user/1
http://localhost:8080/user/2
```

# jpadata

```$xslt
http://localhost:8080/user?userId=1
http://localhost:8080/user/add?name=third&department_id=1
http://localhost:8080/user/list?begin=0&end=4
```

# rest

```$xslt
http://127.0.0.1:8080/swagger3/index.html
```

# mongodb

```sql
use baike

db.createUser({
  user: 'test',
  pwd: '123%abc!',
  role: [
    { role: 'readWrite', db: 'baike' }
  ]
})

db.auth('test', '123%abc!')

db.baike.insert({
    _id: "springboot", 
    desc: 'quick',
    tag: ["IT", "Spring"],
    comment: {
        good: 1256,
        bad: 12
    }
})


db.baike.find({
    _id: "springboot"
})

-- 控制台输出
http://localhost:8080/driver/baike/springboot

-- 新增
http://localhost:8080/baike/add?id=beetlsql&desc=dao&tag[0]=IT&comment.bad=1

-- 查找
http://localhost:8080/baike/find/beetlsql


-- bad > 0
http://localhost:8080/baike/querybad/0

http://localhost:8080/baike/inctaggood/IT

-- 第一页tag includes IT
http://localhost:8080/baike/tag/IT/1

-- 物理删除
http://localhost:8080/baike/delete?id=beetlsql
http://localhost:8080/baike/find/beetlsql
```

# redis

```sql
-- 测试
http://localhost:8080/redis/key/set
http://localhost:8080/redis/key

http://localhost:8080/redis/str/setget

http://localhost:8080/redis/message/add
http://localhost:8080/redis/message

http://localhost:8080/redis/cache/add?key=hello&value=world
http://localhost:8080/redis/cache/?key=hello

http://localhost:8080/redis/boundvalue?key=hello4
http://localhost:8080/redis/connection/set?key=hello2&value=world
```

# elasticsearch

- 使用postman 

```json
// put localhost:9200/product/book/1?pretty

{
  "name": "北京100小吃",
  "type": "food",
  "postDate": "2019-11-15T14:12:12",
  "message": "介绍了背景小吃"
}

// 访问 http://localhost:8080/restclient/book/1
```


# zookeeper

```jsx
http://localhost:8080/makeorder.html

http://localhost:8080/create.html?path=/hello
http://localhost:8080/setdata.html?path=/hello&data=123123
http://localhost:8080/getdata.html?path=/hello

http://localhost:8080/check.html?path=/hello
http://localhost:8080/children.html?path=/hello
http://localhost:8080/watch.html?path=/hello

http://localhost:8080/delete.html?path=/hello
```
