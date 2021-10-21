package hw_Lesson5;

public class bubbleSort {
	
    public static void main(String[] args){
     int[] b1 = {9,6,3,1,2,4,5,10,90,89,01};
     new bubbleSort(b1);
     for(int i=0;i<b1.length;i++){

        System.out.println(b1[i]);
        }
    }
    
    public bubbleSort(int[] b1){
        int len = b1.length;
        int temp = 0;
        for(int i=0;i<len;i++){
            for (int j=1;j<(len);j++){
                if(b1[j-1]>b1[j]){
                temp = b1[j-1];
                b1[j-1]= b1[j];
                b1[j]= temp;

                }
            }
        }
    }
}

