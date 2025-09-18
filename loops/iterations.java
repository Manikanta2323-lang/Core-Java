package loops;

import java.util.Scanner;

public class iterations {
    public static void main(String[] args) {

        // for loop
        for(int count=1; count<=5;count++){
            System.out.println(count);
        }

         for(int count=1; count<=5;count++){
            System.out.println("good morning");

        }

         for(int count=5; count>=1;count--){
            System.out.println(count);
        }


        // while loops

        int count=1;
        while (count<=5) {
            System.out.println(count);
            count ++;
            
        }

                // check for phone passcode 
                int correctpin=2233;
                int enteredpin = 0;
                Scanner input = new Scanner(System.in);
                while (enteredpin!=correctpin) {
                    System.out.println("enter pin number");
                    enteredpin =input.nextInt();
                }
                System.out.println("phone unlock");


                // do while 
                         int ct = 4;
                            do {
                                System.out.println(ct); 
                                ct++;
                            }
                            while (ct<=5);


                //nested loops

                for(int outer=1;outer<=5;outer++){
                    for(int inner=1;inner<=5;inner++){
                        System.out.println(outer+"x"+inner+"=" +(outer*inner));
                    }
                }


                int outer1 =3;
                while (outer1<=5) {
                    int inner1=1;
                    while (inner1<=5) {
                        System.out.println(outer1+"x"+inner1+"="+(outer1*inner1));
                        inner1++;
                    }
                    outer1++;
                }


                // break : used to terminate loop
                for(int i=1;i<=4;i++){
                    if (i==3) {
                        break;
                    }
                      System.out.println(i); 
                }

                // continue : used to terminate loop
                for(int i=1;i<=4;i++){
                    if (i==3) {
                        continue;
                    }
                      System.out.println(i); 
                }

                System.out.println(addnum(200 , 300));

    }

    public static int addnum(int i, int j) {
        return i+j;
        
    }

}
