package org.example.PTSantiago.output.repository;

import org.example.PTSantiago.model.Balance;
import org.example.PTSantiago.output.mapper.BalanceEntityMapper;
import org.example.PTSantiago.repository.BalanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BalanceH2RepositoryImpl implements BalanceRepository {

    @Autowired
    BalanceJPARepository balanceJPARepository;

    @Autowired
    BalanceEntityMapper balanceEntityMapper;

    @Override
    public Balance getById(Integer id) {
       return balanceEntityMapper.toDomain(balanceJPARepository.getById(id));
    }
}
