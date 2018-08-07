package com.gowpar.com.gowpar.playground;

public class MaskString {
	
	// https://www.javacodeexamples.com/mask-part-of-string-example-java/878
	
	public static void main(String[] args) {
		
		String testString = "BX062167";
		
		try {
			System.out.print(maskString(testString, 2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static String maskString(String stringText, int showEndLength) throws Exception {

		int stringTextLength;
		int maskLength;
		String endSubString = "";
		char maskChar = '*';
		
			if (stringText == null || stringText.equals("")) {
				throw new Exception("String is null or empty");
			}
			
			stringTextLength = stringText.length();
			
			if (showEndLength > stringTextLength) {
				throw new Exception("showEndLength is greater than stringText.length()");
			}
			
			maskLength = stringTextLength - showEndLength;
			endSubString = stringText.substring(maskLength);
			
	        StringBuilder sbMaskString = new StringBuilder(maskLength);
	        
	        for(int i = 0; i < maskLength; i++){
	            sbMaskString.append(maskChar);
	        }
	        
	        return sbMaskString.toString().concat(endSubString);
    }

}
