import java .util.*;
public class Main{
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
        int maxsum=0,sum=0;
        //First array
        for(int i=0;i<k;i++){
            maxsum+=a[i];
            if(sum<maxsum){
                sum=maxsum;
            }
        }
        for(int i=k;i<n;i++){
            maxsum=maxsum+a[i]-a[i-k];
            if(sum<maxsum){
                sum=maxsum;
            }
        }
        System.out.println("Maximum Sum of the Array: "+sum);
    }
}