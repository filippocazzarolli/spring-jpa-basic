package com.filippo.springjpabasic;

import com.filippo.springjpabasic.person.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
public class SpringJpaBasicRunner implements CommandLineRunner {
    private final Logger log = Logger.getLogger(this.getClass().toString());

//    private PersonRepository personRepository;
//
//    @Autowired
//    public SpringJpaBasicRunner(PersonRepository personRepository) {
//        this.personRepository = personRepository;
//    }

    @Override
    public void run(String... args) throws Exception {

        log.info("start");

    }
}
