package org.example;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class OutputToLog extends EnableLogger {
    ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

    long startTime;

    public OutputToLog() {
        this.startTime = System.currentTimeMillis();
    }

    public void runEveryFiveSecondsTask() {
        executorService.scheduleAtFixedRate(() -> logger.info("5 seconds have passed"), 0, 5, TimeUnit.SECONDS);
    }

}