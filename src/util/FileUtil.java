package util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Viking
 * @version 创建时间：2013-10-1 下午01:35:26
 * 
 */
public class FileUtil {

	public static int countLines(File file) {
		int totalLines = 0;
		try {
			Scanner in = new Scanner(new FileInputStream(file));
			String line;
			int index;
			while (in.hasNextLine()) {
				line = in.nextLine().trim();
				// 空行
				if (line.length() == 0) {
					continue;
				}
				// //注释
				if (line.startsWith("//")) {
					continue;
				}
				/* 注释 */
				index = line.indexOf("/*");
				if (index > -1) {
					totalLines += skipNotes(line, in);
					continue;
				}

				totalLines++;
			}
			in.close();
			return totalLines;
		} catch (IOException e) {
			return totalLines;
		}
	}

	/* // */
	private static int skipNotes(String line, Scanner in) {
		int validRowCount = 0;
		int index = line.indexOf("/*");
		if (index > 0) {
			validRowCount++;
		}
		if (line.contains("*/")) {
			return validRowCount;
		}
		while (in.hasNext()) {
			line = in.nextLine();
			if (line.contains("*/")) {
				break;
			}
		}

		return validRowCount;
	}
}
