package service.iml;

import java.io.File;

import service.LinesCounter;
import util.FileUtil;

public class RecursionLinesCounter implements LinesCounter {


	public int countTotalLines(File directory) throws Exception{
		int count = 0;
		if(directory==null){
			return 0;
		}
		if (!directory.isDirectory() || !directory.exists()) {
			throw new Exception("传入的参数必须是存在的文件夹!");
		}
		return count + recursionCounter(directory);
	}
	
	private static int recursionCounter(File directory){
		int count = 0;
		File[] files = directory.listFiles();
		for (File file : files)
			if (file.isDirectory()) {
				count += recursionCounter(file);
			} else {
				if (file.getName().endsWith(".java")) {
						count+=FileUtil.countLines(file);
				}
			}
	return count;
	}
}