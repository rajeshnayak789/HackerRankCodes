import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;
import java.util.Stack;


public class StackQueue {

    LinkedList queue;
    Stack<Character> stacky = new Stack<>();


    public StackQueue()
    {
        queue = new LinkedList();
    }
    //Enqueue
    private void enqueueCharacter(char c)
    {
        queue.addLast(c);
    }
    //Dequeue
    private char dequeueCharacter()
    {
        return (char) queue.remove(0);
    }
    //Push
    private void pushCharacter(char c)
    {
        stacky.push(c);
    }
    //Pop
    private char popCharacter()
    {
    return stacky.pop();
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        StackQueue p = new StackQueue();
        // Push/Enqueue all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }


}
