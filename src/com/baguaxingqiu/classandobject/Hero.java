package com.baguaxingqiu.classandobject;

import com.baguaxingqiu.implementandextend.Mortal;

public class Hero {
    
    String name = ""; //����
      
    float hp; //Ѫ��
      
    float armor; //����
      
    int moveSpeed; //�ƶ��ٶ�
    
    public Hero(){
    	
    }
    
  //��һ�������Ĺ��췽��
    public Hero(String heroname){  
        name = heroname;
    }
      
    //�����������Ĺ��췽��
    public Hero(String heroname,float herohp){  
        name = heroname;
        hp = herohp;
    }
    
    public Hero(String heroName, float heroHP ,float heroArmor, int heroMoveSpeed) {
	 name = heroName;
	 hp = heroHP;
	 armor = heroArmor;
	 moveSpeed = heroMoveSpeed;
    }
    
    public void kill(Mortal m) {
    	String name = this.name;
    	System.out.println(name+"kills");
    	m.die();
    }

      
    public static void main(String[] args) {
        //����һ������
//        new Hero();
         
        //ʹ��һ��������ָ���������
//        Hero h = new Hero();
         
    }   
      
}
