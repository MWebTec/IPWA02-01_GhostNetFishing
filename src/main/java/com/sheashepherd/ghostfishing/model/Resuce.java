package com.sheashepherd.ghostnetfishing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rescue {

    @Id
    @GeneratedValue
    private Long id;
    private GhostNet ghostNet;
    private Person rescuer;

    // Getter und Setter
}
