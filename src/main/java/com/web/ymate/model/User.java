package com.web.ymate.model;

public class User {
    private String id;
    private String mateName;
    private String mateId;

    public User() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMateName() {
        return mateName;
    }

    public void setMateName(String mateName) {
        this.mateName = mateName;
    }

    public String getMateId() {
        return mateId;
    }

    public void setMateId(String mateId) {
        this.mateId = mateId;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", mateName='" + mateName + '\'' +
                ", mateId='" + mateId + '\'' +
                '}';
    }
}
