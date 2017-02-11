package com.example.zweng4.booktracker;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private EditText bookName;
    private EditText tagId;
    private EditText name;
    private Button confirm;
    private Button add;
    private Button reset;
    private HashMap<String, String> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bookName = (EditText) findViewById(R.id.bookName);
        tagId = (EditText) findViewById(R.id.tagId);
        //name = (EditText) findViewById(R.id.name);
        confirm = (Button) findViewById(R.id.confirm);
        add = (Button) findViewById(R.id.add);
        reset = (Button) findViewById(R.id.reset);
        map = new HashMap<>();

        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String tag = tagId.getText().toString().replace("\n", "").replace("\r", "");;
                String book = bookName.getText().toString().replace("\n", "").replace("\r", "");;
                map.put(tag,book);
                Toast.makeText(MainActivity.this,"item added",Toast.LENGTH_SHORT).show();
                tagId.setText("");
                bookName.setText("");
            }
        });
        confirm.setOnClickListener(new
                                              View.OnClickListener()
                                              {
                                                  @Override
                                                  public void onClick(View v) {
                                                      Intent intent = new Intent(getApplicationContext(), checkListActivity.class);
                                                      intent.putExtra("map", map);
                                                      startActivity(intent);
                                                  }
                                              }

        );
        reset.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                map = new HashMap<>();
                Toast.makeText(MainActivity.this,"items removed, new books",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
