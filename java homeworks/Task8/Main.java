package com.company;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TV tv = new TV();
        Program letspeak = new Program("����� �������", "18:00", "20:00");
        Channel first = new Channel("������");
        first.addProgram(letspeak);
        Program Time = new Program("�����", "21:00", "22:00");
        first.addProgram(Time);
        Program GoodMorning = new Program("������ ����", "11:00", "12:00");
        first.addProgram(GoodMorning);
        first.showallPrograms();
        tv.addChannel(first);
        tv.showProgramnow(0);
        Channel russia = new Channel("������");
        Program news = new Program("��������", "11:00", "13:00");
        Program sport = new Program("�����", "16:00", "17:00");
        russia.addProgram(news);
        russia.addProgram(sport);
        russia.showallPrograms();
        tv.addChannel(russia);
        tv.showProgramnow(1);

        for (int i = tv.count;i < tv.channels.length;i++) {
            int ex = 0;
            System.out.println("������� 0. ����� ������ �� ���������, ���� ������ �������� ������� ����� �����");
            ex = scanner.nextInt();
            if (ex == 0) {
                break;
            } else {
                System.out.println("������� �������� ������:");
                String name = scanner.next();
                Channel channel = new Channel(name);
                tv.addChannel(channel);
                for (int j = 0; j < tv.channels[i].programs.length; j++) {
                    System.out.println("������� 0. ����� ������ �� ���������, ���� ������ �������� ������� ����� �����");
                    int out = 0;
                    out = scanner.nextInt();
                    if (out == 0) {
                        break;

                    } else {
                        System.out.println("������� �������� ��������");
                        String Programname = scanner.next();
                        System.out.println("������� ����� ������:");
                        String Starttime = scanner.next();
                        System.out.println("������� ����� �����:");
                        String Finishtime = scanner.next();
                        Program program = new Program(Programname, Starttime, Finishtime);
                        tv.channels[j].addProgram(program);

                    }
                }
            }

        }
        while (true) {
            System.out.println("0. ����������");
            System.out.println("1. ����� ������ �����");
            int command = 0;
            command = scanner.nextInt();
            switch (command) {
                case 0: {
                    System.exit(0);
                }
                break;
                case 1: {
                    int PULT = 0;
                    PULT = scanner.nextInt();
                    System.out.println("");
                    if (PULT > tv.channels.length) {
                        System.out.println("��� ������ ������");
                    } else {
                        System.out.println(tv.channels[PULT].name);
                        tv.showProgramnow(PULT);
                        System.out.println("1. ����������� ��������� �������");
                        System.out.println("2. �����");
                        int command2 = 0;
                        command2 = scanner.nextInt();
                        switch (command2) {
                            case 1: {
                                tv.channels[PULT].showallPrograms();
                            }
                            break;
                            case 2: {
                                break;
                            }
                        }
                    }
                }break;
            }
        }
    }
}