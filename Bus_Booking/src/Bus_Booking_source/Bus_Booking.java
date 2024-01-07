package Bus_Booking_source;

public class Bus_Booking {
	String Passenger_name;
	String passenger_mobile_number;
	String pick,drop;
	int bus_Number;
	int paid_Amount;
	Bus_Booking(String Passenger_name,String Passenger_mobile,String Pick,String drop,int bus_number2,int paid_amount)
	{
		this.Passenger_name=Passenger_name;
		this.passenger_mobile_number=Passenger_mobile;
		this.pick=Pick;
		this.drop=drop;
		this.bus_Number=bus_number2;
		this.paid_Amount=paid_amount;
	}
	
}
