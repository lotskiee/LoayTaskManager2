package loay.sholy.loaytaskmanager2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

public class Sign_up extends AppCompatActivity {
    private TextInputLayout etLastname,etFirstname,etPassword,etGmail;
    private TextInputEditText etConfirmpassword;
    private Button btnCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etLastname=findViewById(R.id.etLastname);
        etFirstname=findViewById(R.id.etFirstname);
        etPassword=findViewById(R.id.etPassword);
        etGmail=findViewById(R.id.etGmail);
        etConfirmpassword=findViewById(R.id.etConfirmpassword);
        btnCreate=findViewById(R.id.btnCreate);
    }
}