package Entitis;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
	private String name;
	private WorkLevel level;
	private Double baseSalary;
	
	private Deparament departament;
	private List<HourContracts> contracts = new ArrayList<>();
	public Worker() {
		
	}
	public Worker(String name, WorkLevel level, Double baseSalary, Deparament departament) {
		this.name = name;
		this.level = level;
		this.baseSalary = baseSalary;
		this.departament = departament;
	
	}
	public String getName () {
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public WorkLevel getLevel() {
		return level;
	}
	public void setLevel(WorkLevel level) {
		this.level = level;
	}
	public Double getBaseSalary() {
		return baseSalary;
	}
	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}
	public Deparament getDepartament() {
		return departament;
	}
	public void setDepartament(Deparament departament) {
		this.departament = departament;
	}
	public List<HourContracts> getContracts() {
		return contracts;
	}
	
	public void AddContract (HourContracts contract) {
		contracts.add(contract);
	}
	public void RemoveContract(HourContracts contract) {
		contracts.remove(contract);
	}
	
	public double income (int year, int month) {
		double soma = baseSalary;
		Calendar cal = Calendar.getInstance();
		for(HourContracts c : contracts) {
			
			cal.setTime(c.getDate());
			
			int c_year = cal.get(Calendar.YEAR);
			int c_month = 1+cal.get(Calendar.MONTH);
			
			if( year == c_year && month == c_month) {
				
				soma+= c.totalValue();
				System.out.println(c.totalValue());
			}
		}
		
		return soma;
	}

}
