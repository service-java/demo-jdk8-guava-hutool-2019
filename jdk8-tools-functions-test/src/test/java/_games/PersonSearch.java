package _games;

import java.util.Scanner;

/**
 * This program uses the startsWith method to search using
 * a partial string.
 */

public class PersonSearch {
    private static Scanner keyboard;

    public static void main(String[] args) {
        String firstName;  // To hold a lookup string

        // Create an array of names.
        String[] people = {"姚明", "姚鼐", "刘文浩",
                "胡斌", "姚争为", "袁庆署",
                "虞歌", "王金荣", "姚远"};

        keyboard = new Scanner(System.in);

        // Get a partial name to search for.
        System.out.print("Enter the last name to look up: ");
        firstName = keyboard.nextLine();

        // Display all of the names that begin with the
        // string entered by the user.
        System.out.println("Here are the names that match:");
        for (String name : people) {
            if (name.startsWith(firstName)) {
                System.out.println(name);
            }
        }

    }
}
