package com.neusoft.system;


public class User {
    private String name;
    private String password;
    private String school;
    private int tel;
    private String position;


    public User(String name, String password) {
        super();
        this.name = name;
        this.password = password;
    }

    public User(String name, String password, String school) {
        super();
        this.name = name;
        this.password = password;
        this.school = school;
    }

    public User(String name, String password, String school, int tel) {
        super();
        this.name = name;
        this.password = password;
        this.school = school;
        this.tel = tel;
    }

    public User(String name, String password, String school, int tel, String position) {
        super();
        this.name = name;
        this.password = password;
        this.school = school;
        this.tel = tel;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getSchool() {
        return school;
    }

    public int getTel() {
        return tel;
    }

    public String getPosition() {
        return position;
    }
}
