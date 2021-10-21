package hw_Lesson5;

public class selectionSort {

    public static void main(String[] args) {

    int[] a1 = {9,6,3,1,2,4,5,10,90,89,01};
    new selectionSort(a1);
    System.out.println("The sorted elements are:");
    for(int i:a1){

        System.out.println(i);
         }
     }
    
    public selectionSort(int[] a1){

        for(int i=0;i<a1.length-1;i++){

            int index =i;
            for(int j=i+1;j<a1.length;j++){
                if(a1[j]<a1[index]){

                    index =j;
                }

            }
            int smallNumber = a1[index];
            a1[index]= a1[i];
            a1[i]= smallNumber;
        }
    }
}
