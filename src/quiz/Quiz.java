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
    
    public String reverseString(String word){
        //BASE CASE
        //repeat until the word length is less than or equal to 1
        if (word.length() <= 1) {
        return word;
    }
    //recursively return the word get rid of the first letter and add it to the end
    return reverseString(word.substring(1)) + word.charAt(0);
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
