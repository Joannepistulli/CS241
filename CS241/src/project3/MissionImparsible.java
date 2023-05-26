/*
Your Name: JOANNE PISTULLI
Pace Email: JP42377P@PACE.EDU
Is parse an online algorithm? Why or why not? 

A parser is a complier or interpreter component that breaks data into smaller elements
for easy translation into another language. A parser takes input in the form of sequence
tokens, interactive commands, or program instruction. In this case, parse would be an 
online algorithm due to it grabbing data and manipulating it as it goes

Given N tags. What is the runtime of parse? Why?
The runtime of parse would be O(n) because it is one for loop executing a bunch of
functions in a stack.
*/
package project3;

public class MissionImparsible {
	
	public static void main(String[] args) {
		
		// These are here as a reference, I will use different test cases. 
		String[] testCases = {
		"<html>\nThis is my awesome webpage!\n</html>\n", "<html>\n<body>\n<b>CS241</b> is awesome!\n</html>\n</body>\n", "<p><b>Here is some text!</b>",
		"<p><b><i>Italics and bold!</i>just bold</b></p>", "<tag_I_made_up>Professor Carmine!</tag_I_made_up>"
		};
		
		for (String test : testCases) { System.out.println(parse(test));
		} }
		public static boolean parse(String html) {
			 int tagS = 0;
			    int tagE = 0;
			    String curTag = "null";
			    
			    Stack stack = new Stack();
			    
			    for (int i=0;i < html.length();i++){
			    
			        if (html.charAt(i) == '<') {
			          tagS = i;
			        }
			        if (html.charAt(i) == '>') {
			          tagE = i + 1;
			          curTag = html.substring(tagS, tagE);
			        }
			 
			      if (!curTag.contains("/") && curTag.contains("<")) {
			         stack.push(curTag);
			        curTag = "null";
			      } 
			      else if (!stack.isEmpty() && !curTag.equals("null")){
			        curTag = curTag.replace("/","");
			        Node temp = stack.pop();
			        if (temp.data.equals(curTag) && !stack.isEmpty()) {
			          curTag = "null";
			        }  
			        if (temp.data.equals(curTag) && stack.isEmpty()) {
			          curTag = "null";
			          return true;
			        }
			      }
			      
			      
			    }
			    return false;
		    
		  }
	}
