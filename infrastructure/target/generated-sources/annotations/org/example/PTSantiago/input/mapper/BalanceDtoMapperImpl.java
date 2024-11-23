package org.example.PTSantiago.input.mapper;

import com.example.models.BalanceDTO;
import javax.annotation.Generated;
import org.example.PTSantiago.model.Balance;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-11-23T19:09:59+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_322 (Amazon.com Inc.)"
)
@Component
public class BalanceDtoMapperImpl implements BalanceDtoMapper {

    @Override
    public BalanceDTO toDto(Balance domain) {
        if ( domain == null ) {
            return null;
        }

        BalanceDTO balanceDTO = new BalanceDTO();

        balanceDTO.setName( domain.getName() );
        balanceDTO.setId( domain.getId() );
        balanceDTO.setBalance( domain.getBalance() );

        return balanceDTO;
    }

    @Override
    public Balance toDomain(BalanceDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Balance balance = new Balance();

        balance.setName( dto.getName() );
        balance.setId( dto.getId() );
        balance.setBalance( dto.getBalance() );

        return balance;
    }
}
