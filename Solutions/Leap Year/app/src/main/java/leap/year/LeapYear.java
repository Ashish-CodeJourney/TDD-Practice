package leap.year;

public class LeapYear {

    public String isLeapYear(int year){
        if (year % 400 == 0) {
            return "This is a Leap Year";
        }
        else if(year % 100 == 0 && year % 400 != 0){
            return "This is Not a Leap Year";
        }
        else if (year % 4 == 0 && year % 100 != 0) {
            return "This is a Leap Year";
        }
        else if (year % 4 != 0) {
            return "This is Not a Leap Year";
        }
        else {
            return "Something is Wrong";
        }
    }
}
