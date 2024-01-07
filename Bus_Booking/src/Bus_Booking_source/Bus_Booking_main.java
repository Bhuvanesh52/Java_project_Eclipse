package Bus_Booking_source;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bus_Booking_main {

	public static void main(String[] args) {
		List<Bus_Booking> passanger_Store=new ArrayList<Bus_Booking>();
		List<Bus_db> Bus_Store=new ArrayList<Bus_db>();
		//bus_no,Capacity,Sleeper_ava,Sheeter_ava,Ac_ava,Sleeper price,Sheeter_price Departure & Destination
		Bus_Store.add(new Bus_db(1,3,true,true,true,new int[] {300,200},new String[] {"Madurai","Chennai"}));
		Bus_Store.add(new Bus_db(1,2,false,true,false,new int[] {250},new String[] {"Madurai","Chennai"}));
		
		Scanner get_data_by_user=new Scanner(System.in);
		
		int User_opt=0;
		while(User_opt!=3)
		{	
			System.out.println("1.Booking\n2.Search\n3.Exit\n");
			User_opt=get_data_by_user.nextInt();
			if(User_opt==1)//booking
			{
				System.out.println("Booking.......");
				
			}else if(User_opt==2)//Search
			{
				int Search_By=0;
				while(Search_By!=3)
				{
				System.out.println("Search by \n1.Departure\n2.Bus_Number\n3.Exit\n");
				Search_By=get_data_by_user.nextInt();
				if(Search_By==1)
				{	
					
					get_data_by_user.nextLine();//for overlap string
					String Departure,Destiny;
					System.out.println("Enter your Departure");
					Departure=get_data_by_user.nextLine();
					System.out.println("Enter your Destiny");
					Destiny=get_data_by_user.nextLine();
					System.out.println("Bus_no\tcapacity\tSleeper\tSheeter\tAC\tSleeper price\tSheeter Price\tDeparture & destintion");
					for(Bus_db bus_db:Bus_Store)
					{
						if(bus_db.path[0].equals(Departure) && bus_db.path[1].equals(Destiny))
						{
							bus_db.Get_details_of_bus();
						}
					}
					
				}else if(Search_By==2)
				{
					
					int Bus_Num=0;
					System.out.println("Enter your Bus_Number");
					Bus_Num=get_data_by_user.nextInt();
					System.out.println("Bus_no\tcapacity\tSleeper\tSheeter\tAC\tSleeper price\tSheeter Price\tDeparture & destintion");
					for(Bus_db bus_db:Bus_Store)
					{
						if(bus_db.Bus_number == Bus_Num)
						{
							bus_db.Get_details_of_bus();
						}
					}
				}
				
				}
			}
			
		}
		System.out.println("See you bye bye.....");
		
		
	}

}
 