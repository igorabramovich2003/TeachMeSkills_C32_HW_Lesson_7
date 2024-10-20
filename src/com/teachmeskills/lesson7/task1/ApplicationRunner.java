package com.teachmeskills.lesson7.task1;

import com.teachmeskills.lesson7.task1.post.impl.Accountant;
import com.teachmeskills.lesson7.task1.post.impl.Director;
import com.teachmeskills.lesson7.task1.post.impl.Worker;

import java.util.Scanner;

/**
 * 1. Create classes "Director", "Worker", "Accountant".
 * Implement an interface with a method that sets the behavior for displaying the job title on the screen.
 * Implement this method in the created classes.
 * Create a runner class with a main method to run the program.
 * Request the job code from the console and display the job title on the screen.
 */

public class ApplicationRunner {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the post number (1 - Director, 2 - Worker, 3 - Accountant):");
        int postNumber = sc.nextInt();

        switch (postNumber) {
            case 1:
                Director director = new Director();
                director.showPostName();
                break;
            case 2:
                Worker worker = new Worker();
                worker.showPostName();
                break;
            case 3:
                Accountant accountant = new Accountant();
                accountant.showPostName();
                break;
            default:
                System.out.println("Invalid post number");
        }
    }
}
