package com.etaskify.az.controller;

import com.etaskify.az.dto.CreateOrganizationRequestDto;
import com.etaskify.az.service.OrganizationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/organization")
@RequiredArgsConstructor
public class OrganizationController {

    private final OrganizationService organizationService;

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody CreateOrganizationRequestDto dto) {
        organizationService.create(dto);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
