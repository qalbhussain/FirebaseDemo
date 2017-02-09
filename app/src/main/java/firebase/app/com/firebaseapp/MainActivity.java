package firebase.app.com.firebaseapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.txtInputlayoutEmail)
    TextInputLayout textInputLayout;

    String sEmail = "qalb";
    String sPass = "1234";


    @BindView(R.id.txtemail)
    TextView email;
    @BindView(R.id.txtpassword)
    TextView password;

    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        login = (Button) findViewById(R.id.btnlogin);
        View decorView = getWindow().getDecorView();
        int i = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(i);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (email.getText().toString().equals(sEmail) && password.getText().toString().equals(sPass)) {
                    Intent i = new Intent(getApplicationContext(), SecondActivity.class);

                    startActivity(i);
                } else {
                    textInputLayout.setError("No email");
                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
//        getMenuInflater().inflate(R.menu.appbar_menu, menu);
//        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
       /* int id = item.getItemId();
        switch (id) {
            case R.id.search:
                Toast.makeText(this, "Search Item Clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.addmember : Toast.makeText(this, "Add Team Member" , Toast.LENGTH_LONG).show();
                return true;

        }

*/
        return super.onOptionsItemSelected(item);

    }
}
