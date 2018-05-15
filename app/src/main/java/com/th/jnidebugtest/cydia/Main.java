package com.th.jnidebugtest.cydia;

import android.os.Process;
import android.util.Log;

import com.th.jnidebugtest.base.Config;

/**
 * create by th on 10/5/2018
 */
public class Main {
    static void initialize() {
        Log.i(Config.TAG, "initialize");
        Log.i(Config.TAG, "pid: " + Process.myPid());
    }
}
