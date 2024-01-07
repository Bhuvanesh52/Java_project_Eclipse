package Bus_Booking_source;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bus_Booking_main {

	public static void main(String[] args) {
		List<Bus_Booking> passanger_Store=new ArrayList<Bus_Booking>();
		List<Bus_db> Bus_Store=new ArrayList<Bus_db>();
		
		//bus_no,Capacity,Sleeper_ava,Sheeter_ava,Ac_ava,Sleeper price,Sheeter_price Departure & Destination
		
		Bus_Store.add(new Bus_db(1,2,true,true,true,new int[] {300,200},new String[] {"Madurai","Chennai"}));
		Bus_Store.add(new Bus_db(2,0,false,true,false,new int[] {250},new String[] {"Madurai","Chennai"}));
		
		try (Scanner get_data_by_user = new Scanner(System.in)) {
			int User_opt=0;
			while(User_opt!=3)
			{	
				System.out.println("1.Booking\n2.Search\n3.Exit\n");
				User_opt=get_data_by_user.nextInt();
				if(User_opt==1)//booking
				{	
					get_data_by_user.nextLine();
					System.out.println("Booking.......");
					String name,ph_no,Departure,Destiny;//--import---
					int price=0;//--import---
					int bus_number,sheet;
					while(true)
					{
					System.out.println("Enter name");
					name=get_data_by_user.nextLine();
					
					System.out.println("Enter mobile_no");
					ph_no=get_data_by_user.nextLine();
					
					System.out.println("Enter Departure");
					Departure=get_data_by_user.nextLine();
					
					System.out.println("Enter destiny");
					Destiny=get_data_by_user.nextLine();
					
					System.out.println("Bus_no\tcapacity\tSleeper\tSheeter\tAC\tSleeper price\tSheeter Price\tDeparture & destintion");
					Bus_db Temp_bus = null;
					for(Bus_db bus_db:Bus_Store)
					{
						if(bus_db.get_path()[0].equals(Departure) && bus_db.get_path()[1].equals(Destiny) && bus_db.get_capacity()!=0)
						{
							bus_db.Get_details_of_bus();
							Temp_bus=bus_db;
						}
					}
					if(Temp_bus==null)
					{
						System.out.println("No Bus Available");
						continue;
					}
					System.out.println("enter the bus number");
					bus_number=get_data_by_user.nextInt();			

					for(Bus_db bus_db:Bus_Store)
					{
						if(bus_number==bus_db.get_Bus_number() &&  bus_db.get_capacity()!=0)
						{
							int price_of[]=bus_db.get_price();
							if(bus_db.get_Sheeter() && bus_db.get_Sleeper())
							{
								System.out.println("1.sleeper price="+price_of[0]);
								System.out.println("2.sheeter price="+price_of[1]);
							}else {
								if(bus_db.get_Sheeter())
								{
									System.out.println("1.sheeter price="+price_of[0]);
								}
								if(bus_db.get_Sleeper())
								{
									System.out.println("1.sleeper price="+price_of[0]);
								}
							}
								System.out.println("Choose the sheet");

								int sheet_no=get_data_by_user.nextInt();
							
								if(bus_db.get_Sheeter() && bus_db.get_Sleeper())
								{
									if(sheet_no==1)
									{
										price=price_of[0];
									}else if(sheet_no==2)
									{
										price=price_of[1];
									}
								}else {
									if(bus_db.get_Sheeter())
									{
										price=price_of[0];
									}
									if(bus_db.get_Sleeper())
									{
										price=price_of[0];
									}
								}
						}
					}
					if(price==0)
					{
						System.out.println("mal_fucntion");
						continue;
					}
					break;
					}
					passanger_Store.add(new Bus_Booking(name,ph_no,Departure,Destiny,bus_number,price));
					
					for(Bus_db b_Store:Bus_Store)
					{
						if(b_Store.get_Bus_number()==bus_number)
						{
							b_Store.set_Bus_number();
						}
					}
					
					System.out.println("your booking is Done Happy journy....");
					
					
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
							if(bus_db.get_path()[0].equals(Departure) && bus_db.get_path()[1].equals(Destiny) && bus_db.get_capacity()!=0)
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
							if(bus_db.get_Bus_number() == Bus_Num && bus_db.get_capacity()!=0)
							{
								bus_db.Get_details_of_bus();
							}
						}
					}
					
					}
				}
				
			}
		}
		
		System.out.println("See you bye bye.....");
		
		
	}

}
 