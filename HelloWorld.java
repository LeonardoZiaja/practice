import java.time.LocalDateTime;
import java.time.Duration;

public class HelloWorld
{

	private final static LocalDateTime start_carsten = LocalDateTime.of(2017,10,1,0,0);

       public static void main (String[] args)
       {
             // Ausgabe Hello World!
             System.out.println("Jahre an der Uni: 3 (drei)");
             System.out.println("Leonardo Maximilian Ziaja");


		//Berechnung Carsten
		LocalDateTime now = LocalDateTime.now(); 

		System.out.println("Carsten hat die Uni am "+start_carsten.toString()+" gestartet"); 

		Duration duration = Duration.between(start_carsten, now); 

		long days = duration.toDays(); 

		long years = days/365; 

		System.out.println("Carsten ist seit "+days+" Tagen und "+years+" Jahren eingeschrieben.");

       }
}
