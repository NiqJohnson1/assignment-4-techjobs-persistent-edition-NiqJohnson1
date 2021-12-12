package org.launchcode.techjobs.persistent.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Job extends AbstractEntity{

    @ManyToOne
    @NotNull(message = "Employer is required")
    private Employer employer;

    @ManyToMany
    private final List<Skill> skills = new ArrayList<>();

    public Job() {}

//    public Job(Employer anEmployer, List<Skill> someSkills) {
//        this.employer = anEmployer;
//        this.skills = someSkills;
//
//    }

    // Getters and setters.


    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Job job = (Job) o;
        return Objects.equals(employer, job.employer) && Objects.equals(skills, job.skills);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), employer, skills);
    }


}
