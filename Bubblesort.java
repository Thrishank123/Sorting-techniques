import java.util.Scanner;
public class Bubblesort {
    public static void main(String[] args) {
        int n,temp;
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Size of the array");
        n=read.nextInt();
        int []a=new int[n];
        System.out.println("Enter elements in array :");
        for(int i=0;i<n;i++){
            a[i]=read.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(a[j]>a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array is :");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
}

