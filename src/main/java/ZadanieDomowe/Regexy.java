package ZadanieDomowe;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regexy {
    public static void main(String[] args) {
        String numberLetterChain = "kf4@$56nvsue^%48eriufn48";
        String numberChain = "78895478380239";
        String letterChain = "fuhrejdskncvdjf";
        String letterChain5 = "piecc";
        String sentencepl = "Nawet płonący żywy trup ma swoje jasne strony";
        String sentence = "Zdanie bez polskich znakow";
        System.out.println(isNumber(numberChain));
        System.out.println(isNumber(numberLetterChain));
        System.out.println(isNumber(letterChain));
        System.out.println(isNumber(sentence));
        System.out.println(changeWord(sentencepl, "zombie"));
        System.out.println(removeWhite(sentence));
        System.out.println("Zad4");
        System.out.println(isLettersAndFive(sentence));
        System.out.println(isLettersAndFive(numberLetterChain));
        System.out.println(isLettersAndFive(letterChain));
        System.out.println(isLettersAndFive(letterChain5));
        System.out.println("Zad5");
        System.out.println(isSentence(sentence));
        System.out.println(isSentence(sentencepl));
        System.out.println(isSentence(letterChain5));




    }
//  Zad 1
    public static boolean isNumber(String chain){
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(chain);

        if (matcher.matches()){
            return true;
        }else {
        return false;
        }

    }

//    Zad 2
    public static String changeWord (String sentence, String word){
        Pattern pattern = Pattern.compile("trup");
        Matcher matcher = pattern.matcher(sentence);
        return matcher.replaceAll(word);

    }

//    Zad 3

    public static String removeWhite (String sentence){
        Pattern pattern = Pattern.compile("\\s+");
        Matcher matcher = pattern.matcher(sentence);
        return matcher.replaceAll("");

    }

    //    Zad 4

    public static boolean isLettersAndFive (String sentence){
        Pattern pattern = Pattern.compile("[a-zA-Z]{5}");
        Matcher matcher = pattern.matcher(sentence);
        return matcher.matches();

    }
//  Zad 5 (Założyłam że zdanie zaczyna się dużą literą, ma kropkę na końcu i przynajmniej jedną spację*).
//    * Tak wiem, że mogą być zdania "jednosłowne

    public static boolean isSentence (String sentence){
        Pattern pattern = Pattern.compile("[A-Z]{1}\\w+(\\s\\w+)*\\.");
        Matcher matcher = pattern.matcher(sentence);
        return matcher.matches();

    }

}
