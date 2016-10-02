package com.example.daniel.dotaznik;

import android.media.MediaRecorder;
import android.os.Environment;

import java.io.File;
import java.io.IOException;

/**
 * Created by Peter on 29. 9. 2016.
 *
 * Requires following permissions:
 *  - <uses-permission android:name="android.permission.RECORD_AUDIO"/>
 *  - <uses-permission android:name="android.permission.WRITE_EXTERNAL_STORAGE" />
 */
public class AudioRecorder {
    //public static final String FILE_NAME = "audio.3gp";
    public static final String DIRECTORY = "com.example.daniel.dotaznik/.audio/";

    private static MediaRecorder mediaRecorder = null;
    private static boolean recording = false;
    private static String currentFileName = null;

    public static void start (String fileName) throws IOException{
        if(AudioRecorder.isRecording())
            stop();
        currentFileName = fileName;

        mediaRecorder = new MediaRecorder();
        mediaRecorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        mediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.THREE_GPP);
        mediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);

        String absPath = Environment.getExternalStorageDirectory().getAbsolutePath();
        File file = new File(absPath + "/" + DIRECTORY);
        file.mkdirs();
        mediaRecorder.setOutputFile(absPath + "/" + DIRECTORY + fileName);

        mediaRecorder.prepare();
        mediaRecorder.start();

        recording = true;
    }

    public static void stop () {
        if(isRecording()) {
            mediaRecorder.stop();
            mediaRecorder.release();
            mediaRecorder = null;

            recording = false;
        }
    }

    public static boolean isRecording () {
        return recording;
    }

    public static  String getAbsoluteFilePath () {
        return Environment.getExternalStorageDirectory().getAbsolutePath()  + "/" + DIRECTORY + currentFileName;
    }
}
