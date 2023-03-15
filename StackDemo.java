// Stack Program

import java.io.*;
import java.lang.*;
import java.util.*;

class StackDemo
{
    public static void main(String args[])
    {
        Stack<String> st = new Stack<String>();
        Scanner sc = new Scanner(System.in);
        int ch = 0;

        while(ch != 5)
        {
            System.out.println("\n1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit");
            ch = sc.nextInt();

            switch(ch)
            {
                case 1:
                    String value = sc.next();
                    st.push(value);
                    break;
                
                case 2:
                    String popresult = st.pop();
                    System.out.println("\nPopped Data :"+popresult);
                    break;
                
                case 3:
                    String peekresult = st.peek();
                    System.out.println("\nPeeked Data :"+peekresult);
                    break;
                
                case 4:
                    System.out.println("Elements in Stack :");
                    for(String name : st)
                    {
                        System.out.println(name+" ");
                    }
                    System.out.print("\n");
                    break;
                
                case 5:
                    System.out.println("Thank You");
                    break;
                
                case 6:
                    System.out.println("Sory Wrong Choice");
            }
        }
    }
}

/* 
First Trail

Output :-

D:\Programming\Hadoop>javac StackDemo.java

D:\Programming\Hadoop>java StackDemo      

1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit
1
Apple

1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit
1
Mango

1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit
1
Orange

1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit
4
Elements in Stack :
Apple
Mango
Orange


1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit
2

Popped Data :Orange

1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit
4
Elements in Stack :
Apple
Mango


1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit
3

Peeked Data :Mango

1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit
4
Elements in Stack :
Apple
Mango


1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit
5
Thank You

*/

/*
Second Trail

Output :-

D:\Programming\Hadoop>java StackDemo

1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit
1
Apple

1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit
1
Mango

1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit
6
Sory Wrong Choice

1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit
4
Elements in Stack :
Apple
Mango


1-Push, 2-Pop, 3-Peek, 4-Print Stack, 5-Exit
5
Thank You

 */