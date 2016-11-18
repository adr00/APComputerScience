package November.Lesson29;
public class Lesson_29_Activity_Two {
    public static String [] list = {};
    public static void main(String[] args){
    String words [] = {"avalanche", "budget", "cannot", "center", "meaning", "clear", "furniture", "deep", "piccolo", "friendly", "potatoes"};
int c = 0;
for(int i = 0; i < words.length; i++) { 
    if (words[i].substring(0,3).indexOf('o') >= 0)
        c++;
}
System.out.println( c );

    }
}

