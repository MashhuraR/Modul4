package BeshinchiMavzu;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ForkJoinTest {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool=new ForkJoinPool();
        int[]arr={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        long result=forkJoinPool.invoke(new SumTask(arr,0,arr.length));
        System.out.println("Natija:"+result);

    }
    static class SumTask extends RecursiveTask<Long> {
        public int []arr;
        public int start;
        public int end;
        public static final int chegara=10;
        public SumTask(int[] arr, int start, int end) {
            this.arr = arr;
            this.start = start;
            this.end = end;
        }

        @Override
        protected Long compute() {
            long sum=0;
            if (end-start<=chegara){
                for (int i = start; i <end; i++) {
                    sum+=arr[i];
                }
                return sum;
            }else {
                int middle=(end+start)/2;
                SumTask left=new SumTask(arr,start,middle);
                SumTask right=new SumTask(arr,middle,end);
                left.fork();
                long rightResult=right.compute();
                long leftResult=left.join();
                return rightResult+leftResult;
            }
        }
    }
}
