import java.util.Scanner;
public class Student{
    private String name;
    private int size;
    private int average;
    public Student(String name,int size){
        this.name=name;
        this.size=size;
    }
    public void CalAverage(){
        int sum=0;
        System.out.printf("輸入%d個成績:",size);
        Scanner input=new Scanner(System.in);
        for(int i=0;i<size;i++){
            sum+=input.nextInt();
        }
        average=sum/size;
    }
    public void PrintAverage(){
        System.out.println("Name: "+name+" Average: "+average);
    }
}