package sg.edu.np.madexercise2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    User test = new User();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txt = findViewById(R.id.button2);
        if (test.followed=false){
            txt.setText("Follow");
        }

        TextView name = findViewById(R.id.textView);
        name.setText(test.name);

        TextView desc = findViewById(R.id.textView2);
        desc.setText(test.description);
    }

    public void onClick(View v){
        TextView txt = findViewById(R.id.button2);

        test.followed = !test.followed;
        txt.setText(test.followed ? "Unfollow" : "Follow");
    }
}