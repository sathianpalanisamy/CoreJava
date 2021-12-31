module com.mylearing.service.provider {
	exports com.mylearning.sorting.algorithm;
	exports com.mylearning.sorting.utils;
	requires transitive java.logging;
	
	opens com.mylearning.sorting.algorithm to com.mylearning.consumer;
}