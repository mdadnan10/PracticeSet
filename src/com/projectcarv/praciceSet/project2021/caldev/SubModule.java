package com.projectcarv.praciceSet.project2021.caldev;

import com.projectcarv.praciceSet.project2021.caldev.Validation;

public class SubModule {

	public String substract(int i, int j) {
		String addResult = "";

		Validation valid = new Validation();
		String result = valid.validate(i, j);

		if ("Both are positive integer".equals(result)) {

			addResult = "The substraction of " + i + " & " + j + " is = " + (i - j);
			
			//The addition of 3 & 4 is =-17

		} else {
			return addResult = result;
		}

		return addResult;

	}

}
