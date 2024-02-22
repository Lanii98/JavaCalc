import javax.swing.*;

public class Division extends UserChoiceDialog
{

    public static void divide() {

        double num1, num2, total;
        String num1AS, num2AS;

        num1AS = JOptionPane.showInputDialog(null,"Enter first number.",
                "Division",JOptionPane.QUESTION_MESSAGE);
        num2AS = JOptionPane.showInputDialog(null,"Enter second number",
                "Division",JOptionPane.QUESTION_MESSAGE);

        num1 = Integer.parseInt(num1AS);
        num2 = Integer.parseInt(num2AS);

        if(num2 > num1) {
            total = num2 / num1;
            JOptionPane.showMessageDialog(
                    null,
                    num2 +
                    " / " +  
                    num1 + 
                    " = " + 
                    total,"Calculator",
                    JOptionPane.INFORMATION_MESSAGE
                );
        }
        else {
            total = num1 / num2;
            JOptionPane.showMessageDialog(
                    null,
                    num1 +
                    " / " +  
                    num2 + 
                    " = " + 
                    total,"Calculator",
                    JOptionPane.INFORMATION_MESSAGE
                );
        }

        UserChoiceDialog.choiceDialog();
    }
}
