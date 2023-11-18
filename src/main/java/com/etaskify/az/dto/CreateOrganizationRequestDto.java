package com.etaskify.az.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateOrganizationRequestDto {
    private String organizationName;
    private String phoneNumber;
    private String address;

    public Long getUserId() {
        return 1L;
    }
}
