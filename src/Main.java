public class Main {
    public static void main(String[]args){
        String s=" z  --abc  67876 ..cba Z";
        s=s.replaceAll("[^A-Za-zА-Яа-я0-9]","");
        if(s.toLowerCase().equals((new StringBuilder(s)).reverse().toString().toLowerCase()))
            System.out.println("Палиндром! "+s);
        else
            System.out.println("Не палиндром! :( "+s);
    }
}
