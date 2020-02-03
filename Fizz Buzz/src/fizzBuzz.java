import java.util.Scanner;

public class fizzBuzz
	{
		static Scanner userIntInput = new Scanner(System.in);
		static Scanner userStringInput = new Scanner(System.in);
		public static void main(String[] args)
			{
				greetUser();
				print();

			}
		public static void greetUser()
			{
				System.out.println("What is your name?");
				String name = userStringInput.nextLine();
				System.out.println("Hello, " + name + "!");
			}
		public static void print()
			{
				for (int num = 1; num <= 100; num++)
					{
						if (num % 3 == 0)
							{
								System.out.println("Fizz");
							}
						else if (num % 5 == 0)
							{
								System.out.println("Buzz");
							}
						else if (num % 15 == 0)
							{
								System.out.println("Fizz Buzz");
							}
						else
							{
								System.out.println(num);
							}
					}
			}

	}
