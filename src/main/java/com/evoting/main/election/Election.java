package com.evoting.main.election;

import com.evoting.main.candidate.Candidate;
import com.evoting.main.company.Company;
import com.evoting.main.portfolio.Portfolio;
import com.evoting.main.vote.Vote;
import com.evoting.main.voter.Voter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Election {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID uuid;
    @OneToMany
    private List<Candidate> candidates;
    @OneToMany
    private List<Portfolio> portfolios;
    @OneToMany
    private List<Vote> votes;
    @ManyToMany
    private List<Voter> voters;
    @ManyToOne
    private Company company;

    public Election(List<Candidate> candidates, List<Portfolio> portfolios, List<Vote> votes, List<Voter> voters, Company company) {
        this.candidates = candidates;
        this.portfolios = portfolios;
        this.votes = votes;
        this.voters = voters;
        this.company = company;
    }

    public Election() {

    }

    public UUID getUuid() {
        return uuid;
    }

    public List<Candidate> getCandidates() {
        return candidates;
    }

    public void setCandidates(List<Candidate> candidates) {
        this.candidates = candidates;
    }

    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }

    public List<Vote> getVotes() {
        return votes;
    }

    public void setVotes(List<Vote> votes) {
        this.votes = votes;
    }

    public List<Voter> getVoters() {
        return voters;
    }

    public void setVoters(List<Voter> voters) {
        this.voters = voters;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
