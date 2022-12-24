class practice{
	public static void main(String args[]){
		int date=1;
		String day;
		switch(date){
			case 1:day="Sunday ";
			   break;
			case 2:day=" Monday";
			  break;
			case 3:day="Tuesday ";
				break;
			case 4:day=" Wednesday";
				break;
			case 5:day=" Thursday";
				break;
			case 6:day=" friday";
				break;
			case 7:day=" saturday";
				break;
			default :day=" out of range";
				break;
		}
		System.out.println(day);
	}
}