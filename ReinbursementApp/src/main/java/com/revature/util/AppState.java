package com.revature.util;

import com.revature.beans.Employee;

public class AppState {

    private static Employee currentEmployee;
    private static boolean appRunning;
    
    private AppState() {
        super();
    }

    public static Employee getCurrentEmployee() {
        return currentEmployee;
    }

    public static void setCurrentCustomer(Employee currentEmployee) {
        AppState.currentEmployee = currentEmployee;
    }

    public static boolean isAppRunning() {
        return appRunning;
    }

    public static void setAppRunning(boolean appRunning) {
        AppState.appRunning = appRunning;
    }

}