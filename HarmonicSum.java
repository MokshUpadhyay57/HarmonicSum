// Print the sum of harmonic series of given value n.
// Author - Moksh Upadhyay
// Date - 04/03/2021

import java.util.Scanner;
public class HarmonicSum {
    public static void main(String[] args) {
        int n;
        double hs=0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();
        for(double i = 1;i<=n;i++)
            {
                hs = hs + (1/i);
            }
        System.out.print(hs);

    }
}
