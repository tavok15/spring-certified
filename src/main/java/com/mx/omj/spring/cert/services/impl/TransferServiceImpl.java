package com.mx.omj.spring.cert.services.impl;

import com.mx.omj.spring.cert.respository.AccountRepository;
import com.mx.omj.spring.cert.services.TransferService;

public class TransferServiceImpl implements TransferService {
    public TransferServiceImpl(AccountRepository repository) {
    }

    @Override
    public String goodMornig(String name) {
        return "Good Morning ".concat(name);
    }
}
