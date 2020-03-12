package com.flyer.keycloak.extension;

import lombok.*;

/**
 * Custom user model
 *
 * When implemented in a relational database, username shall be the primary key
 *
 * @author Ruifeng Ma
 * @since 2019-May-25
 */

@Data
//@NoArgsConstructor
@ToString

public class User {
    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String favouriteLine; // custom attribute

    public User(String firstName, String lastName, String email, String favouriteLine) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favouriteLine = favouriteLine;
        this.email = email;
        this.username = this.email.toLowerCase();
        setPassword(this.username);
    }

    
    public void setUsername(String usernames) {
        this.username = usernames;
    }
    public String getUsername() {
        return this.username;
    }

    public void setPassword(String password) {
//        this.password = HashUtil.hashString(password);
        this.password = "1234";
    }

    public String getPassword() {
        return this.password;
    }


    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavouriteLine() {
        return favouriteLine;
    }

    public void setFavouriteLine(String favouriteLine) {
        this.favouriteLine = favouriteLine;
    }










}
