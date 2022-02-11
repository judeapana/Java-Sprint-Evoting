package com.evoting.main.vote;

import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface VoteRepository extends CrudRepository<Vote, UUID> {
}
