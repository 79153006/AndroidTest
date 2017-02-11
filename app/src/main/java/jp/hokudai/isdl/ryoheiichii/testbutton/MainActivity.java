package jp.hokudai.isdl.ryoheiichii.testbutton;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private ImageView imageView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView)findViewById(R.id.image_view);

        Bitmap bitmap1 = BitmapFactory.decodeResource(getResources(),R.drawable.bag);

        int imageWidth = bitmap1.getWidth();
        int imageHeight = bitmap1.getHeight();

        Matrix matrix = new Matrix();

        matrix.preScale(-1.0f,1.0f);

        Bitmap bitmap2 = Bitmap.createBitmap(bitmap1,0,0,imageWidth,imageHeight,matrix,true);

        imageView.setImageBitmap(bitmap2);

    }

}
