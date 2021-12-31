package com.mylearning.sorting.consumer;

import java.util.List;
import java.util.logging.Logger;

import com.mylearning.sorting.utils.MySortingUtils;

public class MySortingUtilConsumer {
	
	private static Logger logger = Logger.getLogger(MySortingUtils.class.getName());
	
	public static void main(String[] args) {
		List<String> names = List.of("sathian","ranga","sathish");
		
		MySortingUtils mySortingUtils = new MySortingUtils();
		List<String> sortedNames = mySortingUtils.sort(names);
		logger.info(sortedNames.toString());
	}

}
