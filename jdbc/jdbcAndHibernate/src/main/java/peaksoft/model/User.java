package peaksoft.model;

import javax.persistence.*;

@Table
public class User {
    @Id
    private long id;

    @Column
    private String first_name;

    @Column
    private String last_name;

    @Column
    private Byte age;

    public User() {
    }

    public User(long id, String first_name, String last_name, Byte age) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", age=" + age +
                '}';
    }
}