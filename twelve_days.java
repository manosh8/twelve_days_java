import java.util.Scanner;

class TwelveDays {
    public TwelveDays() {
    }
    String verse(int verseNumber) {
        String[] verseOrder = {"first", "second", "third", "fourth",
                "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};
        String[] variations = {"a Partridge in a Pear Tree.\n", "two Turtle Doves, and ",
                "three French Hens, ", "four Calling Birds, ", "five Gold Rings, ", "six Geese-a-Laying, ",
                "seven Swans-a-Swimming, ", "eight Maids-a-Milking, ", "nine Ladies Dancing, ",
                "ten Lords-a-Leaping, ", "eleven Pipers Piping, ", "twelve Drummers Drumming, ", };
        String verseBegin = "On the " + verseOrder[verseNumber - 1] + " day of Christmas my true love gave to me: ";
        String verseEnd = "";
        for (int i = verseNumber - 1; i >= 0; i--) {
            verseEnd += variations[i];
        }
        return verseBegin + verseEnd;
    }
    String verses(int startVerse, int endVerse) {
        String song = "";
        for (int i = startVerse; i <= endVerse; i++) {
            song += verse(i);
            if(i != endVerse)
                song += "\n";
        }
        return song;
    }

    String sing() {
        return verses(1, 12);
    }
}

public class twelve_days
{
    public static void main(String[] args) {
        TwelveDays td = new TwelveDays();
        Scanner sc =new Scanner(System.in);
        int verseNumber = sc.nextInt();
        int startVerse =  sc.nextInt();
        int endVerse = sc.nextInt();
        System.out.println(td.verse(verseNumber));
        System.out.println(td.verses(startVerse,endVerse));
        System.out.println(td.sing());

    }
}

