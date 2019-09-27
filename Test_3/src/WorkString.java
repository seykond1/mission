import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class WorkString {
	
	public static void main(String[] args)
    {
		ArrayList<String> mWordList= new ArrayList<>();
		
		System.out.println("Введите предложение: ");
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String ch = "";
		
        if(str.length() != 0)
        {
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ' '){
                    if(ch != "") mWordList.add(ch);
                    ch = "";
                }
                else ch += str.charAt(i);
                
            }
            if(ch != "") mWordList.add(ch);
            
            int i = 0;
            for (String obj : mWordList) {
            	
            	obj = (obj.substring(0, 1).toUpperCase() + obj.substring(1).toLowerCase());
            	mWordList.set(i, obj);
            	
            	//System.out.println(mWordList.get(i));
            	i++;
            }
            mWordList.forEach(action -> System.out.println(action));
        }
        System.out.println(mWordList.size());
        
        
        
        
         
    }
}
