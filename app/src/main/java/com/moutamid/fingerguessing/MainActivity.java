package com.moutamid.fingerguessing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;

public class MainActivity extends AppCompatActivity {

    ImageView finger1 , finger2 , finger3 , finger4 , finger5 ;
    LinearLayout layout_fingers;
    TextView start;
    Button f1 , f2 , f3 , f4 , f5;
    GifImageView cong , try_again ;
    TextView result , privacy_policy;
    Button next_btn , restart_btn , thumbs_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // images of hands
        start = findViewById(R.id.start);
        finger1 = findViewById(R.id.hand1);
        finger2 = findViewById(R.id.hand2);
        finger3 = findViewById(R.id.hand3);
        finger4 = findViewById(R.id.hand4);
        finger5 = findViewById(R.id.hand5);

        // layout fingers name
        layout_fingers = findViewById(R.id.layout_finger);

        // fingers name buttons
        f1 = findViewById(R.id.f1);
        f2 = findViewById(R.id.f2);
        f3 = findViewById(R.id.f3);
        f4 = findViewById(R.id.f4);
        f5 = findViewById(R.id.f5);

        // gif results
        cong = findViewById(R.id.cong_gif);
        try_again = findViewById(R.id.try_gif);

        // result & privacy policy text
        result = findViewById(R.id.result_text);
        privacy_policy = findViewById(R.id.text_privacy_policy);

        // next , restart & thumbs button challenge
        next_btn = findViewById(R.id.next_btn);
        restart_btn = findViewById(R.id.restart_btn);
        thumbs_btn = findViewById(R.id.thumbs_btn);

        privacy_policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://app.getterms.io/view/2ab1k/privacy/en-us";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        thumbs_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this , Donation_Activity.class);
                startActivity(intent);
            }
        });

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finger1_func();
            }
        });
    }

    private void finger1_func() {
        start.setVisibility(View.GONE);
        finger1.setVisibility(View.VISIBLE);
        layout_fingers.setVisibility(View.VISIBLE);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cong.setVisibility(View.VISIBLE);
                try_again.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText("Wow!!! It's Right Answer.");
                next_btn.setVisibility(View.VISIBLE);
                next_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finger2_func();
                    }
                });
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                next_btn.setVisibility(View.GONE);
                result.setText("Oops !!! It's Wrong. Right Answer is Thumb Finger");
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                next_btn.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText("Oops !!! It's Wrong. Right Answer is Thumb Finger");
            }
        });

        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                next_btn.setVisibility(View.GONE);
                result.setText("Oops !!! It's Wrong. Right Answer is Thumb Finger");
            }
        });

        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                next_btn.setVisibility(View.GONE);
                result.setText("Oops !!! It's Wrong. Right Answer is Thumb Finger");
            }
        });
    }

    private void finger2_func() {
        start.setVisibility(View.GONE);
        finger1.setVisibility(View.GONE);
        finger2.setVisibility(View.VISIBLE);
        cong.setVisibility(View.GONE);
        try_again.setVisibility(View.GONE);
        next_btn.setVisibility(View.GONE);
        result.setVisibility(View.GONE);
        layout_fingers.setVisibility(View.VISIBLE);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                next_btn.setVisibility(View.GONE);
                result.setText("Oops !!! It's Wrong. Right Answer is Index Finger");
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cong.setVisibility(View.VISIBLE);
                try_again.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText("Wow!!! It's Right Answer.");
                next_btn.setVisibility(View.VISIBLE);
                next_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finger3_func();
                    }
                });
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                next_btn.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText("Oops !!! It's Wrong. Right Answer is Index Finger");
            }
        });

        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                next_btn.setVisibility(View.GONE);
                result.setText("Oops !!! It's Wrong. Right Answer is Index Finger");
            }
        });

        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                next_btn.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText("Oops !!! It's Wrong. Right Answer is Index Finger");
            }
        });
    }

    private void finger3_func() {
        start.setVisibility(View.GONE);
        finger1.setVisibility(View.GONE);
        finger2.setVisibility(View.GONE);
        finger3.setVisibility(View.VISIBLE);
        cong.setVisibility(View.GONE);
        try_again.setVisibility(View.GONE);
        next_btn.setVisibility(View.GONE);
        result.setVisibility(View.GONE);
        layout_fingers.setVisibility(View.VISIBLE);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                next_btn.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText("Oops !!! It's Wrong. Right Answer is Middle Finger");
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                next_btn.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText("Oops !!! It's Wrong. Right Answer is Middle Finger");
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cong.setVisibility(View.VISIBLE);
                try_again.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText("Wow!!! It's Right Answer.");
                next_btn.setVisibility(View.VISIBLE);
                next_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finger4_func();
                    }
                });
            }
        });

        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                next_btn.setVisibility(View.GONE);
                result.setText("Oops !!! It's Wrong. Right Answer is Middle Finger");
            }
        });

        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                next_btn.setVisibility(View.GONE);
                result.setText("Oops !!! It's Wrong. Right Answer is Middle Finger");
            }
        });
    }

    private void finger4_func() {
        start.setVisibility(View.GONE);
        finger1.setVisibility(View.GONE);
        finger2.setVisibility(View.GONE);
        finger3.setVisibility(View.GONE);
        finger4.setVisibility(View.VISIBLE);
        cong.setVisibility(View.GONE);
        try_again.setVisibility(View.GONE);
        next_btn.setVisibility(View.GONE);
        result.setVisibility(View.GONE);
        layout_fingers.setVisibility(View.VISIBLE);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                next_btn.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText("Oops !!! It's Wrong. Right Answer is Ring Finger");
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                next_btn.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText("Oops !!! It's Wrong. Right Answer is Ring Finger");
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                next_btn.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText("Oops !!! It's Wrong. Right Answer is Ring Finger");
            }
        });

        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cong.setVisibility(View.VISIBLE);
                try_again.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText("Wow!!! It's Right Answer.");
                next_btn.setVisibility(View.VISIBLE);
                next_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finger5_func();
                    }
                });
            }
        });

        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                next_btn.setVisibility(View.GONE);
                result.setText("Oops !!! It's Wrong. Right Answer is Ring Finger");
            }
        });
    }

    private void finger5_func() {
        start.setVisibility(View.GONE);
        finger1.setVisibility(View.GONE);
        finger2.setVisibility(View.GONE);
        finger3.setVisibility(View.GONE);
        finger4.setVisibility(View.GONE);
        finger5.setVisibility(View.VISIBLE);
        cong.setVisibility(View.GONE);
        try_again.setVisibility(View.GONE);
        next_btn.setVisibility(View.GONE);
        result.setVisibility(View.GONE);
        layout_fingers.setVisibility(View.VISIBLE);

        f1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                restart_btn.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                next_btn.setVisibility(View.GONE);
                result.setText("Oops !!! It's Wrong. Right Answer is Pinky Finger");
            }
        });

        f2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                restart_btn.setVisibility(View.GONE);
                next_btn.setVisibility(View.GONE);
                result.setText("Oops !!! It's Wrong. Right Answer is Pinky Finger");
            }
        });

        f3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                restart_btn.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                next_btn.setVisibility(View.GONE);
                result.setText("Oops !!! It's Wrong. Right Answer is Pinky Finger");
            }
        });

        f4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try_again.setVisibility(View.VISIBLE);
                cong.setVisibility(View.GONE);
                restart_btn.setVisibility(View.GONE);
                next_btn.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText("Oops !!! It's Wrong. Right Answer is Pinky Finger");
            }
        });

        f5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cong.setVisibility(View.VISIBLE);
                try_again.setVisibility(View.GONE);
                result.setVisibility(View.VISIBLE);
                result.setText("Wow!!! It's Right Answer.");
                restart_btn.setVisibility(View.VISIBLE);
                restart_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        restart_func();
                    }
                });
            }
        });
    }

    private void restart_func() {
        start.setVisibility(View.VISIBLE);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finger1_func();
            }
        });

        layout_fingers.setVisibility(View.GONE);
        finger5.setVisibility(View.GONE);
        cong.setVisibility(View.GONE);
        try_again.setVisibility(View.GONE);
        result.setVisibility(View.GONE);
        restart_btn.setVisibility(View.GONE);
        next_btn.setVisibility(View.GONE);

    }
}