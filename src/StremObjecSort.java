import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StremObjecSort {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>(Arrays.asList(new User("John", 33),
                new User("Robert", 26),
                new User("Mark", 26),
                new User("Brandon", 42)));

        List<User> users = userList.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
        users.forEach(u -> System.out.println(u.getName()));
    }
}

class User {

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Constructor, getters, setters and toString()
}
