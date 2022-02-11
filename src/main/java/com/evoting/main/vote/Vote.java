package com.evoting.main.vote;

import com.evoting.main.candidate.Candidate;
import com.evoting.main.utils;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Vote {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID uuid;
    @ManyToOne
    private Candidate candidate;
    private utils.VoteOption voteOption;

    public Vote() {
    }

    public Vote(Candidate candidate, utils.VoteOption voteOption) {
        this.candidate = candidate;
        this.voteOption = voteOption;
    }

    public UUID getUuid() {
        return uuid;
    }

    public Candidate getCandidate() {
        return candidate;
    }

    public void setCandidate(Candidate candidate) {
        this.candidate = candidate;
    }

    public utils.VoteOption getVoteOption() {
        return voteOption;
    }

    public void setVoteOption(utils.VoteOption voteOption) {
        this.voteOption = voteOption;
    }
}
