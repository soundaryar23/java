class NetFlix{
static String top10Movies[] = {"Gangs of Godavari", "Lapata ladies", "article370", "Shaitaan", "Crew", "safe house", "Bade Miyan Chote Miya", "under Paris", "focus", "spider-man"};
static String hindiMovies[] = {"Dunki", "jawan", "OMG", "Darlings", "GanguBai", "shehazada", "khufiya", "GumRaah", "Bhakshak", "Mimi", "83", "mili", "Hit", "Bulbul", "Major", "Jersey", "Queen", "Ok Jaanu", "Dhak Dhak", "Talaash", "Sanju", "Om shanti om", "Malang", "Malaal", "Raees"};
public static void main(String[] ottPlatform){
String englishSeries[] = {"Bridgerton", "Money Heist", "my demon", "vampire dairy", "king land", "Hidden Love", "never Have i Ever", "She", "Friends", "suits", "Lucifer", "anyone but you", "love at first sight", 
"Beast", "johhny english", "the english patient", "purple hearts", "NowHere", "Red Notice", "under paris", "man vs bee", "Bad boys", "After everything", "no hard feelings", "the notebook"};
String koreanSeries[] = {"hierarchy", "queen of tears", "destined with you", "my demon", "crash course", "Hidden love", "frankly speaking", "a time called you", "true beauty", "crash landing on you",
 "see you in next life", "celebrity", "behind your touch", "first love", "mask girl", "little women", "castway diva", "my holo love", "doctor chaa", "the glory"};
 
 
 
 System.out.println("the top 10 movies in netflix are:- \n");
for( String movie:top10Movies)
{
	System.out.println(movie);
}
 System.out.println("the list of hindi movies:- \n");
 for( String hindi:hindiMovies)
{
	System.out.println(hindi);
}
 System.out.println("the list of english series are:-");
  for( String english:englishSeries)
{
	System.out.println(english);
}
 System.out.println("the list of korean series are:- \n");
  for( String korean:koreanSeries)
{
	System.out.println(korean);
}
} 
}