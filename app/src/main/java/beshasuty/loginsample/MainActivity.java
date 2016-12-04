package beshasuty.loginsample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    //Default username and password
    String username= "name";
    String password = "123";

    //Login data
    EditText usernameField;
    EditText passwordField;
    Button loginButton;
    TextView errorMessage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        usernameField = (EditText)findViewById(R.id.username);
        passwordField = (EditText)findViewById(R.id.password);
        errorMessage =(TextView)findViewById(R.id.error_message);
        loginButton = (Button)findViewById(R.id.login_button);
        loginButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //when user click login button, get username and password
        String name = usernameField.getText().toString();
        String pwd = passwordField.getText().toString();

        //Check name and pwd match username and password
        if(name.equals(username) && pwd.equals(password)){
            Intent mainMenuIntent = new Intent(MainActivity.this, MainMenu.class);
            startActivity(mainMenuIntent);
            finish();
        }
        else {
            //Show error message
            errorMessage.setVisibility(View.VISIBLE);
        }
    }
}
