package com.hiego.hexagonal.adapters.out.client.mapper;

import com.hiego.hexagonal.adapters.out.client.response.AddressResponse;
import com.hiego.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {

    Address toAddress(AddressResponse addressResponse);
}
