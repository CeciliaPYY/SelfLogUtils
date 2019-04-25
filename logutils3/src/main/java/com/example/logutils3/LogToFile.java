package com.example.logutils3;

import android.os.Environment;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import android.util.Log;
import java.util.Locale;
import android.content.Context;
import java.io.FileNotFoundException;



public class LogToFile {

    private static String LessonProcessManager_TAG = tagConst.LessonProcessManager_TAG;
    private static String SocketMessageHandler_TAG = tagConst.SocketMessageHandler_TAG;
    private static String MqttMessageHandler_TAG = tagConst.MqttMessageHandler_TAG;
    private static String TeachingRecord_TAG = tagConst.TeachingRecord_TAG;
    private static String TeachingManager_TAG = tagConst.TeachingManager_TAG;

    private static String TAG = "LogToFile";
    private static String logPath = null;
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss", Locale.US);
    private static Date date = new Date();

    public static void init(Context context) {
        logPath = getFilePath(context) + "/Logs";
    }

    private static String getFilePath(Context context) {

        if (Environment.MEDIA_MOUNTED.equals(Environment.MEDIA_MOUNTED) || !Environment.isExternalStorageRemovable()) { //如果外部储存可用
            return context.getExternalFilesDir(null).getPath(); //获得外部存储路径,默认路径为 /storage/emulated/0/Android/data/com.example.log4jtest/files/Logs/
        } else {
            return context.getFilesDir().getPath(); //直接存在/data/data里，非root手机是看不到的
        }
    }

    private static final String VERBOSE = "Verbose";
    private static final String DEBUG = "Debug";
    private static final String INFO = "Info";
    private static final String WARN = "Warn";
    private static final String ERROR = "Error";

    public class lessonProcessManagerLogToFile{
        public void v(String tag, String msg) {
            writeToFile(VERBOSE,  LessonProcessManager_TAG, msg);
        }
        public void d(String tag, String msg) {

            writeToFile(DEBUG, LessonProcessManager_TAG, msg);
        }
        public void i(String tag, String msg) {
            writeToFile(INFO, LessonProcessManager_TAG, msg
            );
        }
        public void w(String tag, String msg) {

            writeToFile(WARN, LessonProcessManager_TAG, msg);
        }
        public void e(String tag, String msg) {

            writeToFile(ERROR, LessonProcessManager_TAG, msg);
        }

    }

    public class SocketMessageHandlerLogToFile{
        public void v(String tag, String msg) {
            writeToFile(VERBOSE,  SocketMessageHandler_TAG, msg);
        }
        public void d(String tag, String msg) {

            writeToFile(DEBUG, SocketMessageHandler_TAG, msg);
        }
        public void i(String tag, String msg) {
            writeToFile(INFO, SocketMessageHandler_TAG, msg
            );
        }
        public void w(String tag, String msg) {

            writeToFile(WARN, SocketMessageHandler_TAG, msg);
        }
        public void e(String tag, String msg) {

            writeToFile(ERROR, SocketMessageHandler_TAG, msg);
        }

    }

    public static void v(String tag, String msg) {
        writeToFile(VERBOSE, tag, msg);
    }
    public static void d(String tag, String msg) {
        writeToFile(DEBUG, tag, msg);
    }
    public static void i(String tag, String msg) {
        writeToFile(INFO, tag, msg);
    }
    public static void w(String tag, String msg) {
        writeToFile(WARN, tag, msg);
    }
    public static void e(String tag, String msg) {
        writeToFile(ERROR, tag, msg);
    }


    private static void writeToFile(String type, String tag, String msg) {

        if (null == logPath) {
            Log.e(TAG, "logPath == null ，未初始化LogToFile");
            return;
        }

        String fileName = logPath + "/log_" + dateFormat.format(new Date()) + ".log";
        String log = dateFormat.format(date) + " " + tag + " " + type + " " + msg + "\n";


        File file = new File(logPath);
        if (!file.exists()) {
            file.mkdirs();
        }

        FileOutputStream fos;
        BufferedWriter bw = null;
        try {

            fos = new FileOutputStream(fileName, true);
            bw = new BufferedWriter(new OutputStreamWriter(fos));
            bw.write(log);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}


