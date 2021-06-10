package ru.geekbrains.lession3.calcrunner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonsInit();
    }

    private void buttonsInit()
    {
        Button runCalcButton = findViewById(R.id._run_button);
        runCalcButton.setOnClickListener(this);
        Button runSettingsButton = findViewById(R.id._run_settings_button);
        runSettingsButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id._run_button:
                Intent runCalculator = new Intent("ru.geekbrains.lession5.calculate");
                startActivity(runCalculator);
                break;
            case R.id._run_settings_button:
                Intent runSettingsCalculator = new Intent("ru.geekbrains.lession5.calculate.settings");
                startActivity(runSettingsCalculator);
                break;
            default:
                break;
        }
    }
}