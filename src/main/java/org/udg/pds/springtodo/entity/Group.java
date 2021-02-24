package org.udg.pds.springtodo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonView;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

@Entity(name = "usergroup")
public class Group implements Serializable {

    private static final long serialVersionUID = 1L;
    public Group(){
    }

    public Group(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Id
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @ManyToOne(fetch = FetchType.EAGER)
    private User user;
}
