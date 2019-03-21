package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" + " Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
	//A method that checks if the day of the month is right
		switch(month){
			case 2:{
				if(day < 1 || day > 28){
					throw new DateException("Día " + day + " no valido" + " Valores posibles entre 1 y 28.");
				}
				else{
					this.day = day;
				}
			}
			case 1:		//next
			case 3:		//next
			case 5:		//next
			case 7:		//next
			case 8:		//next
			case 10:	//next
			case 12:{
				if(day < 1 || day > 28){
					throw new DateException("Día " + day + " no valido" + " Valores posibles entre 1 y 31.");
				}
				else{
					this.day = day;
				}
			}	
			case 4:		//next
			case 6:		//next
			case 9:		//next
			case 11:{
				if(day < 1 || day > 28){
					throw new DateException("Día " + day + " no valido" + " Valores posibles entre 1 y 30.");
				}
				else{
					this.day = day;
				}
			}	
			
		}
	}
	//A method that prints the season of this month
	public void printSeasonMonth(){
		String season = "";
		switch(month){
			case 1:		//next
			case 2:		//next
			case 3:
				season = "Invierno";
			case 4:		//next
			case 5:		//next
			case 6:
				season = "Primavera";
			case 7:		//next
			case 8:		//next
			case 9:
				season = "Verano";
			case 10:	//next
			case 11:	//next
			case 12:
				season = "Otoño";
		}
		System.out.println(season);
	}
	//A method that prints the name of the month
	public void printNameMonth() {
		String monthToPrint="";
		switch(month){
		case 1:
			monthToPrint = "Enero";
		case 2:
			monthToPrint = "Febrero";
		case 3:
			monthToPrint = "Marzo";
		case 4:
			monthToPrint = "Abril";
		case 5:
			monthToPrint = "Mayo";
		case 6:
			monthToPrint = "Junio";
		case 7:
			monthToPrint = "Julio";
		case 8:
			monthToPrint = "Agosto";
		case 9:
			monthToPrint = "Septiembre";
		case 10:
			monthToPrint = "Octubre";
		case 11:
			monthToPrint = "Noviembre";
		case 12:
			monthToPrint = "Diciembre";
		}
		System.out.println(monthToPrint);
	}
	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
	//For a date, print the months left until the end of the year.
	public void printMonthsLeft(){
		for(int i=this.month;i<=12;i++){}
	}
}
