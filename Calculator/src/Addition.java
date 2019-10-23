import javax.swing.*;

public class Addition extends UserChoiceDialog
{

    public static void add() {

        String numbersAS = "";
        double numbers, totalAdd = 0.0;
        int numCount = 0;

        while(!numbersAS.equals("q")) {

            try {

                numbersAS = JOptionPane.showInputDialog(null,"Enter number " + (numCount + 1) + ". (q to quit)","Addition",JOptionPane.QUESTION_MESSAGE);
                numbers = Double.parseDouble(numbersAS);

                numCount++;
                totalAdd += numbers;

            }
            catch(NumberFormatException e)
            {
                if(!numbersAS.equals("q") && numCount == 0)
                {

                    JOptionPane.showMessageDialog(null,"You entered an invalid character","Addition",JOptionPane.ERROR_MESSAGE);
                    break;

                }
            } //end catch
        } //end while

        if(numCount >= 2) {

            JOptionPane.showMessageDialog(null,"The total of all " + numCount + " numbers is: " + totalAdd,"Addition",JOptionPane.INFORMATION_MESSAGE);
            UserChoiceDialog.choiceDialog();

        }
        else if(numCount == 1) {

            JOptionPane.showMessageDialog(null,"You need to give at least two digits","Addition",JOptionPane.ERROR_MESSAGE);
            Addition.add();

        }
        else {

            JOptionPane.showMessageDialog(null,"You have exited the Addition option","Addition",JOptionPane.INFORMATION_MESSAGE);
            UserChoiceDialog.choiceDialog();

        }
    } //end add
} //end class
