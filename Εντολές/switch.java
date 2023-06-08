public class Main {
    public static void main(String[] args) {
        int day = 3;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Δευτέρα";
                break;
            case 2:
                dayName = "Τρίτη";
                break;
            case 3:
                dayName = "Τετάρτη";
                break;
            case 4:
                dayName = "Πέμπτη";
                break;
            case 5:
                dayName = "Παρασκευή";
                break;
            case 6:
                dayName = "Σάββατο";
                break;
            case 7:
                dayName = "Κυριακή";
                break;
            default:
                dayName = "Μη έγκυρη ημέρα";
                break;
        }

        System.out.println("Η ημέρα αντιστοιχεί στην " + dayName);
    }
}
