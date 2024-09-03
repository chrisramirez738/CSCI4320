package edu.clayton.csit.antlab.person;
import java.util.Random;
public class Person2 {
    /** Holds the person's real name */
    private String name;

    /**
     * The constructor, takes in the person's
     * name
     * @param pname the person's real name
     */
    public Person2(String pname) {
        name = pname;
    }

    /**
     * This method should take the string
     * input and return its characters in
     * random order.
     * Given "gtg123b" it should return
     * something like "g3tb1g2".
     *
     * @param input the string to be modified
     * @return the modified string
     */
    private String calc(String input) {
        char[] characters = input.toCharArray();
        Random rand = new Random();

        for (int i = 0; i < characters.length; i++) {
            int randomIndex = rand.nextInt(characters.length);
            // Swap characters
            char temp = characters[i];
            characters[i] = characters[randomIndex];
            characters[randomIndex] = temp;
        }

        return new String(characters);
    }

    /**
     * Return a string representation of this object
     * that varies with an input string
     *
     * @param input the varying string
     * @return the string representing the 
     *         object
     */
    public String toString(String input) {
        return name + calc(input);
    }
}
