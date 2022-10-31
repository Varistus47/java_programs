import java.util.Scanner;
class Pyramid{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter a number:");
        int n=scan.nextInt();
        for(int i=0;i<n;i++){
            for(int row=0;row<n-i-1;row++){
                System.out.print(" ");
            }
            for(int col=0;col<i+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
