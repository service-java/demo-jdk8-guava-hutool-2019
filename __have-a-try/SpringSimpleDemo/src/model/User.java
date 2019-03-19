package model;

public class User {

    private String userName;//用户名
    private String password;//密码
    private String pass;//确认密码
    private String mail;

    private String tel;
    private String address;


    private String favor;//兴趣爱好


    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPass() {
        return pass;
    }
    public void setPass(String pass) {
        this.pass = pass;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getFavor() {
        return favor;
    }
    public void setFavor(String favor) {
        this.favor = favor;
    }
}
