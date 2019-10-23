import javax.swing.*;

public class UserChoiceDialog extends Calculator
{

    public static void choiceDialog() {

        String choices = "Please choose an option: \n 1) Addition \n 2) Subtraction \n 3) Division \n 4) Multiplication \n 5) Factorial \n 6) Power \n 7) Quit\n\n";
        int choice = Integer.parseInt(JOptionPane.showInputDialog(null,choices,"Main Menu",JOptionPane.QUESTION_MESSAGE));

        if(choice <= 0 || choice >= 8)
        {
            JOptionPane.showMessageDialog(null,"You have entered an invalid number","Calculator",JOptionPane.ERROR_MESSAGE);
            UserChoiceDialog.choiceDialog();
        }
        else {
            switch(choice) {

                case 1: Addition.add();
                    break;

                case 2: Subtraction.subtract();
                    break;

                case 3: Division.divide();
                    break;

                case 4: Multiplication.multiply();
                    break;

                case 5: Factorial.factorial();
                    break;

                case 6: PowerOf.userInts();
                    break;

                case 7: Calculator.goodbye();
                    break;

            } //end switch
        } //end else

    } //end choiceDialog()

} //end class
