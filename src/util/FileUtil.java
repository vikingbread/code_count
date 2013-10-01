package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/** 
 * @author  Viking
 * @version 创建时间：2013-10-1 下午01:35:26 
 * 
 */
public class FileUtil {
	
	public static int countLines(File file) {
		int totalLine = 0;
		try {
			Scanner in = new Scanner(new FileInputStream(file));
			String line;
			while (in.hasNextLine()) {
				line = in.nextLine();
				if (line.trim().length() == 0) {
					continue;
				}
				totalLine++;
			}
			in.close();
			return totalLine;
		} catch (IOException e) {
			return totalLine;
		}
	}
}
