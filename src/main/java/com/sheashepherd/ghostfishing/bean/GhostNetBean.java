package com.sheashepherd.ghostnetfishing.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.sheashepherd.ghostnetfishing.model.GhostNet;
import com.sheashepherd.ghostnetfishing.model.Person;

@Named
@RequestScoped
public class GhostNetBean {

    @PersistenceContext
    private EntityManager entityManager;

    private GhostNet ghostNet = new GhostNet();
    private Person reporter = new Person();

    public String reportGhostNet() {
        ghostNet.setReporter(reporter);
        entityManager.persist(ghostNet);
        return "index.xhtml?faces-redirect=true";
    }

    public GhostNet getGhostNet() {
        return ghostNet;
    }

    public void setGhostNet(GhostNet ghostNet) {
        this.ghostNet = ghostNet;
    }

    public Person getReporter() {
        return reporter;
    }

    public void setReporter(Person reporter) {
        this.reporter = reporter;
    }
}
