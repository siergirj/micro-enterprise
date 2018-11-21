package org.apache.micro.customer.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = {"org.apache.micro.customer.repository"} )
public class MongoConfig {

}