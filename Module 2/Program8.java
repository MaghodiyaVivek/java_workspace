package Moduel2;

import java.util.Scanner;

public class Program8 
{

	public static void main(String[] args) 
	{
	
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        int letterCount = 0;
        int spaceCount = 0;
        int numberCount = 0;
        int otherCount = 0;

        // Loop through each character in the input string
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                letterCount++;
            } else if (Character.isDigit(ch)) {
                numberCount++;
            } else if (Character.isWhitespace(ch)) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }

        System.out.println("Letter count: " + letterCount);
        System.out.println("Space count: " + spaceCount);
        System.out.println("Number count: " + numberCount);
        System.out.println("Other character count: " + otherCount);

	}
}
