package com.example.sdfgh;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public static void main(String[] args) {
        Note Note1 = new Note();
        Note Note2 = new Note();
        User User1 = new User();
        User User2 = new User();

        Note1.title = "wonderrideBook";
        Note1.content = "Primitive";
        Note1.Date = "15/4/2565";

        Note2.title = "wonder";
        Note2.content = "Phease2";
        Note2.Date = "4/4/2566";

        User1.UserName = "Mordredkaiser";
        User1.password = "Mordred";

        User2.UserName = "SHio";
        User2.password = "Hiseki";
    }
}
