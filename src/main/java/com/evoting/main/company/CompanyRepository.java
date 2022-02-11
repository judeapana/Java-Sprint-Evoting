package com.evoting.main.company;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface CompanyRepository extends PagingAndSortingRepository<Company, UUID> {
}
