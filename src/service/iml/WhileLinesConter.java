package service.iml;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

import service.LinesCounter;
import util.FileUtil;

public class WhileLinesConter implements LinesCounter {


	public int countTotalLines(File directory) throws Exception {
		if(directory==null){
			return 0;
		}
		if (!directory.isDirectory() || !directory.exists()) {
			throw new Exception("传入的参数必须是存在的文件夹!");
		}
		//用栈来保存目录
		Stack<File> stack = new Stack<File>();
		stack.push(directory);
		int count = 0;
		File[] files;
		do {
			files = stack.pop().listFiles();
			for (File file : files) {
				if (file.isDirectory()) {
					stack.push(file);
				} else {
					if (file.getName().endsWith(".java")) {
						count += FileUtil.countLines(file);
					}
				}
			}
		} while (!stack.isEmpty());
		return count;
	}
}