package com.example.domain.util;

import org.springframework.data.domain.AuditorAware;

/**
 * @author msaritas
 *
 */
public class NaiveAuditorAware implements AuditorAware<String> {

     private String auditor = "auditor";

     @Override
     public String getCurrentAuditor() {
          return auditor;
     }

     public void setAuditor(String auditor) {
          this.auditor = auditor;
     }
}