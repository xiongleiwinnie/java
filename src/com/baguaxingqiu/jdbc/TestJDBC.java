package com.baguaxingqiu.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.Statement;

public class TestJDBC {
    public static void main(String[] args) throws SQLException {
           
        //��ʼ������
    	Connection c = null;
        Statement s = null;
        try {
            //������com.mysql.jdbc.Driver
            //���� mysql-connector-java-5.0.8-bin.jar��
            //��������˵�һ������ĵ������ͻ��׳�ClassNotFoundException
            Class.forName("com.mysql.jdbc.Driver");
              
            System.out.println("���ݿ��������سɹ� ��");
            
            c = DriverManager
                    .getConnection(
                            "jdbc:mysql://127.0.0.1:3306/how2java?characterEncoding=UTF-8",
                            "root", "123456");
            System.out.println("���ӳɹ�����ȡ���Ӷ��� " + c);
  
            s = c.createStatement();
            System.out.println("��ȡ Statement���� " + s);
            
            String sql = "insert into hero values(null,"+"'��Ī'"+","+313.0f+","+50+")"; 
            s.execute(sql);
  
            System.out.println("ִ�в������ɹ�");
   
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally{
        	// ���ݿ������ʱ������Դ����ز������������ɹر����ݿ�ĺ�ϰ��
            // �ȹر�Statement
            if (s != null)
                try {
                    s.close();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            // ��ر�Connection
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