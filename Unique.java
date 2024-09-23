package com.lms_problems;

public class Unique {

	
		public static String checkUniquechar(String st) {
			String ans="";
			
			int arr[]=new int[256];
			for(int i=0;i<st.length();i++) {
				arr[st.charAt(i)]++;
			}
			for(int i=0;i<st.length();i++) {
				if(arr[st.charAt(i)]==1) {
					ans=ans+st.charAt(i);
				}
			}
			return ans;
		}
	public static void main(String[] args) {
	   String st="java";
	  System.out.println( checkUniquechar(st));
	}
	}
