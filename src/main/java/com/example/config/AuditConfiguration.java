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

     // ... a few abstract methods omitted here

     // this creates the auditor aware bean that will feed the annotations
     @Bean
     public NaiveAuditorAware testAuditorAware() {
          return new NaiveAuditorAware();
     }

     @Override
     protected List<String> getBootstrapHosts() {
          // TODO Auto-generated method stub
          return Collections.singletonList("127.0.0.1");
     }

     @Override
     protected String getBucketName() {
          // TODO Auto-generated method stub
          return "netascouchdb";
     }

     @Override
     protected String getBucketPassword() {
          // TODO Auto-generated method stub
          return "vtys";
     }
}
