package com.example.log4jtest;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import com.example.logutils3.LogUtils;
import com.example.logutils3.LogToFile;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";

    public static int logLevel = 0;

    public static float result;

    public static int[] A = new int[2];
    public static int c;

    public static int[] B;

    public static String fileName = "/Users/pengyuyan/Desktop/test.pg";
    public static LogUtils logUtils = new LogUtils();

    public static LogUtils.SocketMessageHandlerLog newSocketLogUtils;
    public static LogUtils.lessonProcessManagerLog newLessonLogUtils;
    public static LogUtils.MqttMessageHandlerLog newMqttLogUtils;
    public static LogUtils.TeachingManagerLog newTeachingManagerLogUtils;
    public static LogUtils.TeachingRecordLog newTeachingRecordLogUtils;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        logUtils.init(logLevel);

//         print to console

        newSocketLogUtils = logUtils.new SocketMessageHandlerLog();
        newSocketLogUtils.d("This is debug message!!!!!!!");
        newSocketLogUtils.v("This is verbose message!!!!!!!");
        newSocketLogUtils.e("This is error message!!!!!!!");
        newSocketLogUtils.w("This is warning message!!!!!!!");
        newSocketLogUtils.i("This is info message!!!!!!!");

        try{
            result = 1/0;
        } catch (ArithmeticException eDbug){
            newSocketLogUtils.d("debug", eDbug);
        }

        try{
            result = 1/0;
        } catch (ArithmeticException eVerbose){
            newSocketLogUtils.v("verbose", eVerbose);
        }

        try{
            result = 1/0;
        } catch (ArithmeticException eError){
            newSocketLogUtils.e("error", eError);
        }

        try{
            result = 1/0;
        } catch (ArithmeticException eWarn){
            newSocketLogUtils.w("warning", eWarn);
        }

        try{
            result = 1/0;
        } catch (ArithmeticException eInfo){
            newSocketLogUtils.i("info", eInfo);
        }

        newLessonLogUtils = logUtils.new lessonProcessManagerLog();

        newLessonLogUtils.d("This is debug message!!!!!!!");
        newLessonLogUtils.v("This is verbose message!!!!!!!");
        newLessonLogUtils.e("This is error message!!!!!!!");
        newLessonLogUtils.w("This is warning message!!!!!!!");
        newLessonLogUtils.i("This is info message!!!!!!!");

        try{
            c = A[2];
        } catch (ArrayIndexOutOfBoundsException eDbug){
            newLessonLogUtils.d("debug", eDbug);
        }

        try{
            c = A[2];
        } catch (ArrayIndexOutOfBoundsException eVerbose){
            newLessonLogUtils.v("verbose", eVerbose);
        }

        try{
            c = A[2];
        } catch (ArrayIndexOutOfBoundsException eError){
            newLessonLogUtils.e("error", eError);
        }

        try{
            c = A[2];
        } catch (ArrayIndexOutOfBoundsException eWarn){
            newLessonLogUtils.w("warning", eWarn);
        }

        try{
            c = A[2];
        } catch (ArrayIndexOutOfBoundsException eInfo){
            newLessonLogUtils.i("info", eInfo);
        }

        newMqttLogUtils = logUtils.new MqttMessageHandlerLog();

        newMqttLogUtils.d("This is debug message!!!!!!!");
        newMqttLogUtils.v("This is verbose message!!!!!!!");
        newMqttLogUtils.e("This is error message!!!!!!!");
        newMqttLogUtils.w("This is warning message!!!!!!!");
        newMqttLogUtils.i("This is info message!!!!!!!");

        try{
            FileInputStream fs = new FileInputStream("/Users/pengyuyan/Desktop/test.log");
        } catch (FileNotFoundException eDebug) {
            newMqttLogUtils.d("debug", eDebug);
        }

        try{
            FileInputStream fs = new FileInputStream("/Users/pengyuyan/Desktop/test.log");
        } catch (FileNotFoundException eVerbose) {
            newMqttLogUtils.v("verbose", eVerbose);
        }

        try{
            FileInputStream fs = new FileInputStream("/Users/pengyuyan/Desktop/test.log");
        } catch (FileNotFoundException eError) {
            newMqttLogUtils.e("error", eError);
        }

        try{
            FileInputStream fs = new FileInputStream("/Users/pengyuyan/Desktop/test.log");
        } catch (FileNotFoundException eWarn) {
            newMqttLogUtils.w("warning", eWarn);
        }

        try{
            FileInputStream fs = new FileInputStream("/Users/pengyuyan/Desktop/test.log");
        } catch (FileNotFoundException eInfo) {
            newMqttLogUtils.i("info", eInfo);
        }

        newTeachingManagerLogUtils = logUtils.new TeachingManagerLog();

        newTeachingManagerLogUtils.d("This is debug message!!!!!!!");
        newTeachingManagerLogUtils.v("This is verbose message!!!!!!!");
        newTeachingManagerLogUtils.e("This is error message!!!!!!!");
        newTeachingManagerLogUtils.w("This is warning message!!!!!!!");
        newTeachingManagerLogUtils.i("This is info message!!!!!!!");

        try{
            result = 1/0;
        } catch (ArithmeticException eDbug){
            newTeachingManagerLogUtils.d("debug", eDbug);
        }

        try{
            result = 1/0;
        } catch (ArithmeticException eVerbose){
            newTeachingManagerLogUtils.v("verbose", eVerbose);
        }

        try{
            result = 1/0;
        } catch (ArithmeticException eError){
            newTeachingManagerLogUtils.e("error", eError);
        }

        try{
            result = 1/0;
        } catch (ArithmeticException eWarn){
            newTeachingManagerLogUtils.w("warning", eWarn);
        }

        try{
            result = 1/0;
        } catch (ArithmeticException eInfo){
            newTeachingManagerLogUtils.i("info", eInfo);
        }

        newTeachingRecordLogUtils = logUtils.new TeachingRecordLog();

        newTeachingRecordLogUtils.d("This is debug message!!!!!!!");
        newTeachingRecordLogUtils.v("This is verbose message!!!!!!!");
        newTeachingRecordLogUtils.e("This is error message!!!!!!!");
        newTeachingRecordLogUtils.w("This is warning message!!!!!!!");
        newTeachingRecordLogUtils.i("This is info message!!!!!!!");

        try{
            B = new int[-1];
        } catch (NegativeArraySizeException eDbug){
            newTeachingRecordLogUtils.d("debug", eDbug);
        }

        try{
            B = new int[-1];
        } catch (NegativeArraySizeException eVerbose){
            newTeachingRecordLogUtils.v("verbose", eVerbose);
        }

        try{
            B = new int[-1];
        } catch (NegativeArraySizeException eError){
            newTeachingRecordLogUtils.e("error", eError);
        }

        try{
            B = new int[-1];
        } catch (NegativeArraySizeException eWarn){
            newTeachingRecordLogUtils.w("warning", eWarn);
        }

        try{
            B = new int[-1];
        } catch (NegativeArraySizeException eInfo){
            newTeachingRecordLogUtils.i("info", eInfo);
        }

        // write to file
        Context context = getApplicationContext();
        LogToFile logToFile  = new LogToFile();
        logToFile.init(context);
        logToFile.v("verbose", "verbose test");
        logToFile.e("error", "error test");
        logToFile.d("debug", "debug test");
        logToFile.i("info", "info test");
        logToFile.w("warning", "warning test");

    }

}
