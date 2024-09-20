package screen.example.toast__bread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ShowToast(View view)
    {
        Toast.makeText(this, "IUB", Toast.LENGTH_SHORT).show();
    }

    public void incrementValue(View view) {
        TextView tv = findViewById(R.id.textView4);
        int i = Integer.parseInt(tv.getText().toString());
        i++;
        tv.setText(i+"");
    }

//    public void showToast(View view)
//    {
//        Toast.makeText(this, "IUB", Toast.LENGTH_SHORT).show();
//    }
//
//    public void incrementValue(View view)
//    {
//        TextView tv = findViewById(R.id.textView4);
//        int i = Integer.parseInt(tv.getText().toString());
//        i++;
//        tv.setText(i+"");
//
//    }
}