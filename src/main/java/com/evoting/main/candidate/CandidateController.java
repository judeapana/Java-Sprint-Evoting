package com.evoting.main.candidate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
public class CandidateController {

    @Autowired
    private CandidateService candidateService;

    @GetMapping("/candidates")
    public Page<Candidate> getCandidates(Pageable pageable) {
        return candidateService.getAll(pageable);
    }

    @GetMapping("/candidates/{uuid}")
    public ResponseEntity<Candidate> getCandidate(@PathVariable UUID uuid) {
        return candidateService.get(uuid);
    }

    @PostMapping("/candidates")
    public ResponseEntity<Candidate> createCandidates(@RequestBody Candidate candidates) {
        return candidateService.create(candidates);
    }

    @DeleteMapping("/candidates")
    public ResponseEntity<Candidate> deleteCandidates(@RequestBody List<Candidate> candidates) {
        return candidateService.delete(candidates);
    }
}
