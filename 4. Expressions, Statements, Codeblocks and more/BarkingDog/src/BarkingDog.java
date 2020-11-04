public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        // we have to wake up if dog barks before 8 or after 22 in that case barking is true
        // if hourOfDay parameter is smaller than 0 or greater than 23 return false
        //barking = false;
        if (barking && hourOfDay < 0 || hourOfDay > 23) {
            return false;
        } else if (barking && hourOfDay < 8 || hourOfDay > 22) {
            return true;
        } else {
            return false;
        }


    }
}