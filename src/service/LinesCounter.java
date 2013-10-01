package service;

import java.io.File;

/** 
 * @author  Viking
 * @version 创建时间：2013-10-1 下午01:32:57 
 * 
 */
public interface LinesCounter {
	
	int countTotalLines(File directory) throws Exception;

}
