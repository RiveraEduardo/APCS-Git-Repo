
/**
 * Write a description of class Gibberish here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GibberishRunner// the runner class
{
    public static void main(){
        WordList5000 wordList5000 = new WordList5000();//initializing the Wordlist5000
        Gibberish gibberish = new Gibberish(); //initializing the Gibberish class
        String s = gibberish.makeGibberish(wordList5000);
        System.out.println(s);// prints out the word list(all)
    }
}