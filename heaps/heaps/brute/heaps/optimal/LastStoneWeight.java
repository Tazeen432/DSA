import java.util.PriorityQueue;
import java.util.Collections;

public class LastStoneWeight {

    public static void main(String[] args) {

        int stones[] = {2,7,4,1,8,1};

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<stones.length;i++) {
            pq.add(stones[i]);
        }

        while(pq.size()>1) {

            int x = pq.poll();
            int y = pq.poll();

            if(x != y) {
                pq.add(x-y);
            }
        }

        System.out.println(pq.peek());
    }
}