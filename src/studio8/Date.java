package studio8;

import java.util.LinkedList;
import java.util.Objects;
import java.util.*;

public class Date 
{
	private int day;
	private int month;
	private int year;
	private boolean isHoliday;
	
	public Date(int day, int month, int year, boolean isHoliday)
	{
		this.day = day;
		this.month = month;
		this.year = year;
		this.isHoliday = isHoliday;
	}
	
	public String toString()
	{
		return this.month + "/" + this.day + "/" + this.year;
	}


    @Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	public static void main(String[] args) 
    {
		Date date1 = new Date(2, 9, 2003, false);
		Date date2 = new Date(2, 9, 2003, false);
		Date date3 = new Date(2, 9, 2023, false);
		Date date4 = new Date(12, 25, 2003, true);
		Date date5 = new Date(7, 4, 2003, false);
		System.out.println(date1.equals(date2));
		
		LinkedList<Date> list = new LinkedList<Date>();		//LinkedList includes duplicates
		
		list.add(date1);
		list.add(date2);
		list.add(date3);
		list.add(date4);
		list.add(date5);
		
		System.out.println(list);
		
		HashSet<Date> set = new HashSet<Date>();		// HashSet does not include duplicates
		
		set.add(date1);
		set.add(date2);
		set.add(date3);
		set.add(date4);
		set.add(date5);
		
		System.out.println(set);

    }

}
