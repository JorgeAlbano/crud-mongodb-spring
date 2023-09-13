package com.crudmongo.crudmongo.configuration;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
@RequiredArgsConstructor
public class MongoConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix = "spring.data.mongodb")

    public MongoProperties mongoProperties() throws Exception{
        return new MongoProperties();
    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception{
        return new MongoTemplate(mongoDatabaseFactory(mongoProperties()));
    }

    @Bean
    public MongoDatabaseFactory mongoDatabaseFactory(MongoProperties mongo) throws Exception{
        return new SimpleMongoClientDatabaseFactory(mongo.getUri());
    }
}
