import java .util.*;
public class Min_Sub{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("Enter the elements in an array: ");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a));
        System.out.print("Enter the size of an window: ");
        int k=sc.nextInt();
        int minsum=0,sum=0;
        //First array
        for(int i=0;i<k;i++){
            minsum+=a[i];
        }
        sum=minsum;
        for(int i=k;i<n;i++){
            minsum=minsum+a[i]-a[i-k];
            if(sum>minsum){
                sum=minsum;
            }
        }
        System.out.println("Minimum Sum of the Array: "+sum);
    }
}