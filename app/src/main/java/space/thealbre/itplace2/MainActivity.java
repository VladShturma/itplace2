package space.thealbre.itplace2;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void greenOnClick(View view) {
        Toast.makeText(this, "You choose the green color", Toast.LENGTH_LONG).show();
        textZone.setBackgroundColor(getResources().getColor(R.drawable.linea_verde));
        textZone.setBackgroundColor(Color.CYAN);
    }
    public void grayOnClick(View view) {
        Toast.makeText(this, "You choose the gray color", Toast.LENGTH_LONG).show();

    }
    public void pinkOnClick(View view) {
        Toast.makeText(this, "You choose the pink color", Toast.LENGTH_LONG).show();

    }

}
