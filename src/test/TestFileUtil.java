package test;

import java.io.File;

import org.junit.Test;

import service.LinesCounter;
import service.iml.RecursionLinesCounter;

/** 
 * @author  Viking
 * @version ����ʱ�䣺2013-10-8 ����08:35:19 
 * 
 * 
 * 
 */

// jfl;asf
/*
 * fasdfas//
 */
public class TestFileUtil {
	
	@Test
	public void testCountLines() throws Exception{
		/**/System.out.println();
		File directory = new File(".");		
		LinesCounter counter = new RecursionLinesCounter();
		int lines = counter.countTotalLines(directory);
		System.out.println("total lines : " + lines);
	}

}
/**



*/