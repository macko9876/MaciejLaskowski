public class Homework3 {
    public int max(int [] array) {
        int max = 0;

        for(int i=0; i<array.length; i++ ) {
            if(array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }
    public int min(int [] array) {
        int min = array[0];

        for(int i=0; i<array.length; i++ ) {
            if(array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String args[]) {
        int[] myArray = {23, 22, 16, -39, 13};
        int j=0;
        int k=0;
        int arrayLength = myArray.length;
        System.out.println("Długość tablicy to "+ arrayLength);
        Homework3 m = new Homework3();
        System.out.println("Maximum value in the array is::"+m.max(myArray));
        System.out.println("Minimum value in the array is::"+m.min(myArray));
        for (int i = 0; i < arrayLength; i++){
            System.out.print(myArray[i]);
            j++;
            if (j != arrayLength) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = arrayLength - 1; i>=0; i--){
            System.out.print(myArray[i]);
            k++;
            if (k != arrayLength) {
                System.out.print(", ");
            }
        }
    }
}