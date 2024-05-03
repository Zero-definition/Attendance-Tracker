package com.example.Attendance.Tracker.data;

import com.example.Attendance.Tracker.common.Request;

import java.util.Date;

public class LogOutRequest extends Request {

    private final Date logOut;

    public LogOutRequest(final Date logOut) {
        this.logOut = logOut;
    }

    /**
     * Get the logout time sent by the user
     *
     * @return the logout time sent by the user
     */
    public Date getLogOut() {
        return logOut;
    }
}