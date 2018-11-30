/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cesarcipherlab1;
import java.util.Scanner;
/**
 *
 * @author 196033BoldenA
 */

public class CesarCipherLab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int shift, i;
        String str, str1;
        
        System.out.println("Enter the string for encryption"); 
        str=sc.nextLine(); //Store the text typed by the user into the string variable named str
        System.out.println("Enter a number from 1 to 25 for shifting the text"); 
        shift=sc.nextInt(); //Store the number typed by the user into shift
        
        //Call the method named encrypt passing it the contents in variables str and shift 
        //The method will return the encrypted string and store it in variable str1
        
        str1 = encrypt(str, shift);
        System.out.println(); //Print a blank line and return 
        System.out.println("Encrypted text is"); 
        System.out.println(str1); //Print the contents of str1 which is the encrypted text
        
        System.out.println(); //Print a blank line and return 
        System.out.println("Decrypted text is");
        //Call the method named decrypt passing it the encrypted text in str1 and the number in shift
        //Print the string returned from the decrypt method which is the text converted back to plain text
        
        System.out.println(decrypt(str1, shift));
        
        // Caesar cipher method to convert plain text into cipher text 
        public static String encrypt(String str, int shift) {
            
        char ch1[]=str.toCharArray(); //Convert the string passed in into a character array and store the elements in array ch1
        
        char ch3; //Variable to be used to hold the substitute character (cipher character)
        String cipherText = ""; //Declare and initialize a string variable that will hold the completed cipher text
        
        for(int i=0;i<str.length();i++) //Loop through each character in the array until reaching the end 
        { 
        if(Character.isLetter(ch1[i]))
        { 
          if(Character.isUpperCase(ch1[i]))
          { 
            ch3=(char)(((int)ch1[i]+shift-65)%26+65);//Perform shift on uppercase character 
          }
          else
          {
            ch3=(char)(((int)ch1[i]+shift-97)%26+97); //Perform shift on lowercase character
          }  
        //Append the character in ch3 to the string variable named cipherText
          cipherText=cipherText+ch3;
        } 
        else 
        { 
        //Append unconverted non-alphabetic character to string variable named cipherText 
        cipherText=cipherText+ch1[i];
        }
        }
        return cipherText; 
       }
        
        //Caesar cipher method to convert cipher text back into plain text
        public static String decrypt(String str, int shift) {
            
          char ch2[]=str.toCharArray();//Convert the string passed in into a character array and store the elements in array ch2 
          char ch4; //Variable to be used to hold the substitute character (plain text character) 
          String plainText = "";


          for(int i=0;i<str.length();i++) //Loop through each character in the array until reaching the end 
          { 
          if(Character.isLetter(ch2[i]))
          { 
            if(Character.isUpperCase(ch2[i]))
            { 
              ch4=(char)(((int)ch2[i]-shift-65+26)%26+65); //Perform reverse shift on uppercase character
            }
            else
            { 
              ch4=(char)(((int)ch2[i]-shift-97+26)%26+97); //Perform reverse shift on lowercase character
            }
           //Append the character in ch4 to the string variable named plaintext
              plainText=plainText+ch4;
            } 
            else
            {
            //Append unconverted non-alphabetic character to the string variable plaintext
            plainText=plainText+ch2[i]; 
            } 
            } 
            return plainText;
           }
    }
  
