/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author houst
 */
public class TestUserProfile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Welcome! To create an account, start by entering your name: ");
        String name = input.nextLine();
        System.out.printf("Welcome, %s! Please select your favourite genre.\nEnter the number corresponding to your choice: \n 1. %s\n 2. %s\n 3. %s\n 4. %s\n", name, UserProfile.genres[0], UserProfile.genres[1], UserProfile.genres[2], UserProfile.genres[3]);
        int genreNum = input.nextInt();
        System.out.printf("Profile created! You are %s and your favourite genre is %s\n", name, UserProfile.genres[genreNum - 1]);
    }
    
}
