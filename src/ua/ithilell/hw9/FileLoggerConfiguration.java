package ua.ithilell.hw9;

import java.io.File;

public class FileLoggerConfiguration {

    private final File file;

    private final String format; // [TIME] [LEVEL] [THREAD] - [MESSAGE]

    private final long maxFileSize;

    private final LoggingLevelType level;

    public FileLoggerConfiguration(File file, String format, long maxFileSize, LoggingLevelType level) {
        this.file = file;
        this.format = format;
        this.maxFileSize = maxFileSize;
        this.level = level;
    }

    public File getFile() {
        return file;
    }

    public String getFormat() {
        return format;
    }

    public long getMaxFileSize() {
        return maxFileSize;
    }

    public LoggingLevelType getLevel() {
        return level;
    }

}
