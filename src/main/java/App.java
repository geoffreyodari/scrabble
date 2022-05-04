import models.Scrabble;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Scrabble Application");
        System.out.println("Please type a word");
        try{
            String myWord = bufferedReader.readLine();
            System.out.println("Your Score is "+new Scrabble().calculateScore(myWord));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
