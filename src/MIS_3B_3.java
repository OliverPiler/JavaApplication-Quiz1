import java.util.Scanner;
public class MIS_3B_3 {
    public static void main(String[] args){
        int x,y,z;
        System.out.print("輸入x y z: ");
        Scanner input=new Scanner(System.in);
        x=input.nextInt();
        y=input.nextInt();
        z=input.nextInt();
        System.out.printf("最大值:%d\n",max(x,y,z));
    }
    public static int max(int x,int y,int z){
        int max=x;
        if(y>max){
            max=y;
        }
        if(z>max){
            max=z;
        }
        return max;
    }
}
