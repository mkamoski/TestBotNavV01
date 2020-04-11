package com.netbrainer.testbotnavv01.ui.notifications;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NotificationsViewModel extends ViewModel
{
	private MutableLiveData<String> mText;

	public NotificationsViewModel()
	{
		mText = new MutableLiveData<>();
		mText.setValue("This is notifications fragment, and my code 123.");
	}

	public LiveData<String> getText()
	{
		return mText;
	}
}
