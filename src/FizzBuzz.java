import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> result = new ArrayList<String>();
        for (int i = 1; i <= n; i++){
            if ((i%5)==0 && (i%3)==0){
                result.add("FizzBuzz");
            }
            else if ((i%5)==0){
                result.add("Buzz");
            }
            else if ((i%3)==0){
                result.add("Fizz");
            }
            else{
                String s=String.valueOf(i);
                result.add(s);
            }
        }
        System.out.println(result);
        return result;
    }
    public static void main(String... args){
        FizzBuzz.fizzBuzz(15);
    }
}