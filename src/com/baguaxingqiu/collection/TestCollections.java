package com.baguaxingqiu.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestCollections {

	/**
	 * @param args
	 *  首先初始化一个List,长度是10，值是0-9。
		然后不断的shuffle，直到前3位出现
		3 1 4
		shuffle 1000,000 次，统计出现的概率
	 */
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        int repeat = 0;
        for (int i = 0; i < 1000000 ; i++) {
			Collections.shuffle(numbers);
			if (numbers.get(0)==3&&numbers.get(1)==1&&numbers.get(2)==4) {
				repeat++;
			}
		}
        System.out.println(repeat);

	}

}
