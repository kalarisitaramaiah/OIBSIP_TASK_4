import java.net.SocketPermission;
import java.util.*;
class onlineexamportal
{
	Scanner sc = new Scanner(System.in);
	HashMap<String,Integer> info = new HashMap<String,Integer>();
	public void login()
	{
		info.put("Aviraj",204055);
		info.put("mahidhar",204035);
		info.put("ramasai",204051);
		info.put("yaswanth",204082);
		info.put("vamsi",204073);
    info.put("Raj_kumar",204016);

		String id;
		int pwd;
        System.out.println("**** Welcome to OASIS INFOBYTE ****");
		System.out.println("LOGIN");
		System.out.println("Enter Username:");
		id = sc.next();
		System.out.println("Enter Passoword:");
		pwd = sc.nextInt();
		if(info.containsKey(id) && info.get(id)==pwd)
		{
			System.out.println("\nLogin successful!");
			menu();
		}
		else
		{
			System.out.println("\nInvalid Username or Password.\nTry again!!!\n");
			login();
		}
	}
	public void menu()
	{
		int ch;
		System.out.println("\nEnter your Choice:");
		System.out.println("1.Update profile \n2.Start Exam \n3.Logout");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				info = update();
				menu();
				break;
			case 2:
				startExam();
				menu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Wrong choice!!! Choose correct choice");
		}
	}
	public HashMap<String,Integer> update()
	{
		String update_id;
		int update_pwd;
		System.out.println("Enter Username:");
		update_id = sc.next();
		System.out.println("Enter Old Password:");
		update_pwd = sc.nextInt();
		if(info.containsKey(update_id) && info.get(update_id)==update_pwd)
		{
			System.out.println("Enter New Password:");
			update_pwd = sc.nextInt();
			info.replace(update_id,update_pwd);
			System.out.println("Password Changed Successfully!!!");
		}
		else
		{
			System.out.println("User not found.\n");
		}
		return info;
	}
	public void startExam()
	{
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 30;
		int score = 0,ans;
		System.out.println("Welcome to Oasis inforbyte quiz !!!");
		while(System.currentTimeMillis()<endTime)
		{
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q1.Who is the father of comput?");
			System.out.println("1.Dennis Ritchie \t2.Charles Babbage \t3.Bill Gates \t4.James Gosling");
			System.out.print("Enter Option: ");
			ans = sc.nextInt();
			if(ans == 2)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q2.What is know as temporary memory or volatile memory ?");
			System.out.println("1.SSD \t2.HDD \t3.RAM \t4.ROM ");
			System.out.print("Enter Option: ");
			ans = sc.nextInt();
			if(ans == 3)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q3.What is Half Byte called ?");
			System.out.println("1.Nibble \t2.Bit \t3.KiloByte \t4.none");
			System.out.print("Enter Option: ");
			ans = sc.nextInt();
			if(ans == 1)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q4.How many generations are computers currently classified ?");
			System.out.println("1.Six\t2.Four \t3.Five\t4.Two");
			System.out.print("Enter Option: ");
			ans = sc.nextInt();
			if(ans == 3)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------");
			System.out.println("Q5.Integrated circuits used in computers were developed using which of the following materials ?");
			System.out.println("1.Silver\t2.Copper\t3.Gold\t4.Silicon");
			System.out.print("Enter Option: ");
			ans = sc.nextInt();
			if(ans == 4)
				score+=5;
			else
				score--;
			System.out.println("-------------------------------------------------------------");
			break;
		}
		System.out.println("Exam Finished!!!");
		System.out.println();
		System.out.println("Your Score is "+score);
		if(score>10)
			System.out.println("Congratulations you passed!!!");
		else
			System.out.println("Better Luck Next Time!!!");
	}
	public static void main(String args[])
	{
		onlineexamportal obj  = new onlineexamportal();
		obj.login();
	}
}
