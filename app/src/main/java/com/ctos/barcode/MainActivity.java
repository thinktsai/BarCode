package com.ctos.barcode;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ctos.barcodelibrary.BarCode;
import java.util.EnumMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout l = new LinearLayout(this);
        l.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT));
        l.setOrientation(LinearLayout.VERTICAL);

        setContentView(l);

        // barcode data
        String barcode_data = "123456";

        // barcode image
        Bitmap bitmap = null;
        ImageView iv = new ImageView(this);

        BarCode bc = new BarCode();

        bitmap = bc.encodeToBitmap(barcode_data, BarCode.QR_CODE, 600, 300);

        if (bitmap != null)
            iv.setImageBitmap(bitmap);

        l.addView(iv);

        //barcode text
        TextView tv = new TextView(this);
        tv.setGravity(Gravity.CENTER_HORIZONTAL);
        tv.setText(barcode_data);

        l.addView(tv);

    }

}
