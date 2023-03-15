// Implementing Queue using Linked List

import java.io.*;
import java.lang.*;
import java.util.*;

class QueueDemo
{
    public static void main(String args[])
    {
        Queue<Integer> q = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int ch = 0;

        while(ch != 4)
        {
            System.out.println("\n1-Insert, 2-Delete, 3-Print, 4-Exit");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    int value = sc.nextInt();
                    q.add(value);
                    break;
                
                case 2:
                    int deletedElement = q.remove();
                    System.out.println("Deleted Element : "+deletedElement);
                    break;
                
                case 3:
                    System.out.println("Element in Queue : "+q);
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;
                
                default:
                    System.out.println("Sorry Wrong Choice");
            }
        }
    }
}


/*
Output :-

D:\Programming\Hadoop>javac QueueDemo.java

D:\Programming\Hadoop>java QueueDemo

1-Insert, 2-Delete, 3-Print, 4-Exit
1
100

1-Insert, 2-Delete, 3-Print, 4-Exit
1
200

1-Insert, 2-Delete, 3-Print, 4-Exit
1
300

1-Insert, 2-Delete, 3-Print, 4-Exit
1
400

1-Insert, 2-Delete, 3-Print, 4-Exit
1
500

1-Insert, 2-Delete, 3-Print, 4-Exit
3
Element in Queue : [100, 200, 300, 400, 500]

1-Insert, 2-Delete, 3-Print, 4-Exit
2
Deleted Element : 100

1-Insert, 2-Delete, 3-Print, 4-Exit
3
Element in Queue : [200, 300, 400, 500]

1-Insert, 2-Delete, 3-Print, 4-Exit
8
Sorry Wrong Choice

1-Insert, 2-Delete, 3-Print, 4-Exit
4
Thank You

D:\Programming\Hadoop>

 */