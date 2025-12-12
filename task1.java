import java.util.Scanner;
public class task1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the name:");
        String name = sc.nextLine();
        int age;
        while(true){
            System.out.println("Enter the age:");
            String input = sc.nextLine();
            try{
                age = Integer.parseInt(input);
                if(age<0){
                    System.out.println("Age cannot be negative,Try again");
                }
                else{
                    break;
                }
            }
            catch(NumberFormatException e){
                System.out.println("Invalid number! Please enter a valid age.");
            }
        }
        System.out.println("Enter the profession:");
        String profession = sc.nextLine();
        System.out.println("\n---USER INFORMATION---");
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Profession:"+profession);
        if(age >= 13 && age <= 19){
            System.out.println("You are a teenager");
        }
        else if(age >= 20 && age <= 30){
            System.out.println("You're a young adult");
        }
        else if(age > 30 && age <= 60){
            System.out.println("You're an experienced adult");
        }
        else if(age > 60){
            System.out.println("You're a senior citizen");
        }
        else{
            System.out.println("Your are a child");
        }
        sc.close();
    }
}
