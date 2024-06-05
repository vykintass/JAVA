package lt.vtmc.praktiniai.users;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Praktiniai {

    public static Integer countUsersOlderThen25(List<User> users) {

//       int count= 0;
//        for (User u:users) {
//            if (u.getAge()>25){
//                count++;
//            }
//        }
//        return count;

        return (int)users.stream().filter(u -> u.getAge() > 25).count();

    }

    public static double getAverageAge(List<User> users) {
//mapToInt
//        int count = 0;
//        int sum = 0;
//        for (User u :users) {
//            count++;
//            sum=sum+u.getAge();
//        }
//        return  (double)sum/count;

        return users.stream().mapToInt(u -> u.getAge()).average().getAsDouble();
    }

    public static Integer getMinAge(List<User> users) {

//        int min = users.get(0).getAge();
//        for(User u : users){
//            if (min>u.getAge()){
//                min=u.getAge();
//            }
//        }
//        return  min;
        return users.stream().mapToInt(u -> u.getAge()).min().getAsInt();
    }

    public static User findByName(List<User> users, String name) {

//        for (User u :users) {
//            if(u.getName().equals(name)){
//                return u;
//            }
//        }
//        return null;

        return users.stream().filter(u -> u.getName().equals(name)).findFirst().orElse(null);

    }

    public static List<User> sortByAge(List<User> users) {

        return users.stream().sorted(Comparator.comparingInt(User::getAge)).collect(Collectors.toList());
    }

    public static User findOldest(List<User> users) {
        User oldest = users.get(0);
        for(User u: users){
            if(u.getAge()>oldest.getAge()){
                oldest = u;
            }
        }return oldest;


//        return users.stream().max(Comparator.comparingInt(User::getAge)).orElse(null);
    }

    public static int sumAge(List<User> users) {
        int sum = 0;
        for (User u : users) {
            sum = sum + u.getAge();
        }
        return sum;

//        return users.stream().mapToInt(u->u.getAge()).sum();
    }

}
