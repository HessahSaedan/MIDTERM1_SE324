package com.example.midterm1_se324;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
    Integer [] Animals = {R.drawable.cat4,R.drawable.cub2,R.drawable.deer8};
    ImageView pic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        TextView Teext3 = (TextView) findViewById(R.id.textView3);

        GridView grid = (GridView) findViewById(R.id.GridView);
        final ImageView pic = (ImageView) findViewById(R.id.imageView);
        grid.setAdapter(new ImageAdapter(this));

        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(getBaseContext(),  /*using getbasecontext is better than the class name in itemClick*/
                        "Selected Species" + position + 1,Toast.LENGTH_SHORT).show();
                pic.setImageResource(Animals[position]);


            }
        });

    }
    public class ImageAdapter extends BaseAdapter {

        private Context context;

        public ImageAdapter (Context c){
            context = c;

        }

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int position,
                            View convertview, ViewGroup parent) {
            pic = new ImageView(context);
            pic.setImageResource(Animals[position]);
            pic.setScaleType(ImageView.ScaleType.CENTER_CROP);
            pic.setLayoutParams(new ViewGroup.LayoutParams(300,300));

            return pic;
        }
    }
}