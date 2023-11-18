package com.etaskify.az.service;

import com.etaskify.az.dto.CreateOrganizationRequestDto;
import com.etaskify.az.model.Organization;
import com.etaskify.az.repository.OrganizationRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrganizationService {
    private final OrganizationRepository repository;

    public void create(CreateOrganizationRequestDto dto) {

        Organization organization = Organization.builder()
                .organizationName(dto.getOrganizationName())
                .address(dto.getAddress())
                .phoneNumber(dto.getPhoneNumber())
                .userId(dto.getUserId())
                .build();
        repository.save(organization);
    }
}
