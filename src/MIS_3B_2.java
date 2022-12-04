import java.util.Scanner;
public class MIS_3B_2 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int x,y;
        System.out.println("輸入x和y:");
        x=input.nextInt();
        y=input.nextInt();
        System.out.printf("x的y次方為%d\n",power(x,y));
    }
    public static int power(int x,int y){
        int result=1;
        for(int i=0;i<y;i++){
            result*=x;
        }
        return result;
    }
    //另一種寫法
   /* public static int power(int x,int y){
        return (int)Math.pow(x,y);  // Math.pow(x,y)中的x和y為浮點數，所以在return時要轉換為整數型態
    }*/
}