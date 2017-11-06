# myDubbox
dubbox官方文档：http://dangdangdotcom.github.io/dubbox/
</br>
本文是一个简单的demo：
1、实现了dubbox的rest风格访问，provider是生产者，提供了get请求http://.../user/getUsers 和post请求http://.../user/register
可以直接用rest工具访问，也可以像dubbo服务一样在消费者consumer中注入调用。</br>
2、还实现了一个简单的dubbo服务过滤器，过滤所有dubbo服务，可用于日志监控或将来的用户登录认证。</br>
3、myDubbox是一个父级maven项目，管理jar包版本、和子项目，不够标准，仅供参考。</br>
