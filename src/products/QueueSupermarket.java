package products;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class QueueSupermarket {
    private static final List<String>NAMES=List.of(
            "Петр Сергеев",
            "Николай Петров",
            "Любовь Петрова",
            "Дмитрий Горохов",
            "Иван Николаев",
            "Сергей Николаев",
            "Михаил Чеботарев",
            "Нина Валентинова",
            "Глеб Владимиров",
            "Наталья Николаева");
    private static  final Random RANDOM=new Random();
private static final int MAX_SiZE=5;

    public static void main(String[] args) {
        Queue<String>queue1=new ArrayDeque<>();
        Queue<String>queue2=new ArrayDeque<>();
        randomFilling(queue1);
        randomFilling(queue2);
        System.out.println("Первая очередь: " +queue1);
        System.out.println("Вторая очередь: " +queue2);
        System.out.println();
        add("Николай Петров",queue1,queue2);
        System.out.println("Первая очередь: " +queue1);
        System.out.println("Вторая очередь: " +queue2);
        System.out.println();
        remove(queue1,queue2);
        System.out.println("Первая очередь: " +queue1);
        System.out.println("Вторая очередь: " +queue2);
        System.out.println();
        add("Глеб Владимиров", queue1,queue2);
    }
    private static void remove(Queue<String>queue1,Queue<String>queue2){
        if(RANDOM.nextBoolean()) {
            queue1.poll();
        }else {
            queue2.poll();
        }
    }
    private static void add(String name,Queue<String>queue1,Queue<String>queue2){
        if (queue1.size()==MAX_SiZE && queue2.size()==MAX_SiZE){
            System.out.println("Нужно позвать Галю!");
            return;
        }
        if (queue1.size()<queue2.size()) {
            queue1.offer(name);
        }else {
            queue2.offer(name);
        }
    }

    private static void randomFilling(Queue<String>queue){
        int size= RANDOM.nextInt(MAX_SiZE+1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));
        }
        }
    }
