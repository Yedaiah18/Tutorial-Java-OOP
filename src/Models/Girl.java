package Models;
// Encapsulation & Object manipulation
public class Girl {
    private String name;
    private String crush;
        private Integer age;
        private String birthday;
    public Girl() {

    }
    public Girl(String name, String crush, Integer age, String birthday) {
        this.name = name;
        this.crush = crush;
        this.age = age;
        this.birthday = birthday;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCrush() {
        return crush;
    }

    public void setCrush(String crush) {
        this.crush = crush;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
}
