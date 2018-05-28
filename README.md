### 参考
https://blog.csdn.net/qq_35489188/article/details/
https://blog.csdn.net/u010323023/article/details/

### Service端
![](https://ws2.sinaimg.cn/large/006tNc79gy1frrcumvqpoj31kw0gtwj7.jpg)
### Client 端
![](https://ws2.sinaimg.cn/large/006tNc79gy1frrcv1ap2cj31kw0kwn4w.jpg)
### 在Client端运⾏
![](https://ws2.sinaimg.cn/large/006tNc79gy1frrcvc1pt1j31gg09u0va.jpg)
### Client 的 main 运⾏报错缺失 Junit jar
### 没有 pom.xml ，如何解决呢？

报错，是因为没有导⼊ Junit jar 包。有个解决⽅法，可以很快的导入 jar 包
测试类中的任何一个方法上面加⼀个注解 @Test ， IDE就会发现缺少 jar ，然后根据错误提示，
把 Junit 加⼊到 classpath 中，就 OK 了。

