package com.devbeekei.monitoring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MetricsController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping("/end-point1")
    public String endPoint1() {
        logger.info("Metrics for endPoint1");
        return "Metrics for endPoint1";
    }

    @GetMapping("/end-point2")
    public String endPoint2() {
        logger.info("Metrics for endPoint2");
        return "Metrics for endPoint2";
    }

}
