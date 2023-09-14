package day02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MyScan {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner myScanner = new Scanner("hello ziya \nhow are you");

//        System.out.println(myScanner.next());
//        System.out.println(myScanner.next());
//        System.out.println(myScanner.next());
//        System.out.println(myScanner.next());
//        System.out.println(myScanner.next());
//        System.out.println(myScanner.next());
//        System.out.println(myScanner.nextLine());
//        System.out.println(myScanner.nextLine());
//        System.out.println(myScanner.nextLine());
//        System.out.println(myScanner.hasNext());


//        System.out.print("enter your name: ");
//
//        Scanner myScanner1 = new Scanner(System.in);
////        System.out.println(myScanner1.next());
//        System.out.println(myScanner1.nextLine());

        File myFile = new File("src/someText.txt");

        Scanner myScanner2 = new Scanner(myFile);
        System.out.println(myScanner2.nextLine());
        System.out.println(myScanner2.nextLine());


    }
}
