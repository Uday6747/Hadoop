// Implementing Set data strucutre using HashSet

import java.io.*;
import java.lang.*;
import java.util.*;

class HashSetTest
{
    public static void main(String args[])
    {
        HashSet<Integer> obj = new HashSet<Integer>();
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
                    int right_value = sc.nextInt();
                    obj.remove(right_value);
                    break;
                
                case 3:
                    System.out.println("Element in the Set : "+obj);
                    break;

                case 4:
                    System.out.println("Thank You");
                    break;
                
                default:
                    System.out.println("Sorry Wrong choice");
            }
        }
    }
}


/*

Output :- 

(base) lab-5@lab5-OptiPlex-3000:~/Hadoop$ javac HashSetTest.java
(base) lab-5@lab5-OptiPlex-3000:~/Hadoop$ java HashSetTest

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
100

1-Insert, 2-Delete, 3-Print, 4-Exit
3
Element in the Set : [100, 200, 300]

1-Insert, 2-Delete, 3-Print, 4-Exit
2
200

1-Insert, 2-Delete, 3-Print, 4-Exit
3
Element in the Set : [100, 300]

1-Insert, 2-Delete, 3-Print, 4-Exit
4
Thank You

 */