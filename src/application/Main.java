package application;

import java.util.Scanner;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Main {

    public static void secretaryMode(){
        System.out.println("-- Você está acessando como SECRETÁRIA ---");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner();
        char menuOption;

        System.out.println("\n-- Bem vindo Ao MrMeeting v1.0-Beta CLI-Version ---");
        System.out.println("Você deseja acessar o sistema como [P]ROFESSOR ou [S]ECRETÁRIA?");
        menuOption = in.nextLine().charAt(0);
        if(menuOption == 'P')
    }


}