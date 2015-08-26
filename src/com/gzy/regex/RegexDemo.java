package com.gzy.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	
	public static void main(String[] args) {
		String r1 = "[abc]";
		String r2 = "[^abc]";
		Pattern patter = Pattern.compile(r2);
		Matcher matcher = patter.matcher("d");
		System.out.println(matcher.matches());
	}

}
