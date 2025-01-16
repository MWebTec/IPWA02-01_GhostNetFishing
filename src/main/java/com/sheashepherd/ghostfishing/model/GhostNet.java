package com.sheashepherd.ghostnetfishing.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class GhostNet {

    @Id
    @GeneratedValue
    private Long id;
    private double locationLat;
    private double locationLon;
    private String sizeEstimate;
    private String status; // Gemeldet, Bergung bevorstehend, Geborgen, Verschollen
    private Person reporter;

    // Getter und Setter
}
