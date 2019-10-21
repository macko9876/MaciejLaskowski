public class Homework3swap {
    public static void main(String args[]) {
        int[] myArray = {23, 22, 16, -39, 13};

        int j=0;
        int k=0;
        int arrayLength = myArray.length;
        for (int i = 0; i < arrayLength; i++){
            System.out.print(myArray[i]);
            j++;
            if (j != arrayLength) {
                System.out.print(", ");
            }
        }
        int i =0;
        int temp = 0;
        System.out.println();
        for( i = 0; i < arrayLength - 1; i++ ){
            for (j = 0; j< arrayLength - 1; j++){
                if ( myArray[j] > myArray[j+1]){
                    temp = myArray[j];
                    myArray[j] = myArray[j+1];
                    myArray[j+1] = temp;
                }
            }
        }
        System.out.println();
        for (int z = 0; z < arrayLength; z++){
            System.out.print(myArray[z]);

            if (z != (arrayLength-1)) {
                System.out.print(", ");
            }
        }
    }
}
