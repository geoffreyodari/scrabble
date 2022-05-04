package models;

public class Scrabble {
    public int calculateScore(String gameWord){
        Integer results=0;
        for(int i=0;i<gameWord.length();i++){
            if(gameWord.charAt(i)=='a'||gameWord.charAt(i)=='e'||gameWord.charAt(i)=='i'||gameWord.charAt(i)=='o'||gameWord.charAt(i)=='u'||gameWord.charAt(i)=='l'||gameWord.charAt(i)=='n'||gameWord.charAt(i)=='r'||gameWord.charAt(i)=='s'||gameWord.charAt(i)=='t'){
                results += 1;
            }else if(gameWord.charAt(i)=='d'||gameWord.charAt(i)=='g'){
                results += 2;
            }else if(gameWord.charAt(i)=='b'||gameWord.charAt(i)=='c'||gameWord.charAt(i)=='m'||gameWord.charAt(i)=='p'){
                results += 3;
            }else if(gameWord.charAt(i)=='f'||gameWord.charAt(i)=='h'||gameWord.charAt(i)=='v'||gameWord.charAt(i)=='w'||gameWord.charAt(i)=='y'){
                results += 4;
            }else if(gameWord.charAt(i)=='k'){
                results += 5;
            }else if(gameWord.charAt(i)=='j'||gameWord.charAt(i)=='x'){
                results += 8;
            }else if(gameWord.charAt(i)=='q'||gameWord.charAt(i)=='z'){
                results += 10;
            }
        }

        return results;
    }
}
