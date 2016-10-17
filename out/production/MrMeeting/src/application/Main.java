package application;

import java.util.Scanner;

/**
 * Created by Allex Lima & Paulo Moraes.
 */

public class Main {

    private static void professorMode(){
        int professorIndex;
        int meetingIndex;
        Professor professor;
        Scanner in = new Scanner(System.in);
        char menuOption;

        System.out.println("\n-- Você está acessando como PROFESSOR ---\n");

        System.out.println("Você já possui ID? ([s]im ou [n]ão)");
        menuOption = in.nextLine().charAt(0);
        System.out.println("");

        if (menuOption == 's') {
            System.out.println("Selecione seu ID");

            professor = Assistent.professorChoose();

            System.out.println("O que deseja fazer, professor: [d]efinir novo horário para atendimento ou [v]er seus atendimentos?");
            menuOption = in.nextLine().charAt(0);

            if (menuOption == 'd'){
                int hi, hf;

                System.out.println("Hora de início: ");
                hi = in.nextInt();
                System.out.println("Hora do encerramento: ");
                hf = in.nextInt();

                Schedules schedules = new Schedules();
                schedules.setSart(hi, 0);
                schedules.setEnd(hf, 0);

                professor.setSchedules(schedules);
            }else if (menuOption == 'v'){

                for (int i = 0; i < Core.meetings.size(); i++){
                    Meeting item = Core.meetings.get(i);
                    if (item.getProfessor() == professor){
                        System.out.println("\n-- Agendamento #" + i);
                        System.out.println("\tAluno: " + item.getStudent().getSname() + " - " + item.getStudent().getSregistration());
                        System.out.println("\tTurma: " + item.getStudent().getSclass());
                        System.out.println("\tAssunto: " + item.getSubject());
                        System.out.println("\tDetalhes: " + item.getDetails());
                        System.out.println("");
                    }
                }

            }else {
                System.out.println("Opção inválida!");
            }

        } else if (menuOption == 'n'){
            System.out.println("Qual o seu nome? ");
            professor = new Professor();
            professor.setPsname(in.nextLine());
            Core.setProfessors(professor);
            System.out.println("Cadastro realizado com sucesso!");
        } else {
            System.out.println("Opção inválida!");
        }
    }

    private static void secretaryMode(){
        System.out.println("\n-- Você está acessando como SECRETÁRIA ---\n");

        Assistent assistent = new Assistent();
        assistent.scheduling();
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char menuOption;

        System.out.println("\n-- Bem vindo Ao MrMeeting v1.0-Beta CLI-Version ---\n");

        do {
            System.out.println("Você deseja acessar o sistema como [p]rofessor ou [s]ecretária ? ([f]echar)");
            menuOption = in.nextLine().charAt(0);
            switch (menuOption) {
                case 'p':
                    Main.professorMode();
                    break;
                case 's':
                    Main.secretaryMode();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }while (menuOption != 'f');
    }


}