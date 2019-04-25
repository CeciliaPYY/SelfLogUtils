package com.example.logutils3;

import android.util.Log;

public class LogUtils {

    private static LogUtils instance;

    // 静态成员变量属于类而非实例
    private static String LessonProcessManager_TAG = tagConst.LessonProcessManager_TAG;
    private static String SocketMessageHandler_TAG = tagConst.SocketMessageHandler_TAG;
    private static String MqttMessageHandler_TAG = tagConst.MqttMessageHandler_TAG;
    private static String TeachingRecord_TAG = tagConst.TeachingRecord_TAG;
    private static String TeachingManager_TAG = tagConst.TeachingManager_TAG;

    private static boolean DEBUG_V = true;
    private static boolean DEBUG_D = true;
    private static boolean DEBUG_I = true;
    private static boolean DEBUG_W = true;
    private static boolean DEBUG_E = true;
    private static boolean isSetLogLevel = false;

    public static void setLogLevel(int level) {
        DEBUG_V = level <= 0;
        DEBUG_D = level <= 1;
        DEBUG_I = level <= 2;
        DEBUG_W = level <= 3;
        DEBUG_E = level <= 4;
    }

    public static LogUtils getIntance() {
        if (instance == null) {
            instance = new LogUtils();
        }
        return instance;

    }

    public static void init(int level) {
        LogUtils.getIntance().setLogLevel(level);
        isSetLogLevel = true;
    }

    public class lessonProcessManagerLog {

        public void d(String message) {
            if (isSetLogLevel && DEBUG_D) {
                Log.d(LessonProcessManager_TAG, message);
            }
        }

        public void d(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_D) {
                Log.d(LessonProcessManager_TAG, message, tr);
            }
        }

        public void v(String message) {
            if (isSetLogLevel && DEBUG_V) {
                Log.v(LessonProcessManager_TAG, message);
            }
        }

        public void v(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_V) {
                Log.v(LessonProcessManager_TAG, message, tr);
            }
        }

        public void e(String message) {
            if (isSetLogLevel && DEBUG_E) {
                Log.e(LessonProcessManager_TAG, message);
            }

        }

        public void e(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_E) {
                Log.e(LessonProcessManager_TAG, message, tr);
            }
        }

        public void w(String message) {
            if (isSetLogLevel && DEBUG_W) {
                Log.w(LessonProcessManager_TAG, message);
            }
        }

        public void w(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_W) {
                Log.w(LessonProcessManager_TAG, message, tr);
            }
        }

        public void i(String message) {
            if (isSetLogLevel && DEBUG_I) {
                Log.i(LessonProcessManager_TAG, message);
            }
        }

        public void i(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_I) {
                Log.i(LessonProcessManager_TAG, message, tr);
            }
        }
    }

    public class SocketMessageHandlerLog {

        public void d(String message) {
            if (isSetLogLevel && DEBUG_D) {
                Log.d(SocketMessageHandler_TAG, message);
            }
        }

        public void d(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_D) {
                Log.d(SocketMessageHandler_TAG, message, tr);
            }
        }

        public void v(String message) {
            if (isSetLogLevel && DEBUG_V) {
                Log.v(SocketMessageHandler_TAG, message);
            }
        }

        public void v(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_V) {
                Log.v(SocketMessageHandler_TAG, message, tr);
            }
        }

        public void e(String message) {
            if (isSetLogLevel && DEBUG_E) {
                Log.e(SocketMessageHandler_TAG, message);
            }
        }

        public void e(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_E) {
                Log.e(SocketMessageHandler_TAG, message, tr);
            }
        }

        public void w(String message) {
            if (isSetLogLevel && DEBUG_W) {
                Log.w(SocketMessageHandler_TAG, message);
            }
        }

        public void w(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_W) {
                Log.w(SocketMessageHandler_TAG, message, tr);
            }
        }

        public void i(String message) {
            if (isSetLogLevel && DEBUG_I) {
                Log.i(SocketMessageHandler_TAG, message);
            }
        }

        public void i(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_I) {
                Log.i(SocketMessageHandler_TAG, message, tr);
            }
        }
    }

    public class MqttMessageHandlerLog {

        public void d(String message) {
            if (isSetLogLevel && DEBUG_D) {
                Log.d(MqttMessageHandler_TAG, message);
            }
        }

        public void d(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_D) {
                Log.d(MqttMessageHandler_TAG, message, tr);
            }
        }

        public void v(String message) {
            if (isSetLogLevel && DEBUG_V) {
                Log.v(MqttMessageHandler_TAG, message);
            }
        }

        public void v(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_V) {
                Log.v(MqttMessageHandler_TAG, message, tr);
            }
        }

        public void e(String message) {
            if (isSetLogLevel && DEBUG_V) {
                Log.e(MqttMessageHandler_TAG, message);
            }
        }

        public void e(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_E) {
                Log.e(MqttMessageHandler_TAG, message, tr);
            }
        }

        public void w(String message) {
            if (isSetLogLevel && DEBUG_W) {
                Log.w(MqttMessageHandler_TAG, message);
            }
        }

        public void w(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_W) {
                Log.w(MqttMessageHandler_TAG, message, tr);
            }
        }

        public void i(String message) {
            if (isSetLogLevel && DEBUG_I) {
                Log.i(MqttMessageHandler_TAG, message);
            }
        }

        public void i(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_I) {
                Log.i(MqttMessageHandler_TAG, message, tr);
            }
        }
    }

    public class TeachingRecordLog {

        public void d(String message) {
            if (isSetLogLevel && DEBUG_D) {
                Log.d(TeachingRecord_TAG, message);
            }
        }

        public void d(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_D) {
                Log.d(TeachingRecord_TAG, message, tr);
            }
        }

        public void v(String message) {
            if (isSetLogLevel && DEBUG_V) {
                Log.v(TeachingRecord_TAG, message);
            }
        }

        public void v(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_V) {
                Log.v(TeachingRecord_TAG, message, tr);
            }
        }

        public void e(String message) {
            if (isSetLogLevel && DEBUG_E) {
                Log.e(TeachingRecord_TAG, message);
            }
        }

        public void e(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_E) {
                Log.e(TeachingRecord_TAG, message, tr);
            }
        }

        public void w(String message) {
            if (isSetLogLevel && DEBUG_W) {
                Log.w(TeachingRecord_TAG, message);
            }
        }

        public void w(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_W) {
                Log.w(TeachingRecord_TAG, message, tr);
            }
        }

        public void i(String message) {
            if (isSetLogLevel && DEBUG_I) {
                Log.i(TeachingRecord_TAG, message);
            }
        }

        public void i(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_I) {
                Log.i(TeachingRecord_TAG, message, tr);
            }
        }
    }

    public class TeachingManagerLog {

        public void d(String message) {
            if (isSetLogLevel && DEBUG_D) {
                Log.d(TeachingManager_TAG, message);
            }

        }

        public void d(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_D) {
                Log.d(TeachingManager_TAG, message, tr);
            }
        }

        public void v(String message) {
            if (isSetLogLevel && DEBUG_V) {
                Log.v(TeachingManager_TAG, message);
            }
        }

        public void v(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_V) {
                Log.v(TeachingManager_TAG, message, tr);
            }
        }

        public void e(String message) {
            if (isSetLogLevel && DEBUG_E) {
                Log.e(TeachingManager_TAG, message);
            }
        }

        public void e(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_E) {
                Log.e(TeachingManager_TAG, message, tr);
            }
        }

        public void w(String message) {
            if (isSetLogLevel && DEBUG_W) {
                Log.w(TeachingManager_TAG, message);
            }
        }

        public void w(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_W) {
                Log.w(TeachingManager_TAG, message, tr);
            }
        }

        public void i(String message) {
            if (isSetLogLevel && DEBUG_I) {
                Log.i(TeachingManager_TAG, message);
            }
        }

        public void i(String message, Throwable tr) {
            if (isSetLogLevel && DEBUG_I) {
                Log.i(TeachingManager_TAG, message, tr);
            }
        }
    }
}



