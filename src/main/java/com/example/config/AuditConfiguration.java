package com.example.config;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;
import org.springframework.data.couchbase.repository.auditing.EnableCouchbaseAuditing;

import com.example.domain.util.NaiveAuditorAware;

/**
 * @author msaritas
 *
 */
@Configuration
@EnableCouchbaseAuditing
public class AuditConfiguration extends AbstractCouchbaseConfiguration {

     @Bean
     public NaiveAuditorAware testAuditorAware() {
          return new NaiveAuditorAware();
     }

     @Override
     protected List<String> getBootstrapHosts() {
          return Collections.singletonList("127.0.0.1");
     }

     @Override
     protected String getBucketName() {
          return "netascouchdb";
     }

     @Override
     protected String getBucketPassword() {
          return "vtys";
     }
}
