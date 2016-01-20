package com.example.service

import org.springframework.stereotype.Service

@Service
class ExampleIntegrationService implements IntegrationService{
    @Override
    String m1() {
        return 'm1'
    }
}
