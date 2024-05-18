
    import java.time.DayOfWeek;
    import java.util.*;

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

