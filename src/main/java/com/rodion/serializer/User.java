package com.rodion.serializer;

import java.io.Serializable;
import java.time.Instant;
import java.util.List;

/**
 * @author Rodion Zlobin {@literal <mailto:rodion.zlobin@so4it.com/>}.
 */
public class User implements Serializable {

    private String firstName;
    private String lastName;
    private List list;
    private Instant instant;

    public User(String firstName, String lastName, List list, Instant instant) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.list = list;
        this.instant = instant;
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

    public List getList() {
        return list;
    }

    public Instant getInstant() {
        return instant;
    }

    public void setInstant(Instant instant) {
        this.instant = instant;
    }

    public void setList(List list) {
        this.list = list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (firstName != null ? !firstName.equals(user.firstName) : user.firstName != null) return false;
        return lastName != null ? lastName.equals(user.lastName) : user.lastName == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "com.rodion.serializer.User : " +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'';
    }
}
