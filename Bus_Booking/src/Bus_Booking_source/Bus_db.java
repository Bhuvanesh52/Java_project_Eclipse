package Bus_Booking_source;

public class Bus_db {
	int Bus_number;
	boolean Sleeper,Sheeter,AC;
	String path[];
	int price[];
	int capacity;
	Bus_db(int Bus_Number,int Capacity,boolean Sleeper,boolean Sheeter,boolean Ac,int Price[],String path[])
	{
		this.Bus_number=Bus_Number;
		this.capacity=Capacity;
		this.Sleeper=Sleeper;
		this.Sheeter=Sheeter;
		this.AC=Ac;
		this.path=path;
		if(Ac)
		{
			for(int i=0;i<Price.length;i++)
			{
				if(Price[i]!=0)
				{
					Price[i]+=50;
				}
			}
		}
		this.price=Price;
	}
}
