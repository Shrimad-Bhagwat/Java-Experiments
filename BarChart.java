import java.util.Scanner;
/*
*@ Shrimad Bhagwat 20BCG10003
*
*
**/
public class BarChart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter five numbers : ");
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("\n   |");
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]<10 && nums[i]>0){
                System.out.print(nums[i]+"  |");
            }
            else{
                System.out.print(nums[i]+" |");
            }
            for (int j = 0; j < nums[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("   |______________________________\n");
        sc.close();
    }
}
