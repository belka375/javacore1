package hw10;

public class Calendar {
    private String[] months;
    private String day;
    private int year;

    public Calendar() {
    }

    public Calendar(String[] months, String day, int year) {
        this.months = months;
        this.day = day;
        this.year = year;
    }


    public void setMonths(String[] vacationMonths) {
        this.months = vacationMonths;
    }

    public void setDay(String holiday) {
        this.day = holiday;
    }

    public void setYear(int currentYear) {
        if (currentYear != 2019) {
            System.out.println("Error. Now is 2019");
        }
        this.year = 2019;
    }

    public String getMonths() {
        String months = "";
        for (String str : this.months) {
            if (months != "") {
                months += ", ";
            }
            months += str;

        }
        return months;
    }

    public String getDay() {
        return this.day;
    }

    public int getYear() {
        return this.year;
    }

    public void printVacationCalendar() {
        System.out.println("Next holiday: " + day + "\nPreferred months for vacations in " + year + ": ");
        for (String vacationMonths : months) {
            System.out.print(vacationMonths + "\n");
        }
    }
}



