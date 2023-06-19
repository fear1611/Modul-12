package org.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class EnableLogger {
    public final Logger logger = LoggerFactory.getLogger(this.getClass());
}