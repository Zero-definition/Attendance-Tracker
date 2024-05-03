package com.example.Attendance.Tracker.data;

import com.example.Attendance.Tracker.common.Request;

import java.util.Date;

public class LogInRequest extends Request {

    private final Date logIn;

    public LogInRequest(final Date logIn) {
        this.logIn = logIn;
    }

    /**
     * Get the login time of the attendance
     *
     * @return the login time of the attendance
     */
    public Date getLogIn() {
        return logIn;
    }
}