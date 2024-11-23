package org.example.PTSantiago.service;

import org.example.PTSantiago.model.Balance;
import org.example.PTSantiago.repository.BalanceRepository;
import org.example.PTSantiago.usecase.PaymentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentsServiceImpl implements PaymentsService {

    @Autowired
    BalanceRepository balanceRepository;


    @Override
    public Balance getPaymentsBalanceId(Integer id) {

        return this.balanceRepository.getById(id);
    }
}
