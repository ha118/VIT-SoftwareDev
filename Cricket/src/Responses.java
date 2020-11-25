import java.util.*;

public class Responses {
	
	
	public static void main(String[] args)
	{
		class shot
		{
			String s1,s2,s3,s4,s5;	
		
		}
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int runs=0;
		int rolb=0;
		String CBall="";
		HashMap<String,shot> pshots=new HashMap<String,shot>();
		
		shot sh1=new shot();
		sh1.s1="Defend";sh1.s2="Run";sh1.s3="Run Fast";sh1.s4="Square Cut";sh1.s5="Helicopter";
		shot sh2=new shot();
		sh2.s1="Defend";sh2.s2="Run";sh2.s3="Straight Drive";sh2.s4="Square Cut";sh2.s5="Hook";
		shot sh3=new shot();
		sh3.s1="Defend";sh3.s2="Run";sh3.s3="Cover Drive";sh3.s4="Pull";sh3.s5="Helicopter";
		shot sh4=new shot();
		sh4.s1="Defend";sh4.s2="Run";sh4.s3="On Drive";sh4.s4="Pull";sh4.s5="Hook";
		shot sh5=new shot();
		sh5.s1="Defend";sh5.s2="Run";sh5.s3="Cover Drive";sh5.s4="Pull";sh5.s5="Hook";
		shot sh6=new shot();
		sh6.s1="Defend";sh6.s2="Run";sh6.s3="On Drive";sh6.s4="Pull";sh6.s5="Helicopter";
		
		String[] slist= {"Full toss","Yorker","Out-swinger","In-swinger","Bouncer","Slower Ball"};
		Random rand = new Random();
		
		pshots.put("Full toss", sh1);
		pshots.put("Yorker", sh2);
		pshots.put("Out-swinger", sh3);
		pshots.put("In-swinger", sh4);
		pshots.put("Bouncer", sh5);
		pshots.put("Slower Ball", sh6);
		
		HashMap<String,Integer> ballmodi=new HashMap<>();
		HashMap<String,Integer> shotmodi=new HashMap<>();
		HashMap<String,Integer> shotrun=new HashMap<>();
		
		ballmodi.put("Full toss",4);
		ballmodi.put("Yorker",3);
		ballmodi.put("Out-swinger",3);
		ballmodi.put("Full toss",4);
		ballmodi.put("In-swinger",2);
		ballmodi.put("Bouncer",4);
		ballmodi.put("Slower Ball",2);
		
		shotrun.put("Defend",0);
		shotrun.put("Run",1);
		shotrun.put("Run Fast",2);
		shotrun.put("Cover Drive",2);
		shotrun.put("On Drive",2);
		shotrun.put("Straight Drive",2);
		shotrun.put("Square Cut",4);
		shotrun.put("Pull",4);
		shotrun.put("Hook",6);
		shotrun.put("Helicopter",6);
		
		shotmodi.put("Defend",5);
		shotmodi.put("Run",7);
		shotmodi.put("Run Fast",6);
		shotmodi.put("Cover Drive",7);
		shotmodi.put("On Drive",5);
		shotmodi.put("Straight Drive",6);
		shotmodi.put("Square Cut",7);
		shotmodi.put("Pull",8);
		shotmodi.put("Hook",7);
		shotmodi.put("Helicopter",8);
		
		while(n-->0)
		{
			System.out.println("Current runs: "+runs);
			System.out.println("Runs on last ball: "+rolb);
			CBall=slist[rand.nextInt(slist.length)];
			System.out.println("Current ball: "+CBall);
			System.out.println("");
			System.out.println("Possible Shots");
			
			double pro=((shotmodi.get(pshots.get(CBall).s1)-ballmodi.get(CBall))*100)/shotmodi.get(pshots.get(CBall).s1);
			System.out.println(pshots.get(CBall).s1+" - "+shotrun.get(pshots.get(CBall).s1)+" - "+pro+"%");
			
			pro=((shotmodi.get(pshots.get(CBall).s2)-ballmodi.get(CBall))*100)/shotmodi.get(pshots.get(CBall).s2);
			System.out.println(pshots.get(CBall).s2+" - "+shotrun.get(pshots.get(CBall).s2)+" - "+pro+"%");
			
			pro=((shotmodi.get(pshots.get(CBall).s3)-ballmodi.get(CBall))*100)/shotmodi.get(pshots.get(CBall).s3);
			System.out.println(pshots.get(CBall).s3+" - "+shotrun.get(pshots.get(CBall).s3)+" - "+pro+"%");
			System.out.println(pshots.get(CBall).s4+" - "+"");
			System.out.println(pshots.get(CBall).s5+" - "+"");
			System.out.println("");
			System.out.println("*********************************");
			System.out.println("");
			
		}
	}

}
