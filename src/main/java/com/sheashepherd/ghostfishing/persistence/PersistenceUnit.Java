package com.sheashepherd.ghostnetfishing.persistence;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUnit {
    private static EntityManagerFactory emf;

    static {
        emf = Persistence.createEntityManagerFactory("ghostnetfishingPU");
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return emf;
    }
}
