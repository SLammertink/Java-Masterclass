public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces( double x , double y ){

        double newX = x * 1000;
        double newY = y * 1000;

        newX = (int) newX;
        //System.out.println(newX);
        newY = (int) newY;
        //System.out.println(newY);
        if (newX - newY == 0) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }
}
