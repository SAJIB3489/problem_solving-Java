package List_task;
import java.util.Arrays;

/*
3. ownArrayList that contains integers as values. implement insertion sort to it.

 */

public class Q3 {
    public static class OwnArrayList {
        private int[] arr;
        private int beginIndex = 0;
        private int endIndex = -1;

        private void doubleSize() {
            int[] newArr = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[(beginIndex + i) % arr.length];
            }
            endIndex = arr.length - 1;
            beginIndex = 0;
            arr = newArr;
        }

        public void addToEnd(int x) {
            if (arr == null) {
                arr = new int[4];
                arr[beginIndex] = x;
                endIndex++;
            } else {
                if (beginIndex - endIndex == 1) doubleSize();
                endIndex++;
                endIndex = (endIndex + arr.length) % arr.length;
                arr[endIndex] = x;
            }
        }

        public void addToBeginning(int x) {
            if (arr == null) {
                arr = new int[4];
                arr[beginIndex] = x;
                endIndex++;
            } else {
                if (beginIndex - endIndex == 1) doubleSize();
                beginIndex--;
                beginIndex = (beginIndex + arr.length) % arr.length;
                arr[beginIndex] = x;
            }
        }

        public void wedge(int index, int x) {
            int helper = arr[(beginIndex + index) % arr.length];
            arr[(beginIndex + index) % arr.length] = x;
            endIndex++;

            while ((beginIndex + index) % arr.length != endIndex) {
                x = helper;
                index++;
                helper = arr[(beginIndex + index) % arr.length];
                arr[(beginIndex + index) % arr.length] = x;
            }
        }

        public int getElement(int k) {
            if (k >= this.getLength())
                throw new IndexOutOfBoundsException("Index out of bounds for " + k);
            return arr[(beginIndex + k) % arr.length];
        }

        public int getLength() {
            return endIndex - beginIndex + 1;
        }

        public void insertionSort() {
            for (int i = beginIndex + 1; i <= endIndex; i++) {
                int key = arr[i];
                int j = i - 1;

                while (j >= beginIndex && arr[j] > key) {
                    arr[(j + 1) % arr.length] = arr[j];
                    j--;
                }

                arr[(j + 1) % arr.length] = key;
            }
        }


        @Override
        public String toString() {
            int[] strInt = new int[endIndex - beginIndex + 1];
            for (int i = 0; i < strInt.length; i++) {
                strInt[i] = arr[(beginIndex + i) % arr.length];
            }
            return Arrays.toString(strInt);
        }
    }

    public static void main(String[] args) {
        OwnArrayList ownArrayList = new OwnArrayList();
        ownArrayList.addToEnd(3);
        ownArrayList.addToEnd(2);
        ownArrayList.addToEnd(1);
        ownArrayList.addToEnd(4);
        ownArrayList.addToEnd(5);

        System.out.println("Before The Insertion Sort: " + ownArrayList.toString());

        ownArrayList.insertionSort();

        System.out.println("After The Insertion Sort: " + ownArrayList.toString());
    }
}


// I got the idea from the following website.

// https://www.programiz.com/dsa/insertion-sort
//https://www.geeksforgeeks.org/insertion-sort/