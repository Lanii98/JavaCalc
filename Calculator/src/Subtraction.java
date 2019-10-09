import javax.swing.*;

public class Subtraction extends UserChoiceDialog
{

    public static void subtract()
    {

        String numbersAS = "";
        double numbers = 0, totalSub = 0;
        int numCount = 0;

        while(!numbersAS.equals("q"))
        {

            try
            {

                numbersAS = JOptionPane.showInputDialog(null,"Enter number " + (numCount + 1) + ". (q to quit)","Subtraction",JOptionPane.QUESTION_MESSAGE);

                //Makes sure totalSub is not 0
                if(numCount == 1)
                {
                    totalSub = numbers;
                }

                numbers = Double.parseDouble(numbersAS);

                numCount++;
                totalSub = totalSub - numbers;

            }
            catch(NumberFormatException e)
            {

                if(!numbersAS.equals("q") && numCount == 0)
                {

                    JOptionPane.showMessageDialog(null,"You entered an invalid character","Subtraction",JOptionPane.ERROR_MESSAGE);
                    break;

                }

            } //end catch

        } //end while

        if(numCount >= 2)
        {

            JOptionPane.showMessageDialog(null,"The value of all " + numCount + " numbers subtracted is: " + totalSub,"Subtraction",JOptionPane.INFORMATION_MESSAGE);
            UserChoiceDialog.choiceDialog();

        }
        else if(numCount == 1)
        {

            JOptionPane.showMessageDialog(null,"You need to give at least two digits","Subtraction",JOptionPane.ERROR_MESSAGE);
            Addition.add();

        }
        else
        {

            JOptionPane.showMessageDialog(null,"You have exited the Subtraction option","Subtraction",JOptionPane.INFORMATION_MESSAGE);
            UserChoiceDialog.choiceDialog();

        }

    } //end subtract()

} //end class
