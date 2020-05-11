package com.filippo.springjpabasic.person;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
//@SpringBootTest(classes = SpringJpaBasicApplication.class)
@DataJpaTest
public class PersonTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(PersonTest.class);

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void Test1() {
        PersonEntity p1 = personRepository.getOne(10001L);

        LOGGER.info(p1.getName());
    }
}
