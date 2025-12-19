import java.util.Scanner;
public class fun_overloading {
    //square
    static int area(int side){
        return side*side;
    }
    //rectangle
    static int area(int l,int b){
        return l*b;
    }
    //rhombus
    static int area(float p,float q){
        int ret;
        ret = (int) (p*q)/2;
        return ret;
    }
    public static void main(String[] args) {
        int ans;
        Scanner sc = new Scanner(System.in);
        System.out.println("choose a shape\n Square : 1,Rectangle : 2,Rhombus : 3");
        int ch = sc.nextInt();
        if(ch==1){
            System.out.println("enter the side of the square");
            int side = sc.nextInt();
            ans = area(side);
            System.out.println("the area of square is: "+ans);
        }
        else if(ch==2){
            System.out.println("enter the side of the rectangle :");
            int l = sc.nextInt();
            int b = sc.nextInt();
            ans = area(l,b);
            System.out.println("the area ofthe rectangle is :"+ans);
        }
        else{
            System.out.println("enter the sid eof the rhombus :");
            float l1 = sc.nextFloat();
            float l2 = sc.nextFloat();
            ans = area(l1,l2);
            System.out.println("the area of the rhombus is: " + ans);
        }
        
    }
}
