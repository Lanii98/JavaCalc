import javax.swing.*;

public class Factorial
{

    public static void factorial() {

        String numberAS = "";
        int number = 0, result = 0;

        numberAS = JOptionPane.showInputDialog(null,"Enter the number you want the factorial for",
                "Factorial",JOptionPane.QUESTION_MESSAGE);

        if(numberAS.isBlank()) {
            JOptionPane.showMessageDialog(null,"You need to enter a number",
                    "Factorial",JOptionPane.ERROR_MESSAGE);
            Factorial.factorial();
        }

        number = Integer.parseInt(numberAS);

        result = factorial(number);

        if(result == 1)
        {
            JOptionPane.showMessageDialog(null,"You did not provide a valid power number","Error",JOptionPane.WARNING_MESSAGE);
            factorial();
        } else
        {
            JOptionPane.showMessageDialog(null,
                    number + "! = " + 
                    result,
                    "Factorial",
                    JOptionPane.INFORMATION_MESSAGE
                );
        }

        UserChoiceDialog.choiceDialog();

    }

    private static int factorial(int n) {
        if (n >  0) {
            return n * factorial(n -  1);
        } else {
            return  1;
        }
    }

}
