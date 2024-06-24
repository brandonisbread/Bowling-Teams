// Chapter 8 exercise


import java.util.Scanner;

public class BowlingTeamDemo2
{
	public static void main(String[] args)
	{
		String name;
		int x;
		int y;
		final int NUM_TEAM_MEMBERS = 4;
		final int NUM_TEAMS = 3;
		Scanner input = new Scanner(System.in);
		BowlingTeam[] teams = new BowlingTeam[NUM_TEAMS];

		for(y = 0; y < NUM_TEAMS; ++y)
		{
			teams[y] = new BowlingTeam();
			System.out.print("Enter Team name >> ");
			name = input.nextLine();
			teams[y].setTeamName(name);
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print("Enter team members name >> ");
				name = input.nextLine();
				teams[y].setMember(x, name);
			}
		}
		for(y = 0; y < NUM_TEAMS; ++y)
		{
			System.out.println("\nMembers of team " + teams[y].getTeamName());
			for(x = 0; x < NUM_TEAM_MEMBERS; ++x)
			{
				System.out.print(teams[y].getMember(x) + " ");
			}
			System.out.println(" ");
		} // end of teams output


		
	}
}