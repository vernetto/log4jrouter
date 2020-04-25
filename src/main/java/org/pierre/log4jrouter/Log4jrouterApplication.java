package org.pierre.log4jrouter;

import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.ThreadContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class Log4jrouterApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Log4jrouterApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        TestRouting.main(new String[]{});
        ThreadContext.push("ROUTINGKEY", "paperino");
        log.info("mi chiamo paperino");
        ThreadContext.push("ROUTINGKEY", "topolino");
        log.info("mi chiamo topolino");
    }
}
