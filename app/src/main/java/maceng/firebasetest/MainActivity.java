package maceng.firebasetest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import android.view.View;
import android.view.View.OnClickListener;

import com.google.firebase.auth.FirebaseAuth;


public class MainActivity extends Activity {

    public DeviceData1 mDeviceData = new DeviceData1();
    private ImageButton bluetoothButton;
    private ImageButton graph1Button;
    private ImageButton graph2Button;
    private ImageButton graph3Button;
    private ImageButton graph4Button;
    private ImageButton graph5Button;
    private ImageButton graph6Button;

    private FirebaseAuth mFirebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bluetoothButton = (ImageButton) findViewById(R.id.BluetoothButton);
        graph1Button = (ImageButton) findViewById(R.id.GraphButton1);
        graph2Button = (ImageButton) findViewById(R.id.GraphButton2);
        graph3Button = (ImageButton) findViewById(R.id.GraphButton3);
        graph4Button = (ImageButton) findViewById(R.id.GraphButton4);
        graph5Button = (ImageButton) findViewById(R.id.GraphButton5);
        graph6Button = (ImageButton) findViewById(R.id.GraphButton6);

        bluetoothButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, BluetoothActivity.class);
                startActivity(intent);
            }
        });

        graph1Button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Graph1Activity.class);
                startActivity(intent);
            }
        });
        graph2Button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Graph2Activity.class);
                startActivity(intent);
            }
        });
        graph3Button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Graph3Activity.class);
                startActivity(intent);
            }
        });
        graph4Button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Graph4Activity.class);
                startActivity(intent);
            }
        });
        graph5Button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Graph5Activity.class);
                startActivity(intent);
            }
        });
        graph6Button.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Graph6Activity.class);
                startActivity(intent);
            }
        });
    }

    protected void onDestroy() {
        super.onDestroy();
        mFirebaseAuth = FirebaseAuth.getInstance();
        mFirebaseAuth.signOut();
    }

    private void loadLogInView() {
        Intent intent = new Intent(this, LogInActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }
}