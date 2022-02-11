package com.evoting.main.user.proxy;

import com.evoting.main.user.User;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.UUID;

@Entity
public class Proxy {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID uuid;
    @OneToOne
    private User proxy_user;
    @OneToOne
    private User proxied_user;

    public Proxy() {

    }
}
