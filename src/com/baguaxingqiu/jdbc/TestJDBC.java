package com.baguaxingqiu.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) throws SQLException {
           
        //初始化驱动
    	Connection c = null;
        Statement s = null;
        try {
            //驱动类com.mysql.jdbc.Driver
            //就在 mysql-connector-java-5.0.8-bin.jar中
            //如果忘记了第一个步骤的导包，就会抛出ClassNotFoundException
            Class.forName("com.mysql.jdbc.Driver");
              
            System.out.println("数据库驱动加载成功 ！");
            
            c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                            "root", "123456");
            System.out.println("连接成功，获取连接对象： " + c);
  
            s = c.createStatement();
            System.out.println("获取 Statement对象： " + s);
            
            String sql = "insert into hero values(null,"+"'提莫'"+","+313.0f+","+50+")"; 
            s.execute(sql);
  
            System.out.println("执行插入语句成功");
   
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
        	// 数据库的连接时有限资源，相关操作结束后，养成关闭数据库的好习惯
            // 先关闭Statement
            if (s != null)
                try {
                    s.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            // 后关闭Connection
            if (c != null)
                try {
                    c.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
 
        }
           
    }
}