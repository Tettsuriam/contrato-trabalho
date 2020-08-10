package Application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import Entitis.Deparament;
import Entitis.HourContracts;
import Entitis.WorkLevel;
import Entitis.Worker;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		String departament;
		String name;
		String level;
		Double baseSalary;
		Integer numContr;
		Date contractDate;
		Double valueHour;
		Integer hour;
		String monthAndYear ;
		
		System.out.print("Enter with departamen's name: ");
		departament = sc.nextLine();
		System.out.print("\nEnter work data: ");
		System.out.print("\nName: ");
		name = sc.nextLine();
		System.out.print("\nLevel: ");
		level = sc.nextLine();
		System.out.print("\nBase Salary: ");
		baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(name, WorkLevel.valueOf(level), baseSalary, new Deparament(departament));
		
		System.out.print("\nHow many contracts?: ");
		numContr = sc.nextInt();
		
		for(int i =0; i<numContr; i++) {
			System.out.print("\nEnter with #"+(i+1)+" contracts");
			System.out.print("\nDate (DD/MM/YYYY): ");
			contractDate = sdf.parse(sc.next());
			System.out.print("\nValue per hour: ");
			valueHour = sc.nextDouble();
			System.out.print("\nDuration: ");
			hour = sc.nextInt();
			
			HourContracts contract = new HourContracts(contractDate,valueHour, hour);
			worker.AddContract(contract);
		}
		System.out.println();
		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		monthAndYear = sc.next();
		
		Integer month = Integer.parseInt( monthAndYear.substring(0, 2));
		Integer year = Integer.parseInt( monthAndYear.substring(3));
		
		System.out.print("\nname: "+worker.getName());
		System.out.print("\nDepartament: "+worker.getDepartament().getName());
		System.out.println("\nIcome for "+monthAndYear+": "+String.format("%.2f", worker.income(year, month)));
		
		
		sc.close();
	}

}
