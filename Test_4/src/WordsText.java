import java.util.Scanner;
public class WordsText {
	public static void main(String[] args)
    {
		System.out.println("Введите предложение: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String ch = in.nextLine();;
        if((str.length() != 0) & (ch.length() != 0))
        {
        	str = str.substring(0).toLowerCase();
        	ch = ch.substring(0).toLowerCase();
        	int lastIndex = 0, flag=0;
        	while(lastIndex != -1){

        	    lastIndex = str.indexOf(ch,lastIndex);
        	    if(lastIndex != -1){
        	    	flag ++;
        	        lastIndex += ch.length();
        	    }
        	}
        	System.out.println("Найдено подстрок: " + flag);
        }
        
    }
}
