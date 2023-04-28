package function;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class LambdaPractice {
    public static void main(String[] args){
        List<Student> student = new ArrayList<>();
        student.add(new Student("A", 80));
        student.add(new Student("B", 58));
        student.add(new Student("C", 95));
        student.add(new Student("D", 65));
        student.add(new Student("E", 100));

        System.out.println("スコアの合計値");
        System.out.println(student.stream().mapToInt(s -> s.score()).sum());

        System.out.println("スコアが80点以上のレコード");
        student.stream()
                .filter(user -> user.score() >= 80)
                .forEach(System.out::println);

        System.out.println("スコアが高い順");
        student.sort((u1, u2) -> u2.score() - u1.score());
        student.stream().forEach(s -> System.out.print(s.name() + " "));


//       （Streamを使用して）スコアが80以上のレコードだけ出力してください。
//        (Streamを使用して）スコアが高い順に並び替えて出力してください。



    }
}
