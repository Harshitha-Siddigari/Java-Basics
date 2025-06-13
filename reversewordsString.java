package javaproject1;

public class reversewordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String stmt="my name is bob";
		System.out.println(stmt);
		String[] words=stmt.split(" ");
		String reverse=" ";
		for(int i=words.length-1;i>=0;i--) {
			reverse+=words[i];
			if (i!=0) {
				reverse+=" ";
			}
		}
		System.out.println(reverse);

	}

}
