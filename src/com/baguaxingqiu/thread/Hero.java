package com.baguaxingqiu.thread;

public class Hero {

	/**
	 * @param args
	 *  Ӣ���п��Է�һ�����ܽ���: ����ȭ-a du gen�� 
		ÿ��һ���ӣ����Է�һ�Σ�����ֻ��������3�Ρ� 
		����3��֮����Ҫ����5���ӣ��������ټ�������
	 */
	
	public String name;
    public float hp;
 
    public Hero() {
 
    }
 
    public Hero(String name) {
        this.name = name;
    }
 
    public int damage;
    
    public void attackHero(Hero h){
    	try {
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
    	h.hp -= damage;
    	System.out.format("%s ���ڹ��� %s, %s��Ѫ����� %.0f%n", name, h.name, h.name, h.hp);
    	if (h.isDead()){
    		System.out.println(h.name + "���ˣ�");
    	}
            
    }
 
	public boolean isDead() {
		return 0 >= hp ? true : false;
	}
	
	int totalTime = 3;
	
	public void adugen(){
		while (true) {
			for (int i = 0; i < totalTime; i++) {
				System.out.printf("����ȭ��%d��%n", i + 1);
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			System.out.println("����");
			try {
				Thread.sleep(5000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Hero h = new Hero();
        h.name = "����";
 
        h.adugen();
 

	}
}
