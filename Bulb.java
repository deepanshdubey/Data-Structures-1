import java.io.*;

public class Bulb {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        float j, i;
        int n, k;
        n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        for (k = 0; k < n; k++) {
            a[k] = 1;
        }
        for (i = 2; i <= n; i++) {
            for (j = 2; j <= n; j++) {
                k = (int) j - 1;
                if (j % i == 0) {
                    if (a[k] == 0) {
                        a[k] = 1;
                    } else if (a[k] != 0) {
                        a[k] = 0;
                    }
                }
            }
        }
        for (k = 0; k < n; k++) {
            if (a[k] == 1)
            System.out.println(k + 1);
        }
    }
}


// Find in an Array
import java.io.IOException;
import java.util.*;
class FindInArray
{
    public static void main(String args[])throws IOException
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=scn.nextInt();
        }
        System.out.println("Please enter the number to search");
        n=scn.nextInt();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==n)
            {
                System.out.println("Element found.");
                break;
            }  
        }
    }
}
