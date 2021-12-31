package com.mylearning.sorting.utils;

import java.util.List;

import com.mylearning.sorting.algorithm.BubbleSort;

public class MySortingUtils {
	
	
	public List<String> sort(List<String> names){
		BubbleSort bubbleSort = new BubbleSort();
		return bubbleSort.sort(names);
		
	}

}
