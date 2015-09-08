package com.example.seanm.storyapp.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.seanm.storyapp.R;

public class StoryActivity extends AppCompatActivity {

    private EditText mNameField;
    private Button mStartButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        mNameField = (EditText)findViewById(R.id.nameEditText);
        mStartButton = (Button)findViewById(R.id.startButton);

        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
                public void onClick(View v) {
                String name = mNameField.getText().toString();
                startBook(name);
            }
        });
    }

    private void startBook(String name) {
        Intent intent = new Intent(this, BookActivity.class);
        intent.putExtra(getString(R.string.key_name), name);
        startActivity(intent);

    }
    @Override
    protected void onResume() {
        super.onResume();
        mNameField.setText("");
    }
}
