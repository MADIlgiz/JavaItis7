package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int TVcount = 0;
        TV tv = new TV();
        while (true) {
            System.out.println("1.������� �����");
            int command0 = -10;
            command0 = scanner.nextInt();
            switch (command0) {

                case 1: {
                    System.out.println("������� �������� ������");

                    tv.channels[TVcount].name = scanner.next();
                    Channel channel = new Channel(tv.channels[TVcount].name);
                    for (int i = 0; i < 3; i++) {


                        System.out.println("������� ����� ����� ����� ��������� � �������� ���������");
                        String startTime = scanner.next();
                        String finishTime = scanner.next();
                        String nameOfProgram = scanner.next();
                        Program program = new Program(nameOfProgram, startTime, finishTime);
                        tv.channels[TVcount].addProgram(program);
                    }


                    TVcount++;
                }
                break;
                case 0: {

                    while (true) {

                        System.out.println("1. �������� ��������� ������� ������");
                        System.out.println("-2. ��������� TV");
                        System.out.println("7. K ����������� ������");
                        System.out.println("8. � ���������� ������");
                        System.out.println("������� ����� ������");

                        int command = -1;
                        command = scanner.nextInt();
                        if (command == -2) {
                            System.exit(0);
                        }
                        System.out.println(tv.channels[command].name);
                        tv.showProgramnow(command);

                        int command2 = -3;
                        command2 = scanner.nextInt();

                        switch (command2) {
                            case 1: {
                                tv.channels[command].showallPrograms();
                            }
                            break;
                            case 7: {

                                System.out.println(tv.channels[command - 1].name);
                                tv.showProgramnow(command - 1);
                                int command4 = -4;
                                command4 = scanner.nextInt();
                                switch (command4) {
                                    case 1: {
                                        tv.channels[command - 1].showallPrograms();
                                    }
                                    break;

                                    case -2: {
                                        System.exit(0);

                                    }
                                    break;
                                }
                            }
                            break;
                            case 8: {
                                System.out.println(tv.channels[command + 1].name);
                                tv.showProgramnow(command + 1);
                                int command5 = -5;
                                command5 = scanner.nextInt();
                                switch (command5) {
                                    case 1: {
                                        tv.channels[command + 1].showallPrograms();
                                    }
                                    break;
                                    case -2: {
                                        System.exit(0);

                                    }
                                    break;
                                }
                            }
                            break;
                        }


                    }
                }
            }
        }
    }
}