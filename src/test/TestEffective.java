package test;

import java.io.File;

import org.junit.Test;

import service.LinesCounter;
import service.iml.RecursionLinesCounter;
import service.iml.WhileLinesConter;

/**
 * @author Viking
 * @version 创建时间：2013-10-1 下午08:41:21
 * 
 */
public class TestEffective {

	@Test
	public void testEfficiency() throws Exception {
		File directory = new File(".");
		long startTime, endTime;
		int times = 100;
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			testRunTime(directory,new WhileLinesConter());
		}
		endTime= System.currentTimeMillis();
		System.out.println("average time :" +( endTime- startTime)*1.0/times);
		
		startTime = System.currentTimeMillis();
		for (int i = 0; i < times; i++) {
			testRunTime(directory,new RecursionLinesCounter());
		}
		endTime= System.currentTimeMillis();
		
		System.out.println("average time :" +( endTime- startTime)*1.0/times);

	}

	public void testRunTime(File directory, LinesCounter counter)
			throws Exception {

		counter.countTotalLines(directory);
	}

}
