package com.evoting.main.candidate;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Candidate {
    @Id
    @Column(unique = true)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID uuid;
    private String img;
    private String fullName;
//    private Boolean status;
    private Integer order;
//    @OneToOne
//    private Election election;
//    @OneToOne
//    private Portfolio portfolio;
//    @OneToMany
//    private List<Vote> votes;

//    public Candidate(List<Vote> votes, String img, String fullName, Boolean status, Integer order, Election election, Portfolio portfolio) {
//        this.img = img;
//        this.status = status;
//        this.votes = votes;
//        this.fullName = fullName;
//        this.order = order;
//        this.election = election;
//        this.portfolio = portfolio;
//    }

    public Candidate() {
    }

}
