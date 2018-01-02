public class OpenResponse4Test2 {
	
	public static void breakString(String s, int length) {
		int start = 0;
		int stop = 0;
		int index = 0;
		do {
			if(s.charAt(index) == ' ') {
				stop = index;
				String result = s.substring(start,stop);
				start = stop+1;
				if(result.length() < length && result.length() > 0 ){
				    System.out.println(result);
				}
			}
			index++;
		}while(index <= s.length()-1);
	}
	
	public static void main(String args[]) {
		breakString("THIS IS JUST A tEsT lMAo         geeez lol ",5);
	}
}
