package POJO;

import java.util.Objects;

public class User {
    private final String name;
    private final int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

   @Override
    public String toString() {
        return String.format("Name is %s, age is %d", getName(), getAge());
    }

    public static void main(String[] args) {
        User user1  = new User("Jack", 15);
        User user2  = new User("Jack", 15);
        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user1.toString());
    }
}
