package me.kwkim.springdatajpa;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {
    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account=new Account();account.setUsername("testf");
        account.setPassword("hibernate");
        Study study=new Study();
        study.setName("spring data jpa");
        account.getStudies().add(study);
        //hibernate를 이용한 영속화
        Session session=entityManager.unwrap(Session.class);
        session.save(account);
        session.save(study);
        //jpa를 이용한 영속화
        // entityManager.persist(account);
    }
}
