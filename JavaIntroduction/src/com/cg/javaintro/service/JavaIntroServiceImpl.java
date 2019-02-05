package com.cg.javaintro.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaIntroServiceImpl implements IJavaIntroService {

	@Override
	public boolean validateEmpId(String id) {
		Pattern idPattern=Pattern.compile("^[1-3]{1}[0-9]{2}$");
		Matcher idMatcher=idPattern.matcher(id);
		return idMatcher.matches();
		}

	@Override
	public boolean validateEmpName(String name) {
		Pattern namePattern=Pattern.compile("^[A-Z]{3,}$");
		Matcher nameMatcher=namePattern.matcher(name);
		return nameMatcher.matches();
	}

}
