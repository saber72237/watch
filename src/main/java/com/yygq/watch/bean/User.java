package com.yygq.watch.bean;

public class User {
    private Integer id;
    private String user;
    private String password;
    private String userName;
    private String userEmail;
    private String userTel;
    private String userNation;
    private String userAge;
    private String userBT;
    private String userGender;
    private String userFT;
    private String userAdress;
    private Integer dId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public String getUserNation() {
        return userNation;
    }

    public void setUserNation(String userNation) {
        this.userNation = userNation;
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
    }

    public String getUserBT() {
        return userBT;
    }

    public void setUserBT(String userBT) {
        this.userBT = userBT;
    }

    public String getUserGender() {
        return userGender;
    }

    public void setUserGender(String userGender) {
        this.userGender = userGender;
    }

    public String getUserFT() {
        return userFT;
    }

    public void setUserFT(String userFT) {
        this.userFT = userFT;
    }

    public String getUserAdress() {
        return userAdress;
    }

    public void setUserAdress(String userAdress) {
        this.userAdress = userAdress;
    }

    public Integer getdId() {
        return dId;
    }

    public void setdId(Integer dId) {
        this.dId = dId;
    }
    public User(Integer id, String userName, String userEmail, String userGender,
                String userAdress,String userAge,String userBT,String userTel,
                String userFT,String user,Integer dId) {
        super();
        this.id = id;
        this.userName = userName;
        this.userEmail = userEmail;
        this.userGender = userGender;
        this.userAdress = userAdress;
        this.userAge = userAge;
        this.userBT = userBT;
        this.userTel = userTel;
        this.userFT = userFT;
        this.user = user;
        this.dId = dId;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                ", userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userNation='" + userNation + '\'' +
                ", userAge='" + userAge + '\'' +
                ", userBT='" + userBT + '\'' +
                ", userGender='" + userGender + '\'' +
                ", userFT='" + userFT + '\'' +
                ", userAdress='" + userAdress + '\'' +
                ", dId=" + dId +
                '}';
    }
}
