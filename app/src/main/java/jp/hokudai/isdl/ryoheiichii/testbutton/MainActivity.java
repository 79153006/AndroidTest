package jp.hokudai.isdl.ryoheiichii.testbutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnTouchListener{

    private ImageView imageView;
    private int preDx,preDy,newDx,newDy;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.image_view);

        imageView.setOnTouchListener(this);

        preDx=preDy=newDy=newDx=0;

    }

    public boolean onTouch(View v, MotionEvent event) {
        newDx = (int) event.getRawX();
        newDy = (int) event.getRawY();

        switch (event.getAction()){
            case MotionEvent.ACTION_MOVE:
                int dx = imageView.getLeft() + (newDx - preDx);
                int dy = imageView.getTop() + (newDy - preDy);

                imageView.layout(dx,dy,dx + imageView.getWidth(),dy+imageView.getHeight());

                break;
        }

        preDx = newDx;
        preDy = newDy;

        return true;
    }

}
