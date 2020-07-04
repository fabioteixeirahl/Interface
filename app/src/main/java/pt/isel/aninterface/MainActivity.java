package pt.isel.aninterface;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import pt.isel.aninterface.model.CounterModel;
import pt.isel.aninterface.view.CounterLog;

public class MainActivity extends Activity {

    Button inc, dec;

    CounterLog logView;
    CounterModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        model = new CounterModel();

        logView = findViewById(R.id.view);
        model.addListener(logView);

        inc = findViewById(R.id.inc);
        dec = findViewById(R.id.dec);

        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.inc();
            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                model.dec();
            }
        });

    }

    /*View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            if (v == inc) {
                model.inc();
            }else if (v == dec) {
                model.dec();
            }
        }
    };*/

}