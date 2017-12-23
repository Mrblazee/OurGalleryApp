package com.example.root.fotoapparat;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void openCamera(View view) {
        Intent cam = new Intent(getApplicationContext(), CamLauncher.class);
        startActivity(cam);
    }


    /*private void listAlbums()
    {
        String storageDir = Environment.getExternalStorageDirectory() + File.separator + "Categorize";
        File dir = new File(storageDir);

        if (dir.exists()) {
            File[] files = dir.listFiles();

            File[] subfiles;

            for (int i = 0; i < files.length; ++i) {
                File file = files[i];

                if (file.isDirectory()) {
                    //traverse(file);
                }
            }
        }

    }*/

}

/*if (file.isDirectory()) {
                    traverse(file);
                } else {
                    // do something here with the file
                }*/