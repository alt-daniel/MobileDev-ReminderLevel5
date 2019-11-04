package com.example.reminderapp.data

import android.content.Context
import com.example.reminderapp.model.Reminder

public class ReminderRepository (context: Context) {

    private var reminderDao: ReminderDao

    init {
        val reminderRoomDatabase = ReminderRoomDatabase.getDatabase(context)
        reminderDao = reminderRoomDatabase!!.reminderDao()
    }

    fun getAllReminders(): List<Reminder> {
        return reminderDao.getAllReminders()
    }

    fun insertReminder (reminder: Reminder) {
        return reminderDao.insertReminder(reminder)
    }

    fun deleteReminder (reminder: Reminder) {
        return reminderDao.deleteReminder(reminder)
    }

    fun updateReminder (reminder: Reminder) {
        return reminderDao.updateReminder(reminder)
    }

}