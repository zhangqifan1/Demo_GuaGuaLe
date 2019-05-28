package com.as.demo_guaguale;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.as.guaguale_library.views.ScratchImageView;

public class MainActivity extends AppCompatActivity {

    private ScratchImageView siv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        siv.setRevealListener(new ScratchImageView.IRevealListener() {
            @Override
            public void onRevealed(ScratchImageView iv) {
                Toast.makeText(MainActivity.this, "Bingo", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onRevealPercentChangedListener(ScratchImageView siv, float percent) {

            }
        });
    }

    private void initView() {
        siv = (ScratchImageView) findViewById(R.id.siv);
    }
}
