class Movie {
	String title;
	String genre;         // instance variables or object knows
	int rating;
	
	void playIt() {                                    // a method or object does
		System.out.println("Playing the movie");
	}
}

class MovieTestDrive {
	public static void main(String[] args) {
		Movie one = new Movie();                  // make movie object one
		one.title = "Gone with the Stock";
		one.genre = "Tragic";
		one.rating = -2;
		Movie two = new Movie();                  // make movie object two
		two.title = "Lost in Cubicle Space";
		two.genre = "Comedy";
		two.rating = 5;
		two.playIt();
		Movie three = new Movie();                // make movie object three
		three.title = "Byte Club";
		three.genre = "Tragic but ultimately uplifting";
		three.rating = 127;
		
	}
}