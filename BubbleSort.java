public class Main{
    public static void main(String[] args){
        int []arr = {10,7,5,4,12,3};
        bubbleSort(arr);
        for(int num :arr) System.out.print(num+" ");
    }
    static void bubbleSort(int[] arr){
        int len = arr.length;

        for(int i =0;i<len-1;i++){
            boolean swap = false;
            for(int j =0;j<len-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap) break;
        }
    }
}