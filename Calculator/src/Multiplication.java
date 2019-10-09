import javax.swing.*;

public class Multiplication extends UserChoiceDialog
{
    public static void multiply()
    {
        String numbersAS = "";
        double numbers, totalMult = 1.0;
        int numCount = 0;

        while(!numbersAS.equals("q")) {
            try {
                numbersAS = JOptionPane.showInputDialog(null,"Enter number " + (numCount + 1) + ". (q to quit)","Multiplication",JOptionPane.QUESTION_MESSAGE);
                numbers = Double.parseDouble(numbersAS);

                numCount++;
                totalMult = totalMult * numbers;
            } //end try
            catch(NumberFormatException e)
            {
                if(!numbersAS.equals("q") && numCount == 0)
                {
                    JOptionPane.showMessageDialog(null,
                            "You entered an invalid character","Multiplication",JOptionPane.ERROR_MESSAGE);
                    break;
                }
            } //end catch
        } //end while

        if(numCount >= 2) {
            JOptionPane.showMessageDialog(null,"The value of all " + numCount +
                    " numbers multiplied is: " + totalMult,"Multiplication",JOptionPane.INFORMATION_MESSAGE);
            UserChoiceDialog.choiceDialog();
        }
        else if(numCount == 1) {
            JOptionPane.showMessageDialog(null,"You need to give at least two digits",
                    "Multiplication",JOptionPane.ERROR_MESSAGE);
            Addition.add();
        }
        else {
            JOptionPane.showMessageDialog(null,"You have exited the Multiplication option",
                    "Multiplication",JOptionPane.INFORMATION_MESSAGE);
            UserChoiceDialog.choiceDialog();
        }
    }
}
