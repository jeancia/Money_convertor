package fr.m2i.convertisseur;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends Activity {

    private EditText txtUSD;
    private EditText txtEUR;

    private final double TAUX = 1.1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtUSD = (EditText) findViewById(R.id.txtUSD);
        txtEUR = (EditText) findViewById(R.id.txtEUR);
    }


    public void onFocusChange (View v, boolean bernard) {
        try {
            String sUsd = txtUSD.getText().toString().replace(',', '.');
            double usd = Double.parseDouble(sUsd);
            double eur = usd * TAUX;
            txtEUR.setText (String.format("%.2f", eur));
        }
        catch (Exception ex) {

        }

    }


    public void calculate (View v) {
        double usd = Double.parseDouble(txtUSD.getText().toString());
        Double eur = usd / 1.1;
        txtEUR.setText(String.format("%.2f", eur));
    }

    public void quit (View v) {
        finish();
        }
    }

