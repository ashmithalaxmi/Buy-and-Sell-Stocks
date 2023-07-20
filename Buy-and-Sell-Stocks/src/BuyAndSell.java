import java.util.Scanner;

public class BuyAndSell {
    public static int profitSum(int[] arr, int n){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int index =0 ;
        int profit=0;
        for(int i=0;i<n;i++){
            if(arr[i] > max){
                max=arr[i];
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]==max){
                index = j;
            }
        }
        for(int k=0;k<=index;k++){
            if(arr[k]<min){
                min=arr[k];
            }
        }
        profit = max-min;

        return profit;

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println(profitSum(arr, n));
    }
}
