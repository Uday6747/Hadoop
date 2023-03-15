// Linked List

import java.io.*;
import java.lang.*;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

class LinkedListTester
{
    public static void main(String args[])
    {
        LinkedList<String> brand = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        String value;
        while(ch != 5)
        {
            System.out.println("\n1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit");

            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    value = sc.next();
                    brand.addFirst(value);
                    break;
                
                case 2:
                    value = sc.next();
                    brand.addLast(value);
                    break;
                
                case 3:
                    System.out.print("Delete which element : ");
                    int val1 = sc.nextInt();
                    ListIterator<String> iterator = brand.listIterator();
                    for(int i = 0; i<val1 && iterator.hasNext(); i++)
                    {
                        iterator.next();
                    }
                    iterator.remove();
                    break;

                case 4:
                    for(String name : brand)
                        System.out.print(name+" ");
                    System.out.print("\n");
                    break;

                case 5:
                    System.out.println("Thank You");
                    break;
                
                default:
                    System.out.println("Sorry Wrong Choice");
                        

            }
        }
    }
}


/*
First Trail

Output :-

D:\Programming\Hadoop>javac LinkedListTester.java

D:\Programming\Hadoop>java LinkedListTester

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
1
MAC

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
1
DELL

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
2
Lenovo

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
1
HP

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
4
HP DELL MAC Lenovo

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
3
Delete which element : 4

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
5
Thank You

 */

 /*
Second Trail

Output :-

D:\Programming\Hadoop>java LinkedListTester       

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
1
MAC

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
7
Sorry Wrong Choice

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
4
MAC

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
5
Thank You
  */


/*
Third Trail

Oytput :-
z
D:\Programming\Hadoop>javac LinkedListTester.java

D:\Programming\Hadoop>java LinkedListTester

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
1
Apple

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
1
Banana

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
2
Grapes

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
1
Pineapple

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
4
Pineapple Banana Apple Grapes 

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
3
Delete which element : 4

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
4
Pineapple Banana Apple 

1-InsertFront, 2-InsertLast, 3-Delete, 4-Print, 5-Exit
5
Thank You
 */