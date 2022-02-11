package com.evoting.main.candidate;

import com.evoting.main.utils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CandidateService {

    private final CandidateRepository candidateRepository;

    public CandidateService(CandidateRepository candidateRepository) {
        this.candidateRepository = candidateRepository;
    }

    public Page<Candidate> getAll(Pageable pageable) {
        return candidateRepository.findAll(pageable);
    }

    public ResponseEntity<Candidate> get(UUID uuid) {
        return new ResponseEntity<>(candidateRepository.findById(uuid).orElseThrow(utils.NotFoundException::new), HttpStatus.OK);
    }

    public ResponseEntity<Candidate> create(Candidate candidate) {
        return new ResponseEntity<>(candidateRepository.save(candidate), HttpStatus.CREATED);
    }

    public ResponseEntity<Candidate> update(Candidate candidate) {
        return new ResponseEntity<>(candidateRepository.save(candidate), HttpStatus.ACCEPTED);
    }

    public ResponseEntity<Candidate> delete(List<Candidate> candidate) {
        candidateRepository.saveAll(candidate);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<Candidate> countVotes(Candidate candidate) {
        return null;
    }


}
