package com.javaunit3.springmvc;

import model.MovieEntity;
import model.VoteEntity;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

@Configuration
public class HibernateConfig {

    @Bean
            public SessionFactory getFactory() {
        SessionFactory factory = new org.hibernate.cfg.Configuration()
                .configure("hibernate.cfg.wml")
                .addAnnotatedClass(MovieEntity.class)
                .buildSessionFactory();

        return factory;
    }
}
