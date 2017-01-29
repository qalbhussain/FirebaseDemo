package firebase.app.com.firebaseapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.support.v7.appcompat.R.styleable.View;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.button) Button btn;
    @BindView(R.id.txt) TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.button)
    public void changeName(){
        textView.setText("Hellow Qalb");
    }
}
