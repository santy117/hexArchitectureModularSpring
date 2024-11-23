package org.example.PTSantiago.input.mapper;

import javax.annotation.Generated;
import org.example.PTSantiago.model.Balance;
import org.example.PTSantiago.output.entity.BalanceEntity;
import org.example.PTSantiago.output.entity.BalanceEntity.BalanceEntityBuilder;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-23T19:09:59+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_322 (Amazon.com Inc.)"
)
@Component
public class BalanceEntityMapperImpl implements BalanceEntityMapper {

    @Override
    public BalanceEntity toEntity(Balance domain) {
        if ( domain == null ) {
            return null;
        }

        BalanceEntityBuilder balanceEntity = BalanceEntity.builder();

        balanceEntity.name( domain.getName() );
        balanceEntity.id( domain.getId() );
        balanceEntity.balance( domain.getBalance() );

        return balanceEntity.build();
    }

    @Override
    public Balance toDomain(BalanceEntity entity) {
        if ( entity == null ) {
            return null;
        }

        Balance balance = new Balance();

        balance.setName( entity.getName() );
        balance.setId( entity.getId() );
        balance.setBalance( entity.getBalance() );

        return balance;
    }
}
