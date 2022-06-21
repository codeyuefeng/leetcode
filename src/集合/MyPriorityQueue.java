package 集合;

import java.util.*;

public class MyPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        for(int i=0;i<10;i++)
        {
            int tmp= (int) (Math.random()*10);

            queue.offer(tmp);
        }

        System.out.println(queue.peek());

        while (!queue.isEmpty())
        {
            System.out.println(queue.poll());
        }

        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        //将集合所有元素加入
        queue.addAll(list);
        System.out.println("---------------------------");
        for(Integer tmp:queue)
        {
            System.out.println(tmp);
        }

        System.out.println(queue.contains(5));

        queue.remove(3);
        System.out.println(queue);

        queue.clear();
        System.out.println(queue);

    }
}
