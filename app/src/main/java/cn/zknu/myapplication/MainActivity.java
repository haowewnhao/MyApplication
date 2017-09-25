package cn.zknu.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final string TAG="mainactivity";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(view v) {
                startActivities(new Inten(MainActivity.this.SecondActivity. class)  );
            }
        });
        log.i(TAG"onCreat")
    }
        @override
            protected void onStart(){
                supur.onStert();
                log.i(TAG,"onStart")
        }
    @override
    protected void onPause(){
        supur.onStert();
        log.i(TAG,"onPause")
    }
    @override
    protected void onResume(){
        supur.onStert();
        log.i(TAG,"onResume")
    }
    @override
    protected void onRestart(){
        supur.onStert();
        log.i(TAG,"onRestart")
    }
}
