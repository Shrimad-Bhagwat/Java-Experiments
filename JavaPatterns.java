import java.util.*;
/*
*@ Shrimad Bhagwat 20BCG10003
*
*
**/
public class JavaPatterns{
    public static void box(int n) {
        System.out.println("\nPrinting Solid Square\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("\nPrinting Hollow Square\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i==1 || i==n || j==1 || j==n) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void oval() {
        System.out.println();
        
    }
    public static void arrow(int n) {
        System.out.println("Printing Arrow");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < n-i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void diamond(int n) {
        System.out.println("\nPrinting Diamond\n");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*i-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2*(n-i)-1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Display\n1.Box\n2.Oval\n3.Arrow\n4.Diamond");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                box(6);
                break;
            case 2:
                // oval();
                break;
            case 3:
                arrow(6);
                break;
            case 4:
                diamond(6);
                break;
        
            default:
                break;
        }
        sc.close();
    }
}