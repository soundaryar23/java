class RedChilliesEntertainmentRunner{
	public static void main(String[] entertaining){
	System.out.println("main method started");
	boolean isAddedNew = RedChilliesEntertainment.addMovieActors("darshan");
	System.out.println("movie added "+isAddedNew);
	isAddedNew =   RedChilliesEntertainment.addMovieActors("Rachitha ram");
	System.out.println("movie added "+isAddedNew);
	isAddedNew =   RedChilliesEntertainment.addMovieActors("puneeth");
	System.out.println("movie added "+isAddedNew);
	isAddedNew =   RedChilliesEntertainment.addMovieActors("radhika");
	System.out.println("movie added "+isAddedNew);
	isAddedNew =   RedChilliesEntertainment.addMovieActors("yash");
	System.out.println("movie added "+isAddedNew);
	isAddedNew =   RedChilliesEntertainment.addMovieActors("dhruva");
	System.out.println("movie added "+isAddedNew);
	isAddedNew =   RedChilliesEntertainment.addMovieActors("suddep");
	System.out.println("movie added "+isAddedNew);
	isAddedNew =   RedChilliesEntertainment.addMovieActors("Ashika");
	System.out.println("movie added "+isAddedNew);
    isAddedNew =   RedChilliesEntertainment.addMovieActors("rakshith");
	System.out.println("movie added "+isAddedNew);
	RedChilliesEntertainment.addMovieActors("anish");
	RedChilliesEntertainment.getMovieActors();
	RedChilliesEntertainment.updateActor("darshan","nishvika");
	RedChilliesEntertainment.getMovieActors();
	boolean isDelete = RedChilliesEntertainment.deleteActor("puneeth");
		System.out.println(" is actor deleted "+isDelete);

	RedChilliesEntertainment.getMovieActors();

	System.out.println("main method ended");
	}
}