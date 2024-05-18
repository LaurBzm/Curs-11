
    import java.time.DayOfWeek;
    import java.util.*;
    import java.util.TreeSet;
    import java.util.Comparator;
    import java.util.Objects;

    public class weekdays {
        public enum Weekday {
            LUNI, MARTI, MIERCURI, JOI, VINERI, SAMBATA, DUMINICA;
        }

        public Weekday[] getDays() {
            boolean weekend = true;
            if (weekend){
                return Weekday.values();
            } else {
                return Weekday.values();
            }
        }
    }
    public List< DayOfWeek > getDays() {
        weekdays weekend = new weekdays();
        List<DayOfWeek> weekdays = List.of();
        return weekdays ;
    }


    Set<DayOfWeek> getDays(String flag )
    {
        if ( flag.equalsIgnoreCase( "weekdays" ) )     {
            return EnumSet.of(DayOfWeek.MONDAY , DayOfWeek.TUESDAY , DayOfWeek.WEDNESDAY ,DayOfWeek.THURSDAY , DayOfWeek.FRIDAY , DayOfWeek.SATURDAY, DayOfWeek.SUNDAY);
        } else    {
            return EnumSet.of(DayOfWeek);
        }
    }

    public void main() {
    }

    private DayOfWeek DayOfWeek;

    public class ProgramDays {

        public enum Days{
            Sunday(0), Monday(1), Tuesday(2), Wednesday(3), Thursday(4), Friday(5), Saturday(6);

            private int value;


            private Days(int value){
                this.value=value;
            }
        }

        public static void main(String[]args){


            String[]hours = {"00 - 06", "07 - 12", "12 - 18", "18 - 24"};

            Scanner input = new Scanner(System.in);


            for(Days day :Days.values()){
                System.out.print(day);
            }


            System.out.println("Introducere zi: ");

            String day = input.nextLine();


            Days d;

            d = Days.valueOf("Monday");
            d = Days.valueOf("Tuesday");
            d = Days.valueOf("Wednesday");
            d = Days.valueOf("Thursday");
            d = Days.valueOf("Friday");
            d = Days.valueOf("Saturday");
            d = Days.valueOf("Sunday");


            for (int counter = 0; counter < hours.length; counter++)
                System.out.print("Ore somn/munca/relaxare " +day+ ": " +hours[counter]);

        }
    }



    public static class Activity {

        public long startHour;
        public long endHour;

        public static final int MAX_SIZE = 10;

        public static TreeSet<Activity> activities = new TreeSet<>(new Comparator<Activity>() {
            @Override
            public int compare(Activity o1, Activity o2) {
                return Long.compare(o1.startHour, o2.startHour);
            }
        });

        public boolean intersect(Activity activity) {
            return (activity.startHour >= this.startHour && activity.startHour < this.endHour)
                    || (this.startHour >= activity.startHour && this.startHour < activity.endHour);
        }

        @Override
        public String toString() {
            return "start: " + startHour + ", end: " + endHour;
        }

        @Override
        public int hashCode(){
            return Objects.hash(startHour, endHour);
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;

            Activity other = (Activity) object;

            return (startHour == other.startHour) && (endHour == other.endHour);
        }

        public static void addActivity(Activity aActivity)
        {
            if (activities.size() >= MAX_SIZE) {
                System.out.println("The activities database is full");
                return;
            }

            for (Activity a : activities) {
                if (a.intersect(aActivity)) {
                    System.out.println(String.format("Activity", a, aActivity));
                    return;
                }
            }
            activities.add(aActivity);
        }


        public static void main(String[] args) {

            Activity a1 = new Activity();

            a1.startHour = 00;
            a1.endHour = 06;

            Activity b1 = new Activity();

            b1.startHour =06;
            b1.endHour = 12;

            Activity b2 = new Activity();

            b2.startHour = 12;
            b2.endHour = 18;

            Activity b3 = new Activity();
            b3.startHour = 18;
            b3.endHour = 24;

            addActivity(a1);
            addActivity(b1);
            addActivity(b1);
            addActivity(b2);
            addActivity(b3);

            System.out.println(activities);
        }
    }

