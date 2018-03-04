package keyg.com.example.ash.udacity;

import android.content.Intent;
import android.graphics.Typeface;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       Typeface tf=Typeface.createFromAsset(getAssets(),"Steinerlight.ttf");
        TextView u,num,mount,latham;
        Button b=findViewById(R.id.learn);
        b.setTypeface(tf);
        u=findViewById(R.id.u);
        num=findViewById(R.id.num);
        mount=findViewById(R.id.mount);
        latham=findViewById(R.id.latham);
        u.setTypeface(tf);
        num.setTypeface(tf);
        mount.setTypeface(tf);
        latham.setTypeface(tf);
        ImageView im,map;
        map=findViewById(R.id.map);
        im=findViewById(R.id.call);
        im.setClickable(true);
        im.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,"Calling",Toast.LENGTH_SHORT).show();
                String phone="+650-555-5555";
                Intent intent = new Intent(Intent.ACTION_DIAL,Uri.fromParts("tel",phone,null));
                startActivity(intent);
            }
        });

        map.setClickable(true);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Main2Activity.this,"Rendering",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.google.co.in/maps/place/Udacity/@37.3998641,-122.1105883,17z/data=!3m1!4b1!4m5!3m4!1s0x808fb098442c2e3d:0xf6e99228e4a6b53c!8m2!3d37.3998641!4d-122.1083996?dcr=0"));
                startActivity(intent);
            }
        });


       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent();
               intent.setAction(Intent.ACTION_VIEW);
               intent.addCategory(Intent.CATEGORY_BROWSABLE);
               intent.setData(Uri.parse("https://in.udacity.com/"));
               startActivity(intent);
           }
       });
    }
}
