import java.lang.*;
import java.util.Scanner;

public class Newtons_Difference_Table
{
    public static void main(String args[]) {

        float x[] = new float[10];
        float y[] = new float[10];
        float p[] = new float[10];

        int k, f, n, i, j = 1, f1 = 1, f2 = 0;
        Scanner sc = new Scanner(System.in);
        /* Input Section */
        System.out.println("Enter number of data: ");
        n = sc.nextInt();

        System.out.print("\nEnter the different values of x:\n");
        for (i=1;i<=n;i++)
        {
            x[i]=sc.nextFloat();
        }

        System.out.print("\nThe corresponding values of y are:\n");
        for (i=1;i<=n;i++)

            y[i] = sc.nextFloat();
        int num ;
        num= (int)y[1];
        f=num;
        System.out.print("\nEnter the value of 'k' in f(k) you want to evaluate:\n");
        k= sc.nextInt();

        do
        {
            for (i=1;i<=n-1;i++)
            {
                p[i] = ((y[i+1]-y[i])/(x[i+j]-x[i]));
                y[i]=p[i];
            }
            f1=1;
            for(i=1;i<=j;i++)
            {
                f1*=(k-x[i]);
            }
            f2+=(y[1]*f1);
            n--;
            j++;
        }

        while(n!=1);
        f+=f2;
        System.out.print("\nf("+ k+") = " + f);
    }
}
