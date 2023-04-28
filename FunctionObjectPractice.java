package function;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.Arrays;
import java.util.function.UnaryOperator;
import java.util.Scanner;
import java.util.function.BiFunction;

public class FunctionObjectPractice {
    public static void main(String[] args) {

        Predicate<Integer> oodEven = (n) -> {
            boolean bool;
            if (n % 2 == 0) {
                System.out.print("偶数 ");
                bool = true;
            } else {
                bool = false;
                System.out.print("奇数 ");
            }
            return bool;
        };

        Function<String,String> revers = (str) ->{
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString();
        };

        Function<String,String> array = (str2) ->{
            String[] parts = str2.split(",");
            return Arrays.toString(parts);
        };

        UnaryOperator<Integer> mult = (num) ->{
            System.out.print("数値を入力してください：");
            var sc = new Scanner(System.in);
            var s1 = sc.nextLine();
            var num2 = Integer.parseInt(s1);
            for(var i = 0; i < num2; i++){
                num *= 2;
            }
            return num;
        };
        BiFunction<Integer,String,String> link = (num,str) ->{
            StringBuilder sb = new StringBuilder();
            for (var i = 0; i < num; i++) {
                sb.append(str);
            }
            return sb.toString();
        };

        System.out.println(oodEven.test(5));
        System.out.println(revers.apply("Hello"));
        System.out.println(array.apply("Hello,World"));
        System.out.println(link.apply( 4,"Hello"));

    }

}

