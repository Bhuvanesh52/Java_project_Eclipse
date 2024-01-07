package Bus_Booking_source;

public class Bus_db {
	int Bus_number;//unique
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
					Price[i]+=50;//50 for Ac
				}
			}
		}
		this.price=Price;
	}
	public int[] get_price()
	{
		return this.price;
	}
	
	public void Get_details_of_bus()
	{
		System.out.print(this.Bus_number+"\t"+this.capacity+"\t\t"+this.Sleeper+"\t"+this.Sheeter+"\t"+this.AC+"\t");
		if(this.Sleeper && this.Sheeter)
		{
			System.out.print(this.price[0]+"\t\t"+this.price[1]+"\t\t");
		}else {
		System.out.print(this.Sleeper?this.price[0]+"\t\t":0 +"\t\t");
		System.out.print(this.Sheeter?this.price[0]+"\t\t":0 +"\t\t");
		}
		System.out.println(this.path[0]+" - "+this.path[1]);
	}
	
}
