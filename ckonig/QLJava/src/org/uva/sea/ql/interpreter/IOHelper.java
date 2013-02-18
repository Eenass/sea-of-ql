package org.uva.sea.ql.interpreter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;

public class IOHelper {

	public static void write(String path, String output)
			throws FileNotFoundException {
		PrintWriter out = new PrintWriter(path);
		out.println(output);
		out.close();
	}

	public static String read(String path) throws IOException {
		return read(new File(path));
	}
	public static String read(File file) throws IOException {
		StringBuilder content = new StringBuilder();
		LineNumberReader lnr = new LineNumberReader(new FileReader(file));
		try {
			String line = "";
			while (line != null) {
				line = lnr.readLine();
				if (line == null) {
					break;
				}
				content.append(line);
				content.append("\n");
			}
		} finally {
			lnr.close();
		}
		return content.toString();
	}


	public static Map<String, String> readFolder(String path)
			throws IOException {
		Map<String, String> m = new HashMap<String, String>();
		File folder = new File(path);
		for (final File fileEntry : folder.listFiles()) {
			if (fileEntry.isFile()) {
				m.put(fileEntry.getName().replace(".html", ""), read(path
						+ fileEntry.getName()));
			}
		}

		return m;
	}

}