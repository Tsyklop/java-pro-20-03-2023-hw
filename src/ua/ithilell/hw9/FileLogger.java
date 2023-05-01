package ua.ithilell.hw9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.file.Files;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FileLogger {

    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm dd.MM.yyyy");

    private final FileLoggerConfiguration configuration;

    public FileLogger(FileLoggerConfiguration configuration) {
        this.configuration = configuration;
    }

    public void info(String message) {
        log(LoggingLevelType.INFO, message);
    }

    public void debug(String message) {
        if (configuration.getLevel() != LoggingLevelType.DEBUG) {
            return;
        }
        log(LoggingLevelType.DEBUG, message);
    }

    private void log(LoggingLevelType loggingLevel, String message) {

        String formattedDateTime = LocalDateTime.now().format(DATE_TIME_FORMATTER);

        try {

            File logFile = configuration.getFile();

            if (logFile.length() >= configuration.getMaxFileSize()) {

                String dateTime = formattedDateTime.replace(" ", "-").replace(":", "-");

                File oldLogFile = new File(logFile.getCanonicalFile().getParentFile() + File.separator + "log-" + dateTime + ".txt");

                if (!oldLogFile.exists()) {
                    Files.move(logFile.toPath(), oldLogFile.toPath());
                }

                //throw new FileMaxSizeReachedException(logFile);
            }

            logFile.getCanonicalFile().getParentFile().mkdirs();

            if (!logFile.exists()) {
                logFile.createNewFile();
            }

            try (Writer writer = new OutputStreamWriter(new FileOutputStream(logFile, true))) {

                String messageForLogFile = configuration.getFormat(); // [TIME] [LEVEL] [THREAD] - [MESSAGE]

                // 19:51 01.05.2023 [LEVEL] [THREAD] - [MESSAGE]
                messageForLogFile = messageForLogFile.replace("[TIME]", formattedDateTime); // 19:51 01.05.2023

                // 19:51 01.05.2023 DEBUG [THREAD] - [MESSAGE]
                messageForLogFile = messageForLogFile.replace("[LEVEL]", loggingLevel.name()); // DEBUG

                // 19:51 01.05.2023 DEBUG main - [MESSAGE]
                messageForLogFile = messageForLogFile.replace("[THREAD]", Thread.currentThread().getName()); // main

                // 19:51 01.05.2023 DEBUG main - message example
                messageForLogFile = messageForLogFile.replace("[MESSAGE]", message); // message example

                // 19:51 01.05.2023 DEBUG main - message example

                writer.append(messageForLogFile + "\n");

            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

}
