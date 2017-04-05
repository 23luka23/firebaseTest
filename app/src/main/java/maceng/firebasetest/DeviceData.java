package maceng.firebasetest;


import android.content.Intent;
import android.util.Log;

import java.util.ArrayList;

public class DeviceData {

    public static ArrayList<Double> deviceData = new ArrayList<Double>();
    public int convData;

    public DeviceData() {};

//    public DeviceData(String data) {
//        this.setData(data);
//    }

    public ArrayList getData(){
        return this.deviceData;
    }

//    public void setData(String data){
//            if (data!=null) {
////            Log.d("BLUETOOTH DATA", data);
//                try {
//                    convData = Integer.parseInt(data);
//                }catch (Exception e){
//                    Log.d("STRING CONVERSION", e.toString());
//                    convData = 0;
//                }
//                this.deviceData.add((double) convData);
////            Log.d("DEVICE DATA", "value: " + this.deviceData);
//        }
//    }

}

