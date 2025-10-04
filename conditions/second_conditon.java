package conditions;

import java.util.Scanner;

public class second_conditon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter your name");
        String name =input.next();
     

        System.out.println("enter your age");
        int age = input.nextInt();
         System.out.println("welcome : "+name);
        System.out.println("your age is : "+age);

           // voting app dynami
           if (age>=18) {
            System.out.println("you can vote");
            
           }else {
            System.out.println("you cannot vote");
            System.out.println("you age is: " +age);
           }



           // voting app dynamic with nested conditional
           System.out.println("enter your age");
           int newage = input.nextInt();
              // voting app dynami
              if (age>=18) {
                System.out.println("Do You Have an id : (yes/no)");
                String has_id = input.next();
                if (has_id == "yes") {
                     System.out.println("you can vote");
                }else{
                    System.out.println("you cannot vote");
                }
               
                
            }else{
                System.out.println("you cannot vote too younger");
              }

    
    }

}
