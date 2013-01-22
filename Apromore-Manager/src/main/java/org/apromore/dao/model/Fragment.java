package org.apromore.dao.model;

import org.springframework.beans.factory.annotation.Configurable;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Fragment generated by hbm2java
 */
@Entity
@Table(name = "fragment")
@Configurable("fragment")
public class Fragment implements Serializable {

    private Integer id;
    private Integer propagationPolicy;

    private Set<FragmentVersion> fragmentVersions = new HashSet<FragmentVersion>(0);
    private Set<FragmentUser> fragmentUsers = new HashSet<FragmentUser>(0);


    /**
     * Default Constructor.
     */
    public Fragment() {
    }


    /**
     * Get the Primary Key for the Object.
     * @return Returns the Id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    public Integer getId() {
        return id;
    }

    /**
     * Set the id for the Object.
     * @param newId The role name to set.
     */
    public void setId(final Integer newId) {
        this.id = newId;
    }


    @Column(name = "propagation_policy")
    public Integer getPropagationPolicy() {
        return this.propagationPolicy;
    }

    public void setPropagationPolicy(final Integer newPropagationPolicy) {
        this.propagationPolicy = newPropagationPolicy;
    }



    @OneToMany(mappedBy = "fragment")
    public Set<FragmentVersion> getFragmentVersions() {
        return this.fragmentVersions;
    }

    public void setFragmentVersions(final Set<FragmentVersion> newFragmentVersions) {
        this.fragmentVersions = newFragmentVersions;
    }

    @OneToMany(mappedBy = "fragment")
    public Set<FragmentUser> getFragmentUsers() {
        return this.fragmentUsers;
    }

    public void setFragmentUsers(Set<FragmentUser> fragmentUsers) {
        this.fragmentUsers = fragmentUsers;
    }
}

