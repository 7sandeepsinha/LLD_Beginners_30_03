package javaOopsAndMultiThreading.multiThreading.executors;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    List<Integer> arrayToSort;
    ExecutorService executorService;

    public MergeSorter(List<Integer> arrayToSort, ExecutorService executorService) {
        this.arrayToSort = arrayToSort;
        this.executorService = executorService;
    }

    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size() <=1 )
            return arrayToSort;

        int mid = arrayToSort.size()/2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }

        for(int i=mid;i<arrayToSort.size();i++){
            rightArray.add(arrayToSort.get(i));
        }

        MergeSorter leftMergeSorter = new MergeSorter(leftArray, executorService);
        MergeSorter rightMergeSorter = new MergeSorter(rightArray, executorService);

        Future<List<Integer>> futureLeftSortedArray = executorService.submit(leftMergeSorter);
        Future<List<Integer>> futureRightSortedArray = executorService.submit(rightMergeSorter);

        List<Integer> sortedArray = new ArrayList<>();
        List<Integer> leftSortedArr = futureLeftSortedArray.get();
        List<Integer> rightSortedArr = futureRightSortedArray.get();

        int i=0,j=0;
        while(i < leftSortedArr.size() && j<rightSortedArr.size()){
            if(leftSortedArr.get(i) <= rightSortedArr.get(j)){
                sortedArray.add(leftSortedArr.get(i));
                i++;
            } else {
                sortedArray.add(rightSortedArr.get(j));
                j++;
            }
        }

        while(i<leftSortedArr.size()){
            sortedArray.add(leftSortedArr.get(i));
            i++;
        }

        while(j<rightSortedArr.size()){
            sortedArray.add(rightSortedArr.get(j));
            j++;
        }

        return sortedArray;
    }
}
