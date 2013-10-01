package test;

import java.io.File;
import java.util.Scanner;

import org.junit.Test;

import service.LinesCounter;
import service.iml.RecursionLinesCounter;
import service.iml.WhileLinesConter;

/** 
 * @author  Viking
 * @version 创建时间：2013-10-1 下午08:24:20 
 * 
 */
public class TestLinesCounter {
	
	
	@Test
	public void testRecursionLinesCounter() throws Exception{
		
		File directory = new File("../testProject");		
		LinesCounter counter = new RecursionLinesCounter();
		int lines = counter.countTotalLines(directory);
		System.out.println("total lines : " + lines);
	}
	
	@Test
	public void testWhileLinesConter() throws Exception{
	//	Scanner in = new Scanner(System.in);
	//	System.out.println("Enter base directory (e.g. /user/local/av/japen):");

		LinesCounter counter = new WhileLinesConter();
		File directory = new File("../testProject");
		int lines = counter.countTotalLines(directory);
		System.out.println("total lines : " + lines);
	
	}
	

}
