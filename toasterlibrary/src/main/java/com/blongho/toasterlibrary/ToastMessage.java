package com.blongho.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToastMessage {
	public static void makeShortToast(final Context context, final String message){
		Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
	}

	public static void makeLongToast(final Context context, final String message){
		Toast.makeText(context, message, Toast.LENGTH_LONG).show();
	}
}
