import java .util.*;
public class Average{
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
        int sum=0,maxAvg=0;
        for(int i=0;i<k;i++){
            sum+=a[i];
        }
        int avg=sum/k;
        if(maxAvg<avg){
            maxAvg=avg;
        }
        for(int i=k;i<n;i++){
            sum=sum+a[i]-a[i-k];
            avg=sum/k;
            if(maxAvg<avg){
                maxAvg=avg;
            }
        }
        System.out.println("Maximum avg of the Array: "+maxAvg);
    }
}