import java.util.Scanner;
import java.io.*;
import java.lang.String;
import java.text.DecimalFormat;
import java.lang.Math;
/** This is a Java Program
FileName : "QuestionsQuizFinal".
Author: Shane Bryant
Date: 12/16/2019
Purpose: */
public class QuestionsQuizFinal { 
   public static void files() throws IOException {
      	
      BufferedReader in = new BufferedReader (new FileReader("QuizAnswers.txt")); //Allows text to be read from the file "Hero.txt"
      String inFile = "";
      int startLine = 1; //Text from file is outputted starting from the first line
      int endLine = 23;   //Text from file is outputted ending at the seventh line
      for (int i = 0; i < startLine; i++) { 
         inFile = in.readLine(); 
      }
      for (int i = startLine; i < endLine + 1; i++) {
         inFile = in.readLine();
         System.out.println(inFile); 
      }
      	
      in.close(); //The file is closed
   }
   public static void takeQuiz(Question [] questions){
      float score = 0;
      Scanner keyboard = new Scanner(System.in);
      
      for(int i = 0; i < questions.length; i++) {
         System.out.println(questions[i].prompt);
         String answer = keyboard.nextLine();
         if(answer.equalsIgnoreCase(questions[i].answer)) {
            score++;
         }
         else{
            System.out.println("=================================================");
            System.out.println("Your answer '"+answer+"'"+ " is incorrect!");
            System.out.println("=================================================");
         }
      }
      float total = (score/questions.length)*(100);
      System.out.println("Your score is " + score + "/" + questions.length);
      System.out.println("The percent is " + total + "%");
   } 
   public static void main(String[] args) throws IOException{ 
      String q1 = "1. What is the correct format for a case?\n" + " a. case 'A'\n b. case(A);\n c. Case''A''\n d. case (A)";
      String q2 = "2. Which of the following of a switch statement is separate from the case expressions\n (executed when none of the other cases match the control expression.)?\n a. case\n b. default:\n c. else\n d. otherwise";  
      String q3 = "3. Please input the 8 Primitive Data Types:\n[In Alphabetical Order] \n";   
      String q4 = "4. True/False: In the statement: if (a || b), if a is true and b is false, then the boolean expression will return true.\n[ENTER FULL WORD]";
      String q5 = "5. True/False: In the statement: if (a && b), if a is true and b is false, then the boolean expression will return false.\n[ENTER FULL WORD]";
      String q6 = "6. True/False: The 'switch' selection structure must end with the default case.";
      String q7 = "7. What type of comments is the following an example of?\n/*\nThis isThe example\n*/ \n a. Single-line comments\n b. Documentation comments\n c. Multiple-line comments";
      String q8 = "8. What is the last number that the following will output?\nclass ExampleForLoop {\npublic static void main(String args[]){\nfor(int i=10; i>0; i--){\nSystem.out.println(i);\n}\n}\n}";
      String q9 = "9. What does break; do in a switch statement?\n a. Breaks the program/Causes a compiling error\n b. Ends the entire program immediately\n c. Terminates the loop, then the program proceeds at the next statement that follows the loop\n d. Terminate the loop and restarts the program";
      String q10 = "10. What are the three types of loops? (Input it in alphabetical order)";
      String q11 = "11. What is the range of the random in the code provided?\nImport java.util.Random;\nRandom ran = new Random();\nint n = rand.nextInt(50);";
      String q12 = "12. What does modulus (%) do in java?\n a. Divides the two numbers and returns the end solution\n b. Adds the two numbers and divides by 2 (Average)\n c. Takes the average and multiplies it by 2\n d. Divides the two numbers and returns the remainder of the two numbers";
      String q13 = "13. What are the 3 or 4 actions you should do with any file?";
      String q14 = "14. What is the git command that allows you to download your repository from GitHub to your computer?\n a. git commit\n b. git push\n c. git add\n d. git clone";
      String q15 = "15. What’s the git command/shortcut for staging all the changes made?\n a. git commit .\n b. git commit add .\n c. git add .\n d. git stage .";
      String q16 = "16. What command is used to initialize a new Git repository?";
      String q17 = "17. What number from the part of code below is inclusive?\n new Random().nextInt(10);";
      String q18 = "18. What number from the part of code below is exclusive?\n new Random().nextInt(10);";
      String q19 = "19. What is the output of the following code?\nint num1 = 10;\nint num2 = 5;\nif (num1 != num2)\nSystem.out.println(''num1 does not equal num2'');\nif (num1 >= num2)\nSystem.out.println(''num1 is greater than or equal to num'')";
      String q20 = "20. Which of the following is correct?\n a. Import java.io.IOException;\n b. import java.io.IOException;\n c. import Java.IO.IOException\n d. import java.io.IOException";
     
      Question [] questions = {
         new Question(q1, "a"),
         new Question(q2, "b"),
         new Question(q3, "Boolean, byte, char, double, float, int, long, short"),
         new Question(q4, "False"),
         new Question(q5, "True"),
         new Question(q6, "False"),
         new Question(q7, "c"),
         new Question(q8, "1"),
         new Question(q9, "c"),
         new Question(q10, "do-while loop, for loop, while loop"),
         new Question(q11, "0-49"),
         new Question(q12, "d"),
         new Question(q13, "Open file, read file, write to file, close file"),
         new Question(q14, "d"),
         new Question(q15, "c"),
         new Question(q16, "git init"),
         new Question(q17, "0"),
         new Question(q18, "9"),
         new Question(q19, "num1 does not equal num2"),
         new Question(q20, "b"),
         
         };
      takeQuiz(questions);
      files();
   } 
}
class Question{
   String prompt;
   String answer;
   public Question(String prompt, String answer){
      this.prompt = prompt;
      this.answer = answer;
   }
}


