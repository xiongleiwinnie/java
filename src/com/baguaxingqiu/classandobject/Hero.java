package com.baguaxingqiu.classandobject;

import com.baguaxingqiu.implementandextend.Mortal;

public class Hero {
    
    String name = ""; //姓名
      
    float hp; //血量
      
    float armor; //护甲
      
    int moveSpeed; //移动速度
    
    public Hero(){
    	
    }
    
  //带一个参数的构造方法
    public Hero(String heroname){  
        name = heroname;
    }
      
    //带两个参数的构造方法
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
        //创建一个对象
//        new Hero();
         
        //使用一个引用来指向这个对象
//        Hero h = new Hero();
         
    }   
      
}
