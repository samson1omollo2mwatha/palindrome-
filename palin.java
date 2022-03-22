import javax.swing.JOptionPane;


public class palindrome {

    /**
     * @param args
     */
    public static void main(String[] args) {
     
        boolean x;
        boolean display;

       

        x = check();
        display = display();
    }

  
        private static int getUserInput() {
           
            int inputNumber = 0;

            String answer = JOptionPane.showInputDialog(null, "Enter a five digit number");

            inputNumber = Integer.parseInt(answer);
            return inputNumber;

        }
  
        private static boolean check(){

            
            int inputNumber = getUserInput();
            int number = inputNumber;

         
            int[] myArray = new int[5];

          
            for (int i = 0; i < myArray.length; i++) {

            myArray[i] = (int) (number /(Math.pow(10,i)) % 10);

            }

            if(myArray[0] == myArray[4] && myArray[1] == myArray[3])

            return true;

            else

            return false;

            }
          
            public static boolean display(){

            if (check() == true) {
            JOptionPane.showMessageDialog(null, " Is this a Palindrome!!!",
            "Excellent!",
            JOptionPane.INFORMATION_MESSAGE);

            } else
            JOptionPane.showMessageDialog(null,
            "The entered number is not a Palindrome!",
            "Error",
            JOptionPane.ERROR_MESSAGE);

            return false;


        }

        }
