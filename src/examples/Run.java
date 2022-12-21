package examples;

import java.util.HashSet;
import java.util.Set;
public class Run {

    public static void main(String[] args) {
        Set<Examples> examples = new HashSet<>();
        while(examples.size()<15){
            Examples example = new Examples((int) (1+ Math.random()*9), (int) (1+ Math.random()*9));
            if(examples.contains(example)){
                examples.remove(example);
                examples.add(example);
            }
            examples.add(example);
            System.out.println(example);
        }


    }
}
