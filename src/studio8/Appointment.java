package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment 
{
	private Date date;
	private Time time;
	
	public Appointment(Date date, Time time)
	{
		this.date = date;
		this.time = time;
	}
	
	public String toString()
	{
		return this.date + " " + this.time;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Date date1 = new Date(2, 9, 2003, false);
		Date date2 = new Date(2, 9, 2003, false);
		Date date3 = new Date(2, 9, 2013, false);
		Date date4 = new Date(25, 12, 2020, true);
		Date date5 = new Date(7, 4, 2023, false);
		
		Time time1 = new Time(11, 59, false);
		Time time2 = new Time(3, 45, false);
		Time time3 = new Time(7, 25, false);
		Time time4 = new Time(8, 55, false);
		Time time5 = new Time(6, 10, false);
				
		Appointment app1 = new Appointment(date1, time1);
		Appointment app2 = new Appointment(date2, time2);
		Appointment app3 = new Appointment(date3, time3);
		Appointment app4 = new Appointment(date4, time4);
		Appointment app5 = new Appointment(date5, time5);
		
		//System.out.println(app1);
		
		LinkedList<Appointment> list = new LinkedList<Appointment>();
		
		list.add(app1);
		list.add(app2);
		list.add(app3);
		list.add(app4);
		list.add(app5);
		
		System.out.println(list);

	}

}
