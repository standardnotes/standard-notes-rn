package org.standardnotes.SNReactNative;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Build;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

import java.util.HashMap;
import java.util.Map;

public class SNReactNativeModule extends ReactContextBaseJavaModule {

    private static final String MANUFACTURER = "MANUFACTURER";
    ReactApplicationContext reactContext;
    AlarmManager alarmManager;

    public SNReactNativeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
        alarmManager = (AlarmManager) reactContext.getSystemService(Context.ALARM_SERVICE);
    }

    @Override
    public String getName() {
        return "SNReactNative";
    }

    @Override
    public Map<String, Object> getConstants() {
        final Map<String, Object> constants = new
                HashMap<>();
        constants.put(MANUFACTURER, Build.MANUFACTURER);
        return constants;
    }

    @ReactMethod
    public void exitApp() {
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
