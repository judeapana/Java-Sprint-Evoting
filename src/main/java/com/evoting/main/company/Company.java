package com.evoting.main.company;

import com.evoting.main.election.Election;
import com.evoting.main.user.User;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
public class Company {
    @Id
    @Column(unique = true)
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID uuid;
    private String name;
    @ManyToMany
    private List<User> users;
    @OneToMany(mappedBy = "company")
    private List<Election> elections;

}
