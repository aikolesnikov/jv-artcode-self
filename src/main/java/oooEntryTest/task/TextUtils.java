package oooEntryTest.task;

/**
 *  Created by Vorobiei on 18.05.2016.
 */
public class TextUtils {
    /**
     * Method contains inside of its body three another methods.
     * Each of this method defined below.
     *
     * @param text description
     * @return sorted by natural order array of unique words
     */
    public static String[] getUniqueSortedWords(String text) {
//        TODO find mistake and correct it, so the method works correctly
        String[] words = getWords(text);
        String[] uniqueWords = getUniqueWords(words);
        return sortWords(uniqueWords);
    }

    /**
     * @param text description
     * @return array with words, get from receive text
     * if received argument is null
     * or text length is zero
     * return array with zero length
     */
    public static String[] getWords(String text) {

//        TODO write your code here
        String str[] = new String[]{};

        if (text == null || text.length() == 0) return str;

        return text.split("; ");
    }

    /**
     * @param words array with words
     * @return array with unique words
     */
    public static String[] getUniqueWords(String[] words) {

//        TODO write your code here

        if (words.length <= 1) return words;

        int wCount = words.length;
        String[] tmpArS = new String[wCount];

        tmpArS[0] = words[0];

        int tmpArInd = 1;
        boolean isInArray;

        for (int i = 1; i < wCount; i++) {
            isInArray = false;
            for (int j = 0; j < i; j++) {
                if (words[i].equals(tmpArS[j])) {
                    isInArray = true;
                    break;
                }
            }
            if (!isInArray) {
                tmpArS[tmpArInd++] = words[i];
            }

        }

        String[] tmpArS2 = new String[tmpArInd];
        System.arraycopy(tmpArS, 0, tmpArS2, 0, tmpArInd);

        return tmpArS2;
    }

    /**
     * @param uniqueWords array with unique words
     * @return sorted by natural order array of unique words
     */
    public static String[] sortWords(String[] uniqueWords) {

//        TODO write your code here

        int arLenght = uniqueWords.length;
        String tmpStr;

        for (int i = 0; i < arLenght - 1; i++) {
            for (int j = 1; j < arLenght; j++) {
                if (uniqueWords[i].compareTo(uniqueWords[j]) > 0) {
                    tmpStr = uniqueWords[j];
                    uniqueWords[j] = uniqueWords[i];
                    uniqueWords[i] = tmpStr;
                }
            }
        }

        // Arrays.sort(uniqueWords);



        return uniqueWords;
    }
}
