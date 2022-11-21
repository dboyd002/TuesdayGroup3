public class Globals
{
	///#include <bits/stdc++.h>


	public static void main(String[] args)
	{
		///Declare variables
		String line = "";

		///text for a string
		line = "This is a test test line line line line line line";

		///vector to save tokens
		ArrayList<String> tokens = new ArrayList<String>();

		///use stringstream for tokenizing
		stringstream readline = new stringstream(line);

		///string for tokenizing
		String text = "";

		///use a loop for tokens
		while (getline(readline, text, ' '))
		{
			tokens.add(text);
		}

		///Print the vector
		for (int a = 0; a < tokens.size(); a++)
		{
			System.out.print(tokens.get(a));
			System.out.print('\n');
		}

		///count total words
		int words = 0;

		///store token size in a variable
		int wsize = line.length();

		///use a loop for counting
		for (int s = 0; s < wsize; s++)
		{
			///if there is a space, increase the word count
			if (line.charAt(s) == ' ')
			{
				words++;
			}
		}
			///increase the word count by 1 after the loop
			words = words + 1;

			///print the word count
			System.out.print("\n");
			System.out.print("Number of words: ");
			System.out.print(words);
			System.out.print("\n");
			System.out.print("\n");

			///get the frequency
			String freq = "";
			TreeMap<String, Integer> D = new TreeMap<String, Integer>();

			///use a loop for getting the frequency
			for (int b = 0; b < line.length(); b++)
			{
				///if there is a space, there is a word
				if (line.charAt(b) == ' ')
				{
					///if the word is not repeated, it is used once
					if (!D.containsKey(freq))
					{
						D.put(freq, 1);
						freq = "";
					}

					///if a word is found, update the frequency
					else
					{
						D.get(freq)++;
						freq = "";
					}
				}

				else
				{
					freq += line.charAt(b);
				}
			}

		/// store the last word
		if (!D.containsKey(freq))
		{
			D.put(freq, 1);
		}

		///update the frequency
		else
		{
			D.get(freq)++;
		}

		/// read the map to print the  frequency
		for (var it : D)
		{
				System.out.print(it.first);
				System.out.print(" = ");
				System.out.print(it.second);
				System.out.print("\n");
		}
	}

}
