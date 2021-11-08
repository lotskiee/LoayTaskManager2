package loay.sholy.loaytaskmanager2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Details extends AppCompatActivity {
    private TextView etVc,etVa,eTline3,etcarbo,etsodium,etchols,etFat,etValue,eTline2,etFatcalo,eTcalo,eTserving,etLine,etProtien,etCalcium,etIron,etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        etVc=findViewById(R.id.etVc);
        etVa=findViewById(R.id.etVa);
        eTline3=findViewById(R.id.eTline3);
        etcarbo=findViewById(R.id.etcarbo);
        etsodium=findViewById(R.id.etsodium);
        etchols=findViewById(R.id.etchols);
        etFat=findViewById(R.id.etFat);
        etValue=findViewById(R.id.etValue);
        eTline2=findViewById(R.id.eTline2);
        etFatcalo=findViewById(R.id.etFatcalo);
        eTcalo=findViewById(R.id.eTcalo);
        eTserving=findViewById(R.id.eTserving);
        etLine=findViewById(R.id.etLine);
        etProtien=findViewById(R.id.etProtien);
        etCalcium=findViewById(R.id.etCalcium);
        etIron=findViewById(R.id.etIron);
        etName=findViewById(R.id.etName);
    }
}