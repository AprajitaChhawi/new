package aprajita1;
import java.io.*;

public class Bricks_game {
	public static void main(String args[])throws Exception

	{

	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	int t,i;

	t=Integer.parseInt(br.readLine());


	{
	for(i=1;i<=100;i++)
	{
	t=t-i;
	if(t<=0)
	{
	System.out.print("Patlu");
	break;
	}
	else{
	t=t-(2*i);
	if(t<=0)
	{
	System.out.println("Motu"); 
	break;
	}
	  else 
	 continue;
	}
	}}}

}
