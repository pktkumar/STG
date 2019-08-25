package STG;

public class Winner {

	public static void main(String[] args) {
		System.out.println(winner("MMM", "EMH"));

	}

	public static String winner(String player1, String player2) {

		int ericaPoints = pointCount(player1);
		int bobPoints = pointCount(player2);

		if (ericaPoints > bobPoints)
			return "Erica";
		if (bobPoints > ericaPoints)
			return "Bob";
		return "Tie";
	}

	public static int pointCount(String name) {
		int points = 0;
		for (int i = 0; i < name.length(); i++) {
			points = points + check(name.substring(i, i + 1));
		}
		return points;
	}

	public static int check(String a) {
		switch (a) {
		case "E":
			return 1;
		case "M":
			return 3;
		case "H":
			return 5;
		default:
			return 0;
		}

	}
}
