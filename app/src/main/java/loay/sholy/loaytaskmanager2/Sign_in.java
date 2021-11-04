package loay.sholy.loaytaskmanager2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import com.google.android.material.textfield.TextInputEditText;

public class Sign_in extends AppCompatActivity {
    private TextInputEditText etEmail,etPassword;
    private Button btnLogin,btnResigster;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        etEmail=findViewById(R.id.etEmail);
        etPassword=findViewById(R.id.etPassword);
        btnLogin=findViewById(R.id.btnLogin);
        btnResigster=findViewById(R.id.btnResigster);


    }
}