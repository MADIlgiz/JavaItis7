
package com.company;
import java.util.Rectangle;


public class Main {
    public static void main(String[] args) {
        Rectangle q = new Rectangle( 'q',45,2);
        Rectangle r = new Rectangle('r',4,3);
        Rectangle o = new Rectangle ('o',0,2);
        Rectangle y = new Rectangle ('y',8, 5);
        Rectangle k = new Rectangle ('k',3,6);
        Rectangle rectangles[] = {q,r,o,y,ioi};
        for (int i = 0; i<=4;i++) {
            System.out.println(rectangles[i].area()+" "+ rectangles[i]+" "+rectangles[i].nameofrectangle);
        }


        for (int i = 0; i<=4;i++) {
            Rectangle MIN = rectangles[i];

           int Min = MIN.area();
           int indexofMin = i;
            for (int j = i;j<5;j++) {
               if (Min >= rectangles[j].area()){
                    MIN = rectangles[j];
                    Min = rectangles[j].area();
                    indexofMin = j;
               }

           }
            Rectangle temp = rectangles[i];
            //temp = rectangles[i];
            rectangles[i] = MIN;
            rectangles[indexofMin] = temp;

       }
       System.out.println("после сортировки");
       for (int i = 0;i<=4;i++) {
           System.out.println(rectangles[i].area()+" "+ rectangles[i]+" "+rectangles[i].nameofrectangle);
       }




    }
}
