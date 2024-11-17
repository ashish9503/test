import java.util.Scanner;
public class Odd_Even {
    public static int odde(int arr[], int n){
        int odd=0;
        int even=0;
        for(int i=0; i<arr.length; i++){
            if(n%2==0){
                even++;
            }
            else
            odd++;
        }
        return odd;

    }
   public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int a=s.nextInt();
    int arr[]= new int[a];
    for(int i=0; i<arr.length; i++){
        arr[i]=s.nextInt();
    }
    odde(arr, 9);
    System.out.println();


   }
    
}
