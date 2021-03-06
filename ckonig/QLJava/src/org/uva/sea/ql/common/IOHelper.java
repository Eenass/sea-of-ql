package org.uva.sea.ql.common;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public final class IOHelper {
    public static final String OUT_PATH = "";

    private IOHelper() {

    }
    
    public static void write(String path, String output)
            throws FileNotFoundException {
        final PrintWriter out = new PrintWriter(path);
        out.print(output);
        out.close();
    }

    public static String read(String path) throws IOException {
        return read(new File(path));
    }

    public static String read(File file) throws IOException {
        final StringBuilder content = new StringBuilder();
        final LineNumberReader reader = new LineNumberReader(new FileReader(
                file));
        try {
            String line = reader.readLine();
            while (line != null) {
                content.append(line);
                content.append("\n");
                line = reader.readLine();
            }
        } finally {
            reader.close();
        }

        return content.toString();
    }

    public static Map<String, String> readFolder(String path)
            throws IOException {
        final Map<String, String> map = new HashMap<String, String>();
        final File folder = new File(path);
        for (final File fileEntry : folder.listFiles()) {
            if (fileEntry.isFile()) {
                map.put(fileEntry.getName().replace(".html", ""), read(path
                        + fileEntry.getName()));
            }
        }

        return map;
    }

}
