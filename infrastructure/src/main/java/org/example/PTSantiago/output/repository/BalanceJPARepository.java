package org.example.PTSantiago.output.repository;

import org.example.PTSantiago.output.entity.BalanceEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface BalanceJPARepository extends JpaRepository<BalanceEntity, Integer> {
}
