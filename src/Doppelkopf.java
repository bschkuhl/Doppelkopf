import javafx.application.Application;
import javafx.stage.Stage;
import java.util.Scanner;




public class Doppelkopf extends Application 
{
    public static void main(String[] args) 
    {
        launch(args);
    }
 
    public void start(Stage theStage) 
    {
        theStage.setTitle("Doppelkopf");
        theStage.show();
        startGame();
    }
    
    public void startGame() {
    
    	Scanner reader = new Scanner(System.in);  // Reading from System.in
    	System.out.println("Enter a number: ");
    	int n = reader.nextInt(); // Scans the next token of the input as an int.
    	//once finished
    	System.out.println(n);
    	reader.close(); 	
    }
    
    public void giveCards() {
    	
    	
    }
    
    public void startRound() {
    	
    	
    }
    
    public void playCard() {
    	
    }
    
    public void nextPlayer() {
    	
    }
    
    public void endRound() {
    	
    }
    
    
    public void countPoints() {
    	
    }
    
    
    
}

