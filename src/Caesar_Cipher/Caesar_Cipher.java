package Caesar_Cipher;
import java.lang.StringBuffer;
import java.util.Scanner;

public class Caesar_Cipher {
	static String encrypt(String s, int key){
		String alphabets="ABCDEFGHIJKLMNOPQRSTUVWXTZ";
		String shifted=alphabets.substring(key)+alphabets.substring(0, key);
		StringBuffer input=new StringBuffer(s);
		for(int i=0;i<input.length();i++){
			char newChar=input.charAt(i);
			int idx=alphabets.indexOf(newChar);
			if(idx!=-1){
			char c=shifted.charAt(idx);
			input.setCharAt(i,c);
			}
		}
		return input.toString();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int n=sc.nextInt();
		String encrypted=encrypt(s,n);
		System.out.println(encrypted);
	}

}
