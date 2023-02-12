package javaPackage;

public class Practice5 {

	public static void main(String[] args) {
		
		String str = "hydrabad";
		  char[] inp = str.toCharArray();
		  //System.out.println("Duplicate Characters are:");
		  //for (int i = 0; i < str.length(); i++) {
		   //for (int j = i + 1; j < str.length(); j++) {
		    //if (str.charAt(i) == str.charAt(j)) {
		     //System.out.println(str.charAt(j));
		     //break;
		    //}
		   //}
		  //}
		  int count=1;
		  for(int i=0;i<inp.length;i++) {
			  char ch =inp[i];
			  for(int j=i+1;j<inp.length;j++) {
				  if(inp[j]!=ch) {
					  continue;
				  }
				  count++;
			  }
			  System.out.println(ch+""+count);
		  }
	}

}
