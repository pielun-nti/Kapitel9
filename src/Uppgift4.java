import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uppgift4 {


    public static void main(String[] args) {

        System.out.println("Skriv ett antal heltal. Avsluta med CTRL-Z");
        int n, max;
        Scanner s = new Scanner(System.in);
        System.out.print("Hur många tal vill du skriva in:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Skriv in talen:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        max = a[0];
       /* if (s.nextLine() == null) {
            for(int i = 0; i < n; i++)
            {
                if(max < a[i])
                {
                    max = a[i];
                }
            }
            System.out.println("Största talet i arrayen:"+max);
        }*/
        for(int i = 0; i < n; i++)
        {
            if(max < a[i])
            {
                max = a[i];
            }
        }
        System.out.println("Största talet i arrayen:"+max);
    }
        }

