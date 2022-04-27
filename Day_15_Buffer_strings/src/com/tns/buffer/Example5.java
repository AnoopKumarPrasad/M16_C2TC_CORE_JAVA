package com.tns.buffer;

import java.util.StringTokenizer;

public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringTokenizer st=new StringTokenizer("Merry GO Round");
		StringTokenizer st=new StringTokenizer("Let,s,try@this","@"); //string, delimiter
		while(st.hasMoreTokens())
		{
		System.out.println(st.nextToken());
	}}
	

}
