import java.util.ArrayList;

public class BasicJava{
    // Write a method that prints all the numbers from 1 to 255.
    public int printNumbers(int number){ 
        for(int i = 1; i < number; i++){
            System.out.println(i);
        }
        return number;
    }

    // Write a method that prints all the odd numbers from 1 to 255.

    public int printOddNumbers(int number){ 
        for(int i = 1; i < number; i++){
            if (i%2 == 1){
                System.out.println(i);
            } 
        }
        return number;
    }

    // Write a method that creates and eventually returns a sum variable that adds up all the numbers from 1 to 255.

    public int sigmaNumber(int number){
        int sum = 0;
        for(int i = 1; i <= number; i++){
            sum += i;
            } 
        return sum;
    }

    // Given an array X, say [1,3,5,7,9,13], write a method that would iterate through each member of the array and print each value on the screen.
    public int interateArray(int [] array){
        for (int index : array){
            System.out.println(index);
        }
        return 0;
    }

    // Write a method (sets of instructions) that takes any array and prints the maximum value in the array. 
    public int maxArray(int [] array){
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
            } 
        return max;
    }


    // Write a method that creates an array 'y' that contains all the odd numbers between 1 to 255.

    public ArrayList <Integer> oddArray(int number){
        ArrayList <Integer> y = new ArrayList <Integer> ();
        for(int i = 1; i <= number; i++){
            if (i%2 == 1){
                y.add(i);
            } 
        }
        return y;
    }

    // NINJA Bonus

    // Write a method that takes an array, and prints the AVERAGE of the values in the array.

    public float avgArray(int [] array){
        float sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
            } 
        float avg = sum / array.length;
        return avg;
    }

    // Write a method that takes an array and returns the number of values in that array whose value is greater than a given value y.

    public int greaterThanY(int [] array, int number){
        int max = 0;
        for(int i = 0; i < array.length; i++){
            if (array[i] > number){
                max += 1;
            }
            } 
        return max;
    }

    // Given any array x, say [1, 5, 10, -2], write a method that multiplies each value in the array by itself.

    public ArrayList <Integer> squareValues(int [] array){
        ArrayList <Integer> y = new ArrayList <Integer> ();
        for(int i = 0; i < array.length; i++){
                y.add(array[i]*array[i]);
            } 
        return y;
    }

    // Given any array x, say [1, 5, 10, -2], write a method that replaces any negative number with the value of 0.

    public ArrayList <Integer> removeNegative(int [] array){
        ArrayList <Integer> y = new ArrayList <Integer> ();
        for(int i = 0; i < array.length; i++){
            if ( array[i] >= 0){
                y.add(array[i]);
            } 
            else{
                y.add(0);
            }
        }
        return y;
    }

}