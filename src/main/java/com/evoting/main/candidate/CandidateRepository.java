package com.evoting.main.candidate;

import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface CandidateRepository extends PagingAndSortingRepository<Candidate, UUID> {
}
