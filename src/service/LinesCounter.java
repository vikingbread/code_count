package service;

import java.io.File;

/** 
 * @author  Viking
 * @version ����ʱ�䣺2013-10-1 ����01:32:57 
 * 
 */
public interface LinesCounter {
	
	int countTotalLines(File directory) throws Exception;

}
