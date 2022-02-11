package com.evoting.main.voter;

import com.evoting.main.user.User;
import com.evoting.main.vote.Vote;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Voter {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID uuid;
    @OneToOne
    private User user;
    @OneToMany
    private List<Vote> votes;

    public Voter() {

    }
}
