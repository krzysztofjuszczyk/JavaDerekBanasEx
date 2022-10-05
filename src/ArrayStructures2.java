import java.util.Arrays;

public class ArrayStructures2 {

    private int[] myArray;
    private int size;

    static long startTime;
    static long endTime;

    public ArrayStructures2(int size) {
        this.size = size;
        myArray =new int[size];
    }

    public void generateRandomIntArray (int min, int max){
        for (int i = 0; i<size; i++){
            myArray[i] =min + (int) (Math.random()*((max-min)+1));
        }
    }

    public void bubbleSort (){
        startTime = System.currentTimeMillis();
        for (int i = 0; i < size-1; i++) {
            for (int j = 0; j < size - i -1; j++) {

            if (myArray[j]>myArray[j+1]) {
                swapValues(j, j + 1);//zamieniamy
            }
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("Bubble sort time in ms:" + (endTime-startTime));
    }

    private void swapValues(int left, int right) {
        int tmp = myArray[right];
        myArray[right] = myArray[left];
        myArray[left] = tmp;
    }


    @Override
    public String toString() {
        return Arrays.toString(myArray);
    }
}
