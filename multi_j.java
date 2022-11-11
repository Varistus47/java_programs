import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a number:");
        int num=scan.nextInt();
        System.out.print("Enter count:");
        int count=scan.nextInt();
        for(int i=1;i<=count;i++){
            System.out.println(i+"x"+num+"="+(i*num));
        }
    }
}

