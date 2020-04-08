package com.mx.omj.spring.cert.configurations;

import com.mx.omj.spring.cert.respository.AccountRepository;
import com.mx.omj.spring.cert.respository.impl.JdbcAccountRepository;
import com.mx.omj.spring.cert.services.TransferService;
import com.mx.omj.spring.cert.services.impl.TransferServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TransferService transferService() {
        return new TransferServiceImpl(accountRepository());
    }

    @Bean
    public AccountRepository accountRepository() {
        return new JdbcAccountRepository();
    }
}
