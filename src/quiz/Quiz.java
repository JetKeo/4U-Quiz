/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz;

/**
 *
 * @author jetkeo
 */
public class Quiz {

    public String reverseString(String word) {
        //BASE CASE
        //repeat until the word length is equal to 0
        if (word.length() == 0) {
            return word;
        } else {
            //recursively return the word, get rid of the front letter 
            //add the letter in front to the end
            return reverseString(word.substring(1)) + word.charAt(0);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Quiz test = new Quiz();
        System.out.println("class");
        System.out.println(test.reverseString("class"));

    }

}
