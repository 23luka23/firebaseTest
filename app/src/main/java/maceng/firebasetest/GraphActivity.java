package maceng.firebasetest;

import android.content.Intent;
import android.os.SystemClock;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.Viewport;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.util.Log;


import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class GraphActivity extends AppCompatActivity {
    Calendar calendar = Calendar.getInstance();
    Date date1;
    public double value;
    static LineGraphSeries<DataPoint> series;
    static GraphView graph;
    static  Viewport viewport;

    static int counter;
    static boolean live=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        graph = (GraphView) findViewById(R.id.graph1);
        series = new LineGraphSeries<DataPoint>();

        viewport = graph.getViewport();
        viewport.setXAxisBoundsManual(true);
        viewport.setMinX(0);
        viewport.setYAxisBoundsManual(true);
        viewport.setMinY(0);
        viewport.setMaxY(1024);
        viewport.setScrollable(true);

        int length = DeviceData.deviceData.size();
        viewport.setMaxX(length);
        for (int i=0; i<length; i++) {
            series.appendData(new DataPoint((double) i, DeviceData.deviceData.get(i)), true, 100);
        }
        live=true;
        counter = length;
        graph.addSeries(series);
    }

    protected void onDestroy(){
        super.onDestroy();
        live=false;
    }
}