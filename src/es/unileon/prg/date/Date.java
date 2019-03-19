package es.unileon.prg.date;
public class Date {

	private int _year=1;
	private int _month=1;
	private int _day=1;
	
	public Date(int year, int month, int day) {
		_year=year;
		if (month > 0 && month<=12){
			_month=month;
		}
		switch (_month){
			case 2:{
				if(day<=28){
					_month=month;
				}
			}
			case 1:		//next
			case 3:		//next
			case 5:		//next
			case 7:		//next
			case 8:		//next
			case 10:	//next
			case 11:{
				if (day<=31){
					_month=month;
				}
			}
			default:{
				if (day<=30){
					_month=month;
				}
			}
			
		}
	}

}
