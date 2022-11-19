package example.bean;

public class Movie {
		private int movieNumber;
		private String title;//Instance Variable
		private String genre;
		private int year;
		//private float length; //In hours
		
		
		public Movie() { //This is a no-argument constructor
			//Initializing the fields
					movieNumber= 5657;
					title = "Life of Pi";
					genre = "Emotional";
					year = 2012;
					//length = 2.54f;
		}
		
		

		

		public Movie(int movieNumber, String title, String genre, int year) {
			super();
			this.movieNumber = movieNumber;
			this.title = title;
			this.genre = genre;
			this.year = year;
		}





		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getGenre() {
			return genre;
		}
		public void setGenre(String genre) {
			this.genre = genre;
		}
		public int getYear() {
			return year;
		}
		public void setYear(int year) {
			this.year = year;
		}

		public int getMovieNumber() {
			return movieNumber;
		}

		public void setMovieNumber(int movieNumber) {
			this.movieNumber = movieNumber;
		}
		
		

	}



