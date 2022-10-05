public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayStructures2 array = new ArrayStructures2(20000);

        array.generateRandomIntArray(1, 10);
        long start = System.currentTimeMillis();
        array.bubbleSort();
        System.out.println("took: " +(System.currentTimeMillis()- start));


    }
}
