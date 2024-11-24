package org.example.PTSantiago.usecase;

import org.example.PTSantiago.model.Balance;
import org.example.PTSantiago.repository.BalanceRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PaymentsServiceImplTest {

    @Mock
    private BalanceRepository balanceRepository;

    @InjectMocks
    private PaymentsServiceImpl paymentsService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetPaymentsBalanceId() {
        Integer balanceId = 1;
        Balance mockBalance = new Balance();
        mockBalance.setId(balanceId);
        mockBalance.setBalance(100.0F);

        when(balanceRepository.getById(balanceId)).thenReturn(mockBalance);

        Balance result = paymentsService.getPaymentsBalanceId(balanceId);

        assertEquals(mockBalance, result);
    }
}
