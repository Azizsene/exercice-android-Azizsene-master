package com.appturbo.appturbotest;

import android.support.v4.app.Fragment;

import java.util.Calendar;


public class AboutFragment extends Fragment {

	/*
     * TODO: Write the AboutFragment with the layout @layout/fragment_about and initialize the Textview @id/my_description with the text return by getMyDescription.
     */
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
							 Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_rssitem_detail,
				container, false);
		return view;

	private String getMyDescription(final String name, final int age, final Calendar startTime, final Calendar endTime) {
		/*
		 * TODO: Get the string and format it with the good parameter.
		 */

	}

}
