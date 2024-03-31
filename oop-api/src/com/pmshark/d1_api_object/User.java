package com.pmshark.d1_api_object;

//Cloneable is a marker interface, which means it doesn't have any methods
public class User extends Object implements Cloneable{
    private int id;
    private String name;
    private String password;
    private double[] score;

    public User() {

    }

    public User(int id, String name, String password, double[] score) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.score = score;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //use super.clone() to clone the object
        //the clone() method is protected, so we need to override it
        User u2 = (User) super.clone(); //clone the object
        u2.score = u2.score.clone(); //clone the array -> deep clone: clone the object and the array
        return u2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double[] getScore() {
        return score;
    }

    public void setScore(double[] score) {
        this.score = score;
    }
}
