package com.loggerPractice.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


public class Controller {
    private static Logger logger = LoggerFactory.getLogger(Controller.class);

    public static void main(String []args) {
        try {
            int x = 2/0;
        } catch (Exception e) {
            logger.error("The error is:", e);
        }
    }
}
