package org.example.PTSantiago.controller;

import com.example.models.BalanceDTO;
import org.example.PTSantiago.input.controller.PaymentsController;
import org.example.PTSantiago.input.mapper.BalanceDtoMapper;
import org.example.PTSantiago.model.Balance;
import org.example.PTSantiago.service.PaymentsService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class PaymentsControllerTest {

    @InjectMocks
    private PaymentsController paymentsController;

    @Mock
    private PaymentsService paymentsService;

    @Mock
    private BalanceDtoMapper balanceDtoMapper;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testGetPaymentsBalanceId() {
        Integer id = 1;
        BalanceDTO balanceDTO = new BalanceDTO(); // Simulated DTO object
        Balance serviceResponse = new Balance();   // Simulated service response object

        when(paymentsService.getPaymentsBalanceId(id)).thenReturn(serviceResponse);
        when(balanceDtoMapper.toDto(serviceResponse)).thenReturn(balanceDTO);

        ResponseEntity<BalanceDTO> responseEntity = paymentsController.getPaymentsBalanceId(id);

        assertEquals(HttpStatus.OK, responseEntity.getStatusCode());
        assertEquals(balanceDTO, responseEntity.getBody());

    }
}
