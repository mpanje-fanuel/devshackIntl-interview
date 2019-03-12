public class Main {

    public static void main(String[] args) {
        String left = "devshack";
        String right = "devshackIntl";
        System.out.println("============== CONVERT "+left+" into "+right+" ==============");
        System.out.println();
        System.out.println(WordDistanceCalc.minDistance(left, right, left.length(), right.length())+" Edits required");
        System.out.println();
        System.out.println("============== CONVERSION COMPLETE!==============");
    }
}
