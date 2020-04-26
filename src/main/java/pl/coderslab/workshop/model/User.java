package pl.coderslab.workshop.model;


public class User {
    private Integer id;
    private String userName;
    private String email;
    private String password;
    private Integer groupId;   // czy to powinno byc zdefiniowane i miec gettert i settert?

    public User(){

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        hashPassword(password);
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer userGroupId) {
        this.groupId = userGroupId;
    }

    public int getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    public User(String userName, String email, String password, Integer groupId){
        this.userName = userName;
        this.email = email;
        this.hashPassword(password);
        this.groupId = groupId;
        //this.userGroupId = userGroupId;   // czy to powinno byc w ogole w konstruktorze ?

    }
    public void hashPassword(String password) {
        this.password = org.mindrot.jbcrypt.BCrypt.hashpw(password, org.mindrot.jbcrypt.BCrypt.gensalt());
    }




    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
              //  ", userGroupId=" + userGroupId +
                '}';
    }
}
