package com.eazybytes.accounts.service.client;

import com.eazybytes.accounts.dto.LoansDto;
import com.eazybytes.cards.dto.CardsDto;
import jakarta.validation.constraints.Pattern;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient("loans")
public interface loansFeignClient {

    @GetMapping(value = "/api/fetch",consumes = "applications/json")
    public ResponseEntity<LoansDto> fetchLoanDetails(@RequestParam String mobileNumber);

}
