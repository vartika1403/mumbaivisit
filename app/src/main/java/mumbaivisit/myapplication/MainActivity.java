package mumbaivisit.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    private final int interval = 1000;

    @BindView(R.id.image_splash)
    public ImageView splashImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        splashImage.setImageResource(R.drawable.mumbai_cover);

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, ListGridActivity.class);
                startActivity(intent);
            }
        };

        Handler handlerSplash = new Handler();
        handlerSplash.postDelayed(runnable, interval);
    }
}
