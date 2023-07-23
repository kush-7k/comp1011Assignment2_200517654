package com.msd7781.javascrabblepointsgenerator;

import java.util.ArrayList;
import java.util.Currency;

public class ASSIGNMENT2model {

    /***
     * NAME-KUSH ASHWINBHAI PATEL
     * STUDENT NO- 200517654
     *
     ALL THE VARIABLES HAVE BEEN DECLARED WITH A NAME DESCRIBING THE LOGIC AND PURPOSE OF IT
     ***/


    public int allAlphabetsAvailability[] = {9, 2, 2, 4, 12, 2, 3, 2, 8, 1, 1, 4, 2, 6, 8, 2, 1, 6, 4, 6, 4, 2, 2, 1, 2, 1};
    public int pts[] = {1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10};
    public ArrayList<String> storingPreviousWords = new ArrayList<>(20);
    public int incrementForCorrection = 0;
    public int allErrorsPossible = 0;
    public int pointsOfCurrentWord = 0;

    public char[] allEnglishCharacters = new char[26];
    public int firstTimeEntry = 0;

    /*THIS METHOD CHECKS ALL THE CONDITIONS FOR A VALID WORD AND IS INVOKED
    WHEN CLICKED ON THE SUBMIT BUTTON BY THE USER*/
    public int checkEveryError(String getWord) {
        incrementForCorrection = 0;

        for (char i = 'A'; i <= 'Z'; i++)
            allEnglishCharacters[i - 'A'] = i;
        getWord = getWord.toUpperCase();
        //CONVERTING TO UPPER CASE TO AVOID THE CASE
        char[] convertingToCharData = getWord.toCharArray();
        /*
         * RETURNS A PARTICULAR NUMBER FOR A CERTAIN KIND OF ERROR
         * IN THIS WAY ALL THE DIFFERENT KINDS OF ERRORS CAN BE CAUGHT AND DISPLAY
         * THE MESSAGE ACCORDINGLY
         * */


        if (getWord.length() < 2) {
            allErrorsPossible = 1;
            return allErrorsPossible;
        }
        if (getWord.length() > 8) {
            allErrorsPossible = 2;
            return allErrorsPossible;
        }
        if (getWord.length() > 2 || getWord.length() <= 8) {

            incrementForCorrection++;
        }
        if (getWord.contains("A") || getWord.contains("E") || getWord.contains("I") || getWord.contains("O") || getWord.contains("U") || getWord.contains("Y")) {
            incrementForCorrection++;

        } else {
            allErrorsPossible = 3;
            return allErrorsPossible;
        }
        //JUST A VARIABLE ON A FAVORITE SPORT
        int cricket = 0;
        for (int i = 0; i < storingPreviousWords.size(); i++) {
            if (storingPreviousWords.get(i).compareToIgnoreCase(getWord) == 0)
                cricket = 1;
        }
        if (cricket == 1) {
            allErrorsPossible = 4;
            return allErrorsPossible;
        }
        if (firstTimeEntry == 0) {
            firstTimeEntry = 3;

            incrementForCorrection++;
        } else if (cricket == 0) incrementForCorrection++;
        int preCheckBeforeAddingPoints = 0;
        for (int i = 0; i < getWord.length(); i++) {
            for (int j = 0; j < allEnglishCharacters.length; j++) {
                if (convertingToCharData[i] == allEnglishCharacters[j] && allAlphabetsAvailability[j] > 0)
                    preCheckBeforeAddingPoints++;
            }
        }
        if (preCheckBeforeAddingPoints == convertingToCharData.length) {

            incrementForCorrection++;
            for (int i = 0; i < getWord.length(); i++) {
                for (int j = 0; j < allEnglishCharacters.length; j++) {
                    if (convertingToCharData[i] == allEnglishCharacters[j]) {
                        allAlphabetsAvailability[j] -= 1;
                    }
                }
            }
        } else {
            allErrorsPossible = 5;
            return allErrorsPossible;
        }
        //IF EVERYTHING IS CORRECT, I AM SENDING A UNIQUE NUMBER IN ORDER TO AVOID CONFUSION AND KNOW THAT THIS IS CORRECT
        if (incrementForCorrection == 4) {
            storingPreviousWords.add(getWord);
            return 7781;
            //7781 IS A BIRTHDAY OF A GREAT CRICKETER SO JUST RETURNING THAT FOR CORRECT WORD
        } else
            //OR ELSE RETURNING THE NUMBER DESCRIBING THE ERROR
            return allErrorsPossible;
    }


    //CALCULATING THE POINTS
    public int determiningThePoints(String getWord) {
        pointsOfCurrentWord=0;
        //A2Controller control = new A2Controller();
        char[] convertingToCharData = getWord.toCharArray();
        for (int i = 0; i < getWord.length(); i++) {
            for (int j = 0; j < allEnglishCharacters.length; j++) {
                if (convertingToCharData[i] == allEnglishCharacters[j])
                    pointsOfCurrentWord += pts[j];
            }
        }
        return pointsOfCurrentWord;
    }

    //IF GAME IS OVER THEN RETURNING THE BOOLEAN VALUE
    public boolean gameOver() {
        int flag = 0, cricket = 1;
        if (allAlphabetsAvailability[0] == 0 || allAlphabetsAvailability[4] == 0 || allAlphabetsAvailability[8] == 0 || allAlphabetsAvailability[15] == 0 || allAlphabetsAvailability[20] == 0)
            cricket = 0;

        for (int i = 0; i < 26; i++) {
            if (allAlphabetsAvailability[i] == 0)
                flag++;
        }
        if(flag==25)
            cricket=0;
        if(cricket==1)
            return false;
        else
            return true;
    }

}
