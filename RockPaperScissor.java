package com.shaun;
import java.util.*;
import java.lang.*;

public class RockPaperScissor {
    public static void main(String[] args) {
        char exitchoice='Y';
        Scanner sc = new Scanner(System.in);
        Random rn = new Random();
        String[] choices = new String[]{"","Rock", "Paper", "Scissors"};
        // Rock = 1, Paper = 2, Scissor = 3
            System.out.print("\t\tRock Paper Scissors Game!\n\n\nEnter your name: ");
            String p1_name = sc.nextLine();
        do{
            System.out.print("Hello "+p1_name+"!\n\nChoose - \n[1] Rock\n[2] Paper\n[3] Scissors\n\nEnSter your choice:");
            int choice = sc.nextInt();
            int cpuchoice = rn.nextInt(3)+1;
            if(choice==cpuchoice){
                System.out.println("\n\n"+p1_name+" chose-"+choices[choice]+"\nCPU chose-"+choices[cpuchoice]+"\n\nTIE!");
            }
            else if(choice==3 && cpuchoice==2 || choice==2 && cpuchoice==1 || choice==1 && cpuchoice==3){
                System.out.println("\n\n"+p1_name+" chose-"+choices[choice]+"\nCPU chose-"+choices[cpuchoice]+"\n\nYou Win!");
            }
            else{
                System.out.println("\n\n"+p1_name+" chose-"+choices[choice]+"\nCPU chose-"+choices[cpuchoice]+"\n\nCPU Wins!");
            }
            System.out.print("\n\nDo you want to play again? [Y/N]\n:");
            exitchoice = sc.next().charAt(0);
        }while(exitchoice=='y'||exitchoice=='Y');







    }
}
