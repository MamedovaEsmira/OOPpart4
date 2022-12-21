package products;

import java.util.HashSet;
import java.util.Set;


public class OtherHW {
    public static void main(String[] args) {
        Set <Integer> numbers = new HashSet<>();
        while (numbers.size() <20) {
            int rand = (int) (Math.random()*1000);
            numbers.add(rand);
            if(rand%2==1){
                numbers.remove(rand);
            }
        }
        System.out.println(numbers);
    }
}
