package ua.ithilell.hw9;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        FileLoggerConfiguration configuration = FileLoggerConfigurationLoader.load(new File("./logging-config.txt"));

        FileLogger fileLogger = new FileLogger(configuration);

        for (int i = 0; i < 1000; i++) {
            fileLogger.info("info message " + i);
            fileLogger.debug("debug message " + i);
        }

    }

}
