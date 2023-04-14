package com.shivani.menubar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imgmenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgmenu = findViewById(R.id.imgmenu);

        imgmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu menu = new PopupMenu(MainActivity.this,imgmenu);
                menu.getMenuInflater().inflate(R.menu.option,menu.getMenu());

                menu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {

                        switch (menuItem.getItemId()) {
                            case R.id.setting:
                                Toast.makeText(MainActivity.this, "setting", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.newgroup:
                                Toast.makeText(MainActivity.this, "New Group", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.aboutus:
                                Toast.makeText(MainActivity.this, "About us", Toast.LENGTH_SHORT).show();
                                break;
                            case R.id.feedback:
                                Toast.makeText(MainActivity.this, "Feedback", Toast.LENGTH_SHORT).show();
                                break;


                        }
                        return false;
                    }
                });
                menu.show();

            }
        });
    }

}