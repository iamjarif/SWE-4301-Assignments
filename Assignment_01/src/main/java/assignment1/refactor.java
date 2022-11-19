package assignment1;

public class refactor {

    public static class Calender {

        private int day;
        private int month;
        private int year;
        public Calender(int day, int month,int year)
        {
            this.day=day;
            this.month=month;
            this.year=year;
        }

        public int getDay() {
            return day;
        }

        public int getYear() {
            return year;
        }

        public int getMonth() {
            return month;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public void setYear(int year) {
            this.year = year;
        }

        public boolean monthWith30Days(int month) {
            if (month > 7 && month % 2 == 0) {
                return false;
            } else if (month < 7 && month % 2 != 0) {
                return false;
            } else
                return true;

        }
        public boolean monthWith31Days(int month) {
            if (month > 7 && month % 2 == 0) {
                return true;
            } else if (month < 7 && month % 2 != 0) {
                return true;
            } else
                return false;

        }

        public boolean isIt31stday(int day) {
            if (day == 31) {
                return true;
            } else
                return false;
        }

        public boolean isIt30thday(int day) {
            if (day == 30) {
                return true;
            } else
                return false;
        }

        public boolean isIt29thday(int day) {
            if (day == 29) {
                return true;
            } else
                return false;
        }

        public boolean isIt28thday(int day) {
            if (day == 29) {
                return true;
            } else
                return false;
        }

        public boolean februaryMonth(int month) {
            if (month == 2) {
                return true;
            } else
                return false;
        }

        public boolean decemberMonth(int month) {
            if (month == 12) {
                return true;
            } else
                return false;
        }


        public boolean leapYear(int year) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                return true;
            } else
                return false;
        }


        public String getNextDate(int day, int month, int year) {
            String string;
            int currentDay = day, currentMonth = month, currentYear = year;

            if (monthWith31Days(month)) {
                if (decemberMonth(month)) {
                    if (isIt31stday(day)) {
                        currentDay = 1;
                        currentMonth = 1;
                        currentYear++;
                    } else {
                        currentDay++;
                    }
                } else {
                    if (isIt31stday(day)) {
                        currentDay = 1;
                        currentMonth++;
                    } else {
                        currentDay++;
                    }
                }
            } else if (monthWith30Days(month)) {
                if (februaryMonth(month)) {
                    if (leapYear(year)) {
                        if (isIt29thday(day)) {
                            currentDay = 1;
                            currentMonth++;
                        } else {
                            currentDay++;
                        }
                    } else {
                        if (isIt28thday(day)) {
                            currentDay = 1;
                            currentMonth++;
                        } else {
                            currentDay++;
                        }

                    }

                } else {
                    if (isIt30thday(day)) {
                        currentDay = 1;
                        currentMonth++;
                    } else {
                        currentDay++;
                    }

                }
            }

            String date = "Next date: " + currentDay + "/" + currentMonth + "/" + currentYear;

            return date;
        }
    }
}
