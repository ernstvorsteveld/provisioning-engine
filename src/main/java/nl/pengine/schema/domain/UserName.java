package nl.pengine.schema.domain;

/**
 */
public class UserName {

    private String firstname;
    private String prefix;
    private String surname;
    private String initials;
    private String nickname;
    private String mothersName;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getMothersName() {
        return mothersName;
    }

    public void setMothersName(String mothersName) {
        this.mothersName = mothersName;
    }

    @Override
    public String toString() {
        return "UserName{" +
                "firstname='" + firstname + '\'' +
                ", prefix='" + prefix + '\'' +
                ", surname='" + surname + '\'' +
                ", initials='" + initials + '\'' +
                ", nickname='" + nickname + '\'' +
                ", mothersName='" + mothersName + '\'' +
                '}';
    }
}
