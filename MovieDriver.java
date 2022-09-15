import java.util.Scanner;
public class MovieDriver 
{

	public static void main(String[] args) 
	{
		String title;
		String rating;
		int soldTickets;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the name of a movie");
		title = keyboard.nextLine();
		System.out.println("Enter the rating of the movie:");
		rating = keyboard.nextLine();
		System.out.println("Enter the number of tickets sold for this movie:");
		soldTickets = keyboard.nextInt();
		Movie first = new Movie(title, rating, soldTickets);
		System.out.println(first.toString());
		System.out.println("Do you want to enter another? (y or n)");
		char c = keyboard.next().charAt(0);
		while(c == 'y')
		{
			System.out.println("Enter the name of a movie:");
			title = keyboard.nextLine();
			title = keyboard.nextLine();
			first.setTitle(title);
			System.out.println("Enter the rating of the movie:");
			rating = keyboard.nextLine();
			first.setRating(rating);
			System.out.println("Enter the number of tickets sold for this movie");
			soldTickets = keyboard.nextInt();
			first.setSoldTickets(soldTickets);
			System.out.println(first.toString());
			System.out.println("Do you want to enter another? (y or n)");
			c = keyboard.next().charAt(0);
			if(c == 'n')
			{
				System.out.println("Goodbye");
			}
		}
	}
}


