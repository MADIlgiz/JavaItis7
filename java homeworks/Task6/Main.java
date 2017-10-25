package com.company;
import java.util.Scanner;

public class Main {
    static void showall(ArrayList list) {
        for (int i = 0; i < list.count; i++) {
            System.out.print(list.elements[i] + " ");
        }
    }

    static void addElement(ArrayList list, int element) {
        if (list.count < list.elements.length) {
            // положил элемент в первую пустую
            list.elements[list.count] = element;
            list.count++;
        } else {
            System.err.println("Нет места");
        }
    }

    static void deleteElement(ArrayList list, int index) {
        if (index < list.count) {
            for (int i = index; i < list.count; i++) {
                list.elements[i] = list.elements[i + 1];
            }
            list.count--;
        } else {
            System.err.println("Неверный индекс");
        }
    }

    static void printElements(ArrayList list) {
        for (int i = 0; i < list.count; i++) {
            System.out.print(list.elements[i] + " ");
        }
    }

    public static void main(String[] args) {
        // создали массив массивов (списков)
        Scanner scanner = new Scanner(System.in);
        ArrayList lists[] = new ArrayList[10];
        for (int i = 0; i < lists.length; i++) {
            lists[i] = new ArrayList();
        }
        while (true) {
            System.out.println("1. Добавить элемент в список");
            System.out.println("2. Удалить элемент из списка");
            System.out.println("3. Показать список");
            System.out.println("4. Показать все списки");
            System.out.println("5. Выход");
            int command = 0;
            command = scanner.nextInt();
            switch (command) {
                case 5: {
                    System.exit(0);
                }
                break;
                case 1: {
                    int list = scanner.nextInt();
                    int element = scanner.nextInt();
                    addElement(lists[list], element);


                }
                break;
                case 2: {
                    int list = scanner.nextInt();
                    int index = scanner.nextInt();
                    deleteElement(lists[list], index);

                }
                break;
                case 3: {
                    int list = scanner.nextInt();
                    printElements(lists[list]);
                    System.out.println();
                }
                break;
                case 4: {
                 for (int list = 0; list < lists.length;list++){
                    showall(lists[list]);
                     System.out.println();
                  }

                }
                break;
            }

        }

    }
}



