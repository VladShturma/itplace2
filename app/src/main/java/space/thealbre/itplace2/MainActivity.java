package space.thealbre.itplace2;

// неиспользуемые импорты
import android.graphics.Color;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//     название переменной не соответствует ее типу
    private RelativeLayout mConstraintLayout;

//     чтобы не писать одну и ту же логику в трех методах, лучше сделать общий метод changeColor,
//     который принимает в качестве параметров строку для Toast и идентификатор цвета
//     а в этих трех методах уже вызывать общий с нужными параметрами
    public void greenOnClick(View view) {
        Toast.makeText(this, "You choose the green color", Toast.LENGTH_LONG).show();
//         mConstraintLayout лучше один раз определить в методе onCreate
        mConstraintLayout = (RelativeLayout) findViewById(R.id.textZone);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.greenBackground));
    }

    public void grayOnClick(View view) {
        mConstraintLayout = (RelativeLayout) findViewById(R.id.textZone);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.grayBackground));
        Toast.makeText(this, "You choose the gray color", Toast.LENGTH_LONG).show();

    }
    public void pinkOnClick(View view) {
        Toast.makeText(this, "You choose the pink color", Toast.LENGTH_LONG).show();
        mConstraintLayout = (RelativeLayout) findViewById(R.id.textZone);
        mConstraintLayout.setBackgroundColor(ContextCompat.getColor(this, R.color.pinkBackground));
    }
}
