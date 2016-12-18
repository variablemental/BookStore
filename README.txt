一、apache-tomcat-6.0.48 文件夹内为可运行的程序：
	1、需要配置好相应的tomcat环境变量
			Java环境变量
			SQLSEVER数据库驱动环境变量
	2、配置好以上环境变量后，点击根目录下start.bat快捷方式
		如果提示成功，则可以正常进入localhost：8080/BookStore
		即进入我们的系统；
		如果提示环境变量不对，则需要在apache-tomcat-6.0.48\bin\start.bat
		文件中更改对应的环境变量才能进入；

二、bookstore文件夹内为整个IntelliJ IDEA的web-app项目；进如可以查看
	相关的Java文件：bookstore\src文件夹中
	      jsp文件：bookstore\web\WEB-INF文件夹中

三、datebase文件夹中为该课程需要使用的数据库：
	首先数据库兼容性问SQL SEVER 2008以上；
	推荐使用SQL SEVER 2014 ，因为该数据库为该版本建立。
	需要将数据库接入系统之后，配置相关 TCP 端口后才可连接；

	大致上使用事项为这些；








