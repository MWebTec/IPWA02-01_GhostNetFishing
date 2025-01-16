package com.sheashepherd.ghostnetfishing.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.sheashepherd.ghostnetfishing.model.Person;

@Named
@RequestScoped
public class PersonBean {

    @PersistenceContext
    private EntityManager entityManager;

    private Person person = new Person();

    public String savePerson() {
        entityManager.persist(person);
        return "index.xhtml?faces-redirect=true";
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
