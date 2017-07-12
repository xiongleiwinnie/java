package com.baguaxingqiu.numberandstring;

public class MyStringBuffer implements IStringBuffer{

	/**
	 * @param args
	 * ���ݽӿ�IStringBuffer ���Լ���һ��MyStringBuffer
	 */
	int capacity = 16;
	int length = 0;
	char[] value;
	public MyStringBuffer(){
		value = new char[capacity];
	}
	
	public MyStringBuffer(String str){
		if (null != str) {
			value = str.toCharArray();
		}
		length = value.length;
		if (capacity < value.length) {
			capacity = value.length*2;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	//׷�ӣ����������λ�ò��롣 ���Բ���Ҫ��������������ֱ�ӵ���insert���������ܴﵽ���λ�ò����Ч��
	public void append(String str) {
		insert(length, str);
		
	}

	@Override
	public void append(char c) {
		insert(length, c);
		
	}

	@Override
//	�������ַ���insert������ͨ������insert(int, String) Ҳ��ʵ���ˡ�
	public void insert(int pos, char b) {
		insert(pos, String.valueOf(b));
		
	}

	@Override
	public void insert(int pos, String b) {
//		����֮ǰ������Ҫ�жϵ���һЩ�߽������� �������λ���Ƿ�Ϸ���������ַ����Ƿ�Ϊ��
		if (pos < 0) {
			return;
		}
		if (pos > length) {
			return;
		}
		if (null == b) {
			return;
		}
//		1. Ҫ�ж��Ƿ���Ҫ���ݡ� ���������ַ��������Ѿ����ڵ����ݵ��ܳ��ȳ�������������ô����Ҫ���ݡ�
//		2. ����ĳ����ǹ̶��ģ����ܸı�ģ����鱾��֧�����ݡ� ����ʹ�ñ�ͨ�ķ�ʽ�����������⡣
//		3. ������Ҫ������ַ����ĳ��Ⱥ��Ѿ����ڵ����ݵĳ��ȣ������һ���µ������� Ȼ������������������һ���µ����飬���Ű�ԭ������������ݣ����Ƶ�����µ�����������������value������ã�ָ���µ����飬�Ӷ��ﵽ���ݵ�Ч����
		if (length+b.length()>capacity) {
			capacity = (int) ((int)(length+b.length())*1.5f);
			char[] newValue = new char[capacity];
			System.arraycopy(value, 0, newValue, 0, length);
			value = newValue;
			
		}
		
//		�����ַ���
//		1. �ҵ�Ҫ�����ַ�����λ�ã������λ�ÿ�ʼ����ԭ���ݿ������Σ��Ѻ������Ų��һ�����룬�������պ��ǲ����ַ����ĳ���
//		2. Ȼ���Ҫ��������ݣ��������Ų�����ģ��ոպõ�λ���
		char[] cs = b.toCharArray();
		System.arraycopy(value, pos, value, pos+cs.length, cs.length);
		System.arraycopy(cs, 0, value, pos, cs.length);
//		����޸�length��ֵ����ԭ����ֵ���ϲ����ַ����ĳ���
		length = length+cs.length;
		
		
	}

	@Override
	public void delete(int start) {
		delete(start, length);
		
	}

	@Override
	public void delete(int start, int end) {
		//�߽������ж�
		if (start<0) {
			return;
		}
		if (start>length) {
			return;
		}
		if (end<0) {
			return;
		}
		if (end>length) {
			return;
		}
		if (start>=end) {
			return;
		}
		System.arraycopy(value, end, value, start, length-end);
		length = length-(end-start);
		
	}

	@Override
	public void reverse() {
		for (int i = 0; i < length/2; i++) {
			char temp = value[i];
			value[i] = value[length-i-1];
			value[length-i-1] = temp;
		}
		
	}

	@Override
	public int length() {
		return length;
	}

}
