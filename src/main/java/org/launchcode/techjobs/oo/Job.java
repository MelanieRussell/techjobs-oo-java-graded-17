package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        id = nextId;
        nextId++;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;


    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
@Override
    public String toString(){
       String word = "ID: "+ this.getId() + System.lineSeparator();

       word+="Name: ";
       if(this.getName()==null||this.getName().isEmpty()){word+="Data not available";}
       else word+=this.getName();
       word+=System.lineSeparator();

        word+= "Employer: ";
        if (this.getEmployer() == null) {
            word+="Data not available";
        } else word+=this.getEmployer();
        word+=System.lineSeparator();

        word+= "Location: ";
        if (this.getLocation() == null) {
            word+="Data not available";
        } else word+=this.getLocation();
        word+=System.lineSeparator();

        word+= "Position Type: ";
        if (this.getPositionType() == null) {
            word+="Data not available";
        } else word+=this.getPositionType();
        word+=System.lineSeparator();

        word+= "Core Competency: ";
        if (this.getCoreCompetency() == null) {
            word+="Data not available";
        } else word+=this.getCoreCompetency();


        System.out.println(word);
return (System.lineSeparator() +word+ System.lineSeparator());


    }





}
