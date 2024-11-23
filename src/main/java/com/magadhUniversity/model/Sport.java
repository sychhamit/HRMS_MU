package com.magadhUniversity.model;



import jakarta.persistence.*;

@Entity
public class Sport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String department;
    private String contact;
    private String sports;
    private String sportsrole;
    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    public String getSports() {
        return sports;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }
    public String getSportsrole() {
        return sportsrole;
    }

    public void setSportsrole(String sportsrole) {
        this.sportsrole = sportsrole;
}
}
