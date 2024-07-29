import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner b=new Scanner(System.in);
        String str=b.nextLine();
        int count=0;
        for(char i:str.toCharArray())
        {
            count++;
        }
        System.out.println("Quantum revelation! The quantum length of "+str+" is "+count+".");
    }
}
