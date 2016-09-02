/*
 * Copyright (c) 2016. Pritesh Patel
 */

package com.adesa.interview.tabviewpagerexample.databasegreendao;

/**
 * The type User.
 */
/*import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Index;

@Entity(
        // If you want to have more than one schema, you can tell greenDAO
        // to which schema an entity belongs (pick any string as a name).
        schema = "myschema",

        // Flag to make an entity "active": Active entities have update,
        // delete, and refresh methods.
        active = true,

        // Specifies the name of the table in the database.
        // By default, the name is based on the entities class name.
        nameInDb = "AWESOME_USERS",

        // Define indexes spanning multiple columns here.
        indexes = {
                @Index(value = "name DESC", unique = true)
        },

        // Flag if the DAO should create the database table (default is true).
        // Set this to false, if you have multiple entities mapping to one table,
        // or the table creation is done outside of greenDAO.
        createInDb = false
)*/
public class User {
    /**
     * The Id.
     */
    int id;
    /**
     * The Name.
     */
    String name;

    /**
     * Instantiates a new User.
     *
     * @param id   the id
     * @param name the name
     */
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }
}
