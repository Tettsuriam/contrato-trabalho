package Entitis;

import java.util.Date;

public class HourContracts {
	private Date date;
	private Double valueForHour;
	private Integer hour;
	
	public HourContracts(Date date, Double valueForHour, Integer hour) {
		this.date = date;
		this.valueForHour = valueForHour;
		this.hour = hour;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValueForHour() {
		return valueForHour;
	}

	public void setValueForHour (Double valueForHour) {
		this.valueForHour = valueForHour;
	}

	public Integer getHour() {
		return hour ;
	}

	public void setHour(Integer hour){
		this.hour = hour;
	}
	
	public double totalValue () {
		double hev = valueForHour*hour;
		return hev;
	}


}
