package com.baguaxingqiu.numberandstring;

public class MyStringBuffer implements IStringBuffer{

	/**
	 * @param args
	 * 根据接口IStringBuffer ，自己做一个MyStringBuffer
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
	//追加，就是在最后位置插入。 所以不需要单独开发方法，直接调用insert方法，就能达到最后位置插入的效果
	public void append(String str) {
		insert(length, str);
		
	}

	@Override
	public void append(char c) {
		insert(length, c);
		
	}

	@Override
//	参数是字符的insert方法，通过调用insert(int, String) 也就实现了。
	public void insert(int pos, char b) {
		insert(pos, String.valueOf(b));
		
	}

	@Override
	public void insert(int pos, String b) {
//		插入之前，首先要判断的是一些边界条件。 比如插入位置是否合法，插入的字符串是否为空
		if (pos < 0) {
			return;
		}
		if (pos > length) {
			return;
		}
		if (null == b) {
			return;
		}
//		1. 要判断是否需要扩容。 如果插入的字符串加上已经存在的内容的总长度超过了容量，那么就需要扩容。
//		2. 数组的长度是固定的，不能改变的，数组本身不支持扩容。 我们使用变通的方式来解决这个问题。
//		3. 根据需要插入的字符串的长度和已经存在的内容的长度，计算出一个新的容量。 然后根据这个容量，创建一个新的数组，接着把原来的数组的内容，复制到这个新的数组中来。并且让value这个引用，指向新的数组，从而达到扩容的效果。
		if (length+b.length()>capacity) {
			capacity = (int) ((int)(length+b.length())*1.5f);
			char[] newValue = new char[capacity];
			System.arraycopy(value, 0, newValue, 0, length);
			value = newValue;
			
		}
		
//		插入字符串
//		1. 找到要插入字符串的位置，从这个位置开始，把原数据看着两段，把后半段向后挪动一个距离，这个距离刚好是插入字符串的长度
//		2. 然后把要插入的数据，插入这个挪出来的，刚刚好的位置里。
		char[] cs = b.toCharArray();
		System.arraycopy(value, pos, value, pos+cs.length, cs.length);
		System.arraycopy(cs, 0, value, pos, cs.length);
//		最后修改length的值，是原来的值加上插入字符串的长度
		length = length+cs.length;
		
		
	}

	@Override
	public void delete(int start) {
		delete(start, length);
		
	}

	@Override
	public void delete(int start, int end) {
		//边界条件判断
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
