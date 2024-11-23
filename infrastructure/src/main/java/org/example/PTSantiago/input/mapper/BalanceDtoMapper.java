package org.example.PTSantiago.input.mapper;

import com.example.models.BalanceDTO;
import org.example.PTSantiago.model.Balance;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface BalanceDtoMapper {

    @Mapping(source = "name", target = "name")
    @Mapping(source = "id", target = "id")
    @Mapping(source = "balance", target = "balance")
    BalanceDTO toDto (Balance domain);

    @InheritInverseConfiguration
    Balance toDomain (BalanceDTO dto);

}
