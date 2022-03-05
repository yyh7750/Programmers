package 더_맵게;

import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public int solution(Integer[] scoville, int K) {
        // �ּڰ��� ���ϱ� ���� �켱����ť�� ����
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        // asAll()�� ����ϱ� ���� ����Ʈ
        List<Integer> list = Arrays.asList(scoville);

        minHeap.addAll(list);

        if (minHeap.peek() >= K) {
            return -1;
        }

        int root;
        int secondRoot;
        int answer = 0;
        while ((root = minHeap.poll()) < K) {
            secondRoot = minHeap.poll();
            root += secondRoot * 2;

            minHeap.add(root);
            answer++;
        }
        return answer;
    }
}