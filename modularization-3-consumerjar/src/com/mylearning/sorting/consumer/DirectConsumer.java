package com.mylearning.sorting.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.mylearning.sorting.algorithm.BubbleSort;
import com.mylearning.sorting.utils.MySortingUtils;

public class DirectConsumer {
	
	private static Logger logger = Logger.getLogger(MySortingUtils.class.getName());
	
	public static void main(String[] args) {
		List<String> names = List.of("sathian","ranga","sathish");
		
		BubbleSort mySortingUtils = new BubbleSort();
		List<String> sortedNames = mySortingUtils.sort(names);
		logger.info(sortedNames.toString());
	}

}
