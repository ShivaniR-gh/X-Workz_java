class  Holiday{
static String holiday;
static int number;
public static boolean getHoliday(String holidayReason,int numberOfDays){
boolean isHoliday=true;
boolean isNumberOfDays=false;
boolean approveHoliday=false;

if(holidayReason !=null){
holiday=holidayReason;
isHoliday=true;
}

if (numberOfDays != 0){
number =numberOfDays;
isNumberOfDays=true;
}

if(isHoliday == true && isNumberOfDays == true){
approveHoliday=true;
}

return  approveHoliday;
}
public static void getHolidayInfo(){
System.out.println("The reason for the holiday is " + holiday );
System.out.println("The number of days holiday neede is " +number);
}
} 



	
       

