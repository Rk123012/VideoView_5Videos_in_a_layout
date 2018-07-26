package com.example.mohsiul.videoview;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.widget.VideoView;

import java.io.IOException;

public class MainActivity extends Activity {

    VideoView video1,video2,video3,video4,video5;
    /*
    private MediaPlayer mPlayer1;
    private MediaPlayer mPlayer2;

    SurfaceHolder.Callback mCallback1;
    SurfaceHolder.Callback mCallback2;
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        video1=findViewById(R.id.videoView1);
        video2=findViewById(R.id.videoView2);

        video3=findViewById(R.id.videoView3);
        video4=findViewById(R.id.videoView4);
        video5=findViewById(R.id.videoView5);




        video1.setVideoURI(Uri.parse("rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov"));
        video1.requestFocus();
        video1.start();

        //video1.setKeepScreenOn(true);

        video2.setVideoURI(Uri.parse("rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov"));
        video2.requestFocus();
        video2.start();

        //video2.setKeepScreenOn(true);

        video3.setVideoURI(Uri.parse("rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov"));
        video2.requestFocus();
        video3.start();

        video4.setVideoURI(Uri.parse("rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov"));
        video2.requestFocus();
        video4.start();

        video5.setVideoURI(Uri.parse("rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov"));
        video2.requestFocus();
        video5.start();


        /*mPlayer1 = new MediaPlayer();
        mPlayer2 = new MediaPlayer();

        mCallback1 = new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                try {
                    mPlayer1.setDisplay(surfaceHolder);
                    mPlayer1.setDataSource(MainActivity.this, Uri.parse("rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov"));
                    mPlayer1.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mediaPlayer) {
                            mPlayer1.start();
                        }
                    });
                    mPlayer1.prepareAsync();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                mPlayer1.release();
            }
        };

        mCallback2 = new SurfaceHolder.Callback() {
            @Override
            public void surfaceCreated(SurfaceHolder surfaceHolder) {
                try {
                    mPlayer2.setDisplay(surfaceHolder);
                    mPlayer2.setDataSource(MainActivity.this, Uri.parse("rtsp://184.72.239.149/vod/mp4:BigBuckBunny_175k.mov"));
                    mPlayer2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mediaPlayer) {
                            mPlayer2.start();
                        }
                    });
                    mPlayer2.prepareAsync();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            @Override
            public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {

            }

            @Override
            public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
                mPlayer2.release();
            }
        };

        final SurfaceView surfaceView1 =
                (SurfaceView)findViewById(R.id.surfaceView1);
        // Configure the Surface View.
        surfaceView1.setKeepScreenOn(true);
        // Configure the Surface Holder and register the callback.
        SurfaceHolder holder1 = surfaceView1.getHolder();
        holder1.addCallback(mCallback1);
        holder1.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);

        final SurfaceView surfaceView2 =
                (SurfaceView)findViewById(R.id.surfaceView2);
        // Configure the Surface View.
        surfaceView2.setKeepScreenOn(true);
        // Configure the Surface Holder and register the callback.
        SurfaceHolder holder2 = surfaceView2.getHolder();
        holder2.addCallback(mCallback2);
        holder2.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);
        */
    }



    }

