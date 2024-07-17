class SportsMania{

static String iplTeamNames[]={"Royal Challengers Bengaluru", "Chennai Super Kings", "Mumbai Indians", "Kolkata Knight Riders", "Sunrises Hyderabad", "Rajastan Royals", 
"Delhi Capitals", "Gujarat Titans", "Lucknow Super Giants", "Punjab Kings"};
static String top10Bowlers[]={"Piyush chawla", "Dwayne Bravo", "Bhuvneshwar", "Sunil Narine", "Ravichandran Ashwin", "Amit Mishra", "Lasith Malinga", "jasprit Bumrah",
"Ravindra Jadeja", "Umesh Yadav"};
static String top10Batsman[]={"Virat Kohli", "Ruturaj Gaikwad", "Riyan Parag", "Travis Head", "Sanju Samson", "Sai Sudharshan", "KL Rahul", "Nicholas Pooran", "Sunil Narine",
"Abhishek Sharma"};
static String iccTeamNames[]={"Australia", "Bangladesh", "England", "India", "New Zealand", "South Africa", "Pakistan", "SriLanka", "West Indies", "Zimbabwe", "Bermuda",
"canada", "Ireland", "kenya", "Netherlands", "scotland", "Hong KOng", "Namibia", "Denmark", "Bahamas"};
public static void main(String[] ipl){

System.out.println("the name of ipl teams are:- \n");
for(int i=0;i <iplTeamNames.length ;i++) 
	  {
		 System.out.println(iplTeamNames[i]);
  
	  } 
System.out.println("the name of top 10 bowlers are:- \n");
for(int j=0;j<top10Bowlers.length;j++)
{
			 System.out.println(top10Bowlers[j]);

}
System.out.println("the name of top 10 batsman  are:- \n");
for( int i=0;i<top10Batsman.length;i++)
{
	System.out.println(top10Batsman[i]);
}
System.out.println("the name of icc teams are:- \n");

for( int icc=0;icc<iccTeamNames.length;icc++)
{
	System.out.println(iccTeamNames[icc]);
}
}


}