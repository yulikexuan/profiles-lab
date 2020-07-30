//: com.yulikexuan.sfg.profileslab.ProfilesLabApplication.java


package com.yulikexuan.sfg.profileslab;


import com.yulikexuan.sfg.profileslab.config.AuthorConfigProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@Slf4j
@SpringBootApplication
@RequiredArgsConstructor
public class ProfilesLabApplication implements CommandLineRunner {

    private final AuthorConfigProperties authorConfigProperties;

    public static void main(String[] args) {
        SpringApplication.run(ProfilesLabApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        log.info("------- STARTING THE APPLICATION -------");

        log.info(">>>>>>> Author's Name: {}", authorConfigProperties.getName());
        log.info(">>>>>>> Author's EMail: {}", authorConfigProperties.getEmail());
        log.info(">>>>>>> Author's Company: {}", authorConfigProperties.getCompany());

        log.info("------- APPLICATION FINISHED -------");
    }

}///:~