package ua.ithilell.hw9;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileLoggerConfigurationLoader {

    public static FileLoggerConfiguration load(File configFile) {

        //String[] lines = new String[4];

        String file = null;
        String format = null;
        long maxFileSize = 100000;
        LoggingLevelType level = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(configFile)))) {

            int lineIndex = 0;
            String line = null;

            while ((line = reader.readLine()) != null) {

                String[] lineParts = line.split(":");

                String value = lineParts[1].trim();

                switch (lineParts[0]) {
                    case "FILE":
                        file = value;
                        break;
                    case "FORMAT":
                        format = value;
                        break;
                    case "MAX-SIZE":
                        maxFileSize = Long.parseLong(value);
                        break;
                    case "LEVEL":
                        level = LoggingLevelType.valueOf(value);
                        break;
                }

                /*lines[lineIndex] = line.substring(line.indexOf(':') + 1).trim();
                lineIndex++;*/

            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        if (file == null || format == null || level == null) {
            throw new IllegalArgumentException("Invalid config");
        }

        return new FileLoggerConfiguration(
                new File(file),
                format,
                maxFileSize,
                level
        );

    }

}
