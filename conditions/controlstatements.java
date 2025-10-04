package conditions;

public class controlstatements {
    public static void main(String[] args) {
        // if condition  
        int num=10;
        if(num>0){
            System.out.println("number is positive: "+num);
        }

        int num1=-10;
        if(num1>0){
            System.out.println("number is positive: "+num1);
        }
        
        
        int num2=-10;
        if(num2 < 0){
            System.out.println("number is nagitive : "+num2);
        }
         // check if given number is in range of 10 to 20

         
         int numb=20;
         if(numb>=10 && numb<=20)
         {
            System.out.println( "the number is in range ");
         }

          // if-else condition

          int numa=10;
          if (numa > 0) {
            System.out.println("number is positive ");
            
          }else{
            System.out.println("number is negstive");
          }

          // voting app

          int age=20;
          if (age>=18) {
            System.out.println("you can vote");
          }else{
             System.out.println("you can't vote");

       }

           // ternary operator
        // variable = (condition) ? value_if_true:value_if_false

        int a=10;
        int b = 20; // (condition) ? value_if_true:value_if_false
        int max=(a>b)? a:b; 
        System.out.println(max);

        String result=(age>=18)? "you can vote":"you cannot vot";
        System.out.println(result); 
    
    // else if ladder (grade )
     int marks=69;
     if(marks>=90){
        System.out.println("A");
     }else if(marks>=75){
        System.err.println("B");
     }else if(marks>=65){
        System.out.println("C");
     }else if(marks>=50){
        System.err.println("D");
     }else if(marks>=35){
        System.out.println("E");
     }else{
        System.out.println("FAIL");
     }

      // switch case
      int daynumber=5;
      switch (daynumber) {
        case 1:
        System.out.println("Monday");  
            break;
        case 2:
        System.out.println("Tuesday");  
            break;
        case 3:
        System.out.println("Wednesday");
            break;
         case 4:
        System.out.println("thursday"); 
            break;
         case 5:
        System.out.println("friday");
            break;
         case 6:
        System.out.println("saturday");
            break;
         case 7:
        System.out.println("Sunday");  
            break;
      
        default:
        System.out.println("Invalid day");
            break;

      }


       // switch case with fall through
        int day = 4;
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break; 
            default:
                System.out.println("Invalid Day");
                break;
        }



    }
}

      