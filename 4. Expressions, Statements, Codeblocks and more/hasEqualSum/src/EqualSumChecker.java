public class EqualSumChecker {

    public static boolean hasEqualSum(int firstParam, int secondParam, int thirdParam){

        int sum = firstParam + secondParam;
        if ( sum == thirdParam){
            return true;
        }else {
            return false;
        }
    }
}
