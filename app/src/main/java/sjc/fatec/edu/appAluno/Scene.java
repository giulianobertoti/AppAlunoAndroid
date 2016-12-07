package sjc.fatec.edu.appAluno;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Scene extends AppCompatActivity {
    int value = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scene);

       /* Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        if (extras != null) {
            if (extras.containsKey("key")) {
                value = Integer.parseInt(extras.getString("key")); //if it's a string you stored
            }
        }*/

        Button btn=(Button) findViewById(R.id.btncena);


        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(Scene.this, Question.class);
                startActivity(it);
               /* Intent myIntent = new Intent(Scene.this, Question.class);
                myIntent.putExtra("key", value); //Optional parameters
                Scene.this.startActivity(myIntent);*/

            }


        });
    }




}

