package com.company;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        University uni = new University();
        Student student = new Student();
        Teacher teacher = new Teacher();
        while (true) {
            System.out.println("1. Add Student");
            System.out.println("2. Add Teacher");
            System.out.println("3. Show Teacher");
            System.out.println("4. Show Student");
            System.out.println("5 . Quit");
            Scanner getval = new Scanner(System.in);
            int num = getval.nextInt();
            switch (num) {
                case 1: {
                    uni.addstudent(student);
                }
                break;
                case 2: {
                    uni.addteacher(teacher);
                }
                break;
                case 3: {
                    uni.displayteacher();
                }
                break;
                case 4: {
                    uni.display();
                }

                break;
                case 5: {
                    break;
                }
                default:
                    System.out.println("Wrong Select..");

            }
        }
    }
}