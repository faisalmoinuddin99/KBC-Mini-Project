package KBC;

import javax.swing.*;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String Question1 = "Largest planet ";
        String choice1 = "earth";
        String choice2 = "saturn";
        String choice3 = "jupiter";

        String correctAns = choice3;

        boolean gameContinue = true;

        Scanner sc = new Scanner(System.in);


                System.out.print(Question1);
                System.out.println("Your options are as follows: \n");
                System.out.println("A."+""+ choice1 + " B." +""+ choice2 + " C." + "" + choice3 );
                String ansInput = sc.next();
                if(correctAns.equals(ansInput.toLowerCase())){
                    System.out.println("Congratulation You win");
                }else{
                    System.out.print("Wrong");
            }
    }
}
