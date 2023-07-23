package com.msd7781.javascrabblepointsgenerator;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.util.ArrayList;

public class ASSIGNMENT2controller {
    //ALL THE EVENTS DECLARED
    @FXML
    private Button alphabetA;

    @FXML
    private Button alphabetB;

    @FXML
    private Button alphabetC;

    @FXML
    private Button alphabetD;

    @FXML
    private Button alphabetE;

    @FXML
    private Button alphabetF;

    @FXML
    private Button alphabetG;

    @FXML
    private Button alphabetH;

    @FXML
    private Button alphabetI;

    @FXML
    private Button alphabetJ;

    @FXML
    private Button alphabetK;

    @FXML
    private Button alphabetL;

    @FXML
    private Button alphabetM;

    @FXML
    private Button alphabetN;

    @FXML
    private Button alphabetO;

    @FXML
    private Button alphabetP;

    @FXML
    private Button alphabetQ;

    @FXML
    private Button alphabetR;

    @FXML
    private Button alphabetS;

    @FXML
    private Button alphabetT;

    @FXML
    private Button alphabetU;

    @FXML
    private Button alphabetV;

    @FXML
    private Button alphabetW;

    @FXML
    private Button alphabetX;

    @FXML
    private Button alphabetY;
    @FXML
    private Button alphabetZ;
    public String wordFromUser="";
    ASSIGNMENT2model beechCroft=new ASSIGNMENT2model();
    public ArrayList<String> WordsEntered = new ArrayList<>();
    @FXML
    public Label showTimer;
    @FXML
    public Label errorLabel = new Label();
    @FXML
    public TextField takeCurrentWord=new TextField();
    @FXML
    public TextField allLegalWords= new TextField();
    @FXML
    public AnchorPane mainContainer;


    @FXML
        //CONTROLLING THE LETTER IS PRESSED AND SET VISIBLE TO THE TEXT FIELD
    void letterA(ActionEvent event) {
        wordFromUser+="A";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[0]==1)
            alphabetA.setVisible(false);
    }
    @FXML
    void letterB(ActionEvent event) {
        wordFromUser+="B";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[1]==1)
            alphabetB.setVisible(false);
    }
    @FXML
    void letterC(ActionEvent event) {
        wordFromUser+="C";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[2]==1)
            alphabetC.setVisible(false);
    }

    @FXML
    void letterD(ActionEvent event) {
        wordFromUser+="D";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[3]==1)
            alphabetD.setVisible(false);
    }
    @FXML
    void letterE(ActionEvent event) {
        wordFromUser+="E";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[4]==1)
            alphabetE.setVisible(false);
    }
    @FXML
    void letterF(ActionEvent event) {
        wordFromUser+="F";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[5]==1)
            alphabetF.setVisible(false);
    }

    @FXML
    void letterG(ActionEvent event) {
        wordFromUser+="G";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[6]==1)
            alphabetG.setVisible(false);
    }


    @FXML
    void letterH(ActionEvent event) {
        wordFromUser+="H";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[7]==1)
            alphabetH.setVisible(false);
    }

    @FXML
    void letterI(ActionEvent event) {
        wordFromUser+="I";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[8]==1)
            alphabetI.setVisible(false);
    }


    @FXML
    void letterJ(ActionEvent event) {
        wordFromUser+="J";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[9]==1)
            alphabetJ.setVisible(false);
    }


    @FXML
    void letterK(ActionEvent event) {
        wordFromUser+="K";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[10]==1)
            alphabetK.setVisible(false);
    }

    @FXML
    void letterL(ActionEvent event) {
        wordFromUser+="L";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[11]==1)
            alphabetL.setVisible(false);
    }

    @FXML
    void letterM(ActionEvent event) {
        wordFromUser+="M";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[12]==1)
            alphabetM.setVisible(false);
    }

    @FXML
    void letterN(ActionEvent event) {
        wordFromUser+="N";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[13]==1)
            alphabetN.setVisible(false);

    }

    @FXML
    void letterO(ActionEvent event) {
        wordFromUser+="O";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[14]==1)
            alphabetO.setVisible(false);
    }


    @FXML
    void letterP(ActionEvent event) {
        wordFromUser+="P";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[15]==1)
            alphabetP.setVisible(false);
    }

    @FXML
    void letterQ(ActionEvent event) {
        wordFromUser+="Q";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[16]==1)
            alphabetQ.setVisible(false);
    }

    @FXML
    void letterR(ActionEvent event) {
        wordFromUser+="R";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[17]==1)
            alphabetR.setVisible(false);
    }

    @FXML
    void letterS(ActionEvent event) {
        wordFromUser+="S";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[18]==1)
            alphabetS.setVisible(false);
    }


    @FXML
    void letterT(ActionEvent event) {
        wordFromUser+="T";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[19]==1)
            alphabetT.setVisible(false);
    }


    @FXML
    void letterU(ActionEvent event) {
        wordFromUser+="U";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[20]==1)
            alphabetU.setVisible(false);
    }

    @FXML
    void letterV(ActionEvent event) {
        wordFromUser+="V";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[21]==1)
            alphabetV.setVisible(false);
    }

    @FXML
    void letterW(ActionEvent event) {
        wordFromUser+="W";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[22]==1)
            alphabetW.setVisible(false);
    }

    @FXML
    void letterX(ActionEvent event) {
        wordFromUser+="X";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[23]==1)
            alphabetX.setVisible(false);
    }


    @FXML
    void letterY(ActionEvent event) {
        wordFromUser+="Y";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[24]==1)
            alphabetY.setVisible(false);
    }

    @FXML
    void letterZ(ActionEvent event) {
        wordFromUser+="Z";
        takeCurrentWord.setText(wordFromUser);
        if(beechCroft.allAlphabetsAvailability[25]==1)
            alphabetZ.setVisible(false);
    }

    //REMOVES THE LETTER IF ENTERED MISTAKENLY BY THE USER
    @FXML
    void onClearButtonClick(ActionEvent event) {
        wordFromUser=wordFromUser.substring(0,wordFromUser.length()-1);
        takeCurrentWord.setText(wordFromUser);
    }


    //PROGRAM LOGIC EXECUTES WHEN CLICKED ON THE SUBMIT BUTTON
    @FXML
    void SubmitClick(ActionEvent event){
        mainContainer.setStyle("-fx-background-color: darkorange");
        if(beechCroft.gameOver()==false){
            //UNTIL AND UNLESS THE GAME IS NOT OVER THEN PROGRAM RUNS
            errorLabel.setVisible(false);
            wordFromUser=takeCurrentWord.getText();
            //STORING THE TOTAL POINTS OF THE CURRENT WORD
            int totalPointsOfWord=0;
            //VARIABLE FOR SHOWING DIFFERENT KIND OF ERRORS
            int correctedErrors= beechCroft.checkEveryError(wordFromUser);
            //MAIN LOGIC IS HANDELLED BY MODEL EXCEPT THE ACTION EVENTS
            if(correctedErrors==7781){
                //ADDS THE COLOR CHANGE AND DISPLAYS THE POINTS IF WORD ENTERED SATISFIES ALL THE CONDITIONS
                WordsEntered.add(wordFromUser);
                totalPointsOfWord= beechCroft.determiningThePoints(wordFromUser);
                mainContainer.setStyle("-fx-background-color: lightgreen");
                showTimer.setText(Integer.toString(totalPointsOfWord));
                wordFromUser="";
                takeCurrentWord.setText("");
            }

            //ALL THE LOGIC IS CODED FOR ALL THE DIFFERENT KIND OF ERRORS
            else if (correctedErrors==1) {
                mainContainer.setStyle("-fx-background-color: red");
                errorLabel.setVisible(true); errorLabel.setText("Please enter at least 2 letters");}
            else if (correctedErrors==2) {
                mainContainer.setStyle("-fx-background-color: red");
                errorLabel.setVisible(true);
                errorLabel.setText("Word exceeded length of 8");
            } else if (correctedErrors==3) {
                mainContainer.setStyle("-fx-background-color: red");
                errorLabel.setVisible(true);
                errorLabel.setText("No vowel has been entered");
            } else if (correctedErrors==4) {
                mainContainer.setStyle("-fx-background-color: red");
                errorLabel.setVisible(true);
                errorLabel.setText("Word is already entered  before");
            } else if(correctedErrors==5) {
                mainContainer.setStyle("-fx-background-color: red");
                errorLabel.setVisible(true);
                errorLabel.setText("Word contains letter that is no longer available “in bag” ");
            }

        }
        //IF GAME IS OVER THEN DISPLAY THE ERROR MESSAGE
        else {
            mainContainer.setStyle("-fx-background-color: black");
            errorLabel.setVisible(true);
            errorLabel.setText("One word left or no vowels are there");
        }
    }
    //sets the error message label to invisible before commencing the program
    @FXML
    //SETTING THE ERROR LABEL AS AN INVISIBLE WHEN COMMENCING THE PROGRAM
    void initialize(){
        errorLabel.setVisible(false);
    }


    //DISPLAYS THE PREVIOUS WORDS WHEN CLICKED ON THE PREVIOUS CLICK

    public void PreviousClick(ActionEvent actionEvent) {
        allLegalWords.setText("");
        allLegalWords.setText(String.valueOf(WordsEntered));
        mainContainer.setStyle("-fx-background-color: lightblue");
    }
}
