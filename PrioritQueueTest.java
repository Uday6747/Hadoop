// Implementing Queueu using Priority Queue

import java.io.*;
import java.lang.*;
import java.util.*;

class PrioritQueueTest
{
    public static void main(String args[])
    {
        PriorityQueue<Integer> obj = new PriorityQueue<Integer>();
        Scanner sc = new Scanner(System.in);

        int flag = 0;

        while(flag != 4)
        {
            System.out.println("\n1-Insert, 2-Delete, 3-Print, 4-Exit");
            flag = sc.nextInt();

            switch(flag)
            {
                case 1:
                    int value = sc.nextInt();
                    obj.add(value);
                    break;
                
                case 2:
                    int elementDeleted = obj.remove();
                    System.out.println("Deleted Element : "+elementDeleted);
                    break;
                
                case 3:
                    System.out.println("Elements in Queue : "+obj);
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

(base) lab-5@lab5-OptiPlex-3000:~/Hadoop$ javac PrioritQueueTest.java
(base) lab-5@lab5-OptiPlex-3000:~/Hadoop$ java PrioritQueueTest

1-Insert, 2-Delete, 3-Print, 4-Exit
1
101

1-Insert, 2-Delete, 3-Print, 4-Exit
1
202

1-Insert, 2-Delete, 3-Print, 4-Exit
1
303

1-Insert, 2-Delete, 3-Print, 4-Exit
1
404

1-Insert, 2-Delete, 3-Print, 4-Exit
1
505

1-Insert, 2-Delete, 3-Print, 4-Exit
3
Elements in Queue : [101, 202, 303, 404, 505]

1-Insert, 2-Delete, 3-Print, 4-Exit
2
Deleted Element : 101

1-Insert, 2-Delete, 3-Print, 4-Exit
3
Elements in Queue : [202, 404, 303, 505]

1-Insert, 2-Delete, 3-Print, 4-Exit
9
Sorry Wrong Choice

1-Insert, 2-Delete, 3-Print, 4-Exit
4
Thank You

 */