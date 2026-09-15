import java.util.*;
public class EvenCount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of an array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the element: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();

        }
        System.out.println(Arrays.toString(a));
        System.out.println("Enter the window size: ");
        int k=sc.nextInt();
        int count=0;
        for(int i=0;i<k;i++){
            if(a[i]%2==0){
                count++;
            }
        }
        System.out.println(count);
        for(int i=k;i<n;i++){
            if(a[i-k]%2==0){
                count--;
            }
            if(a[i]%2==0){
                count++;
            }
            System.out.println(count);
        }  
    }
}
