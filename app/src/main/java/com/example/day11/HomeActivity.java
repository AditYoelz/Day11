package com.example.day11;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
    }

    public void goToBigDeals(View view) {
        startActivity(new Intent(this, BigDealsActivity.class));
    }

    public void goToFeed(View view) {
        startActivity(new Intent(this, FeedActivity.class));
    }

    public void goToFavorit(View view) {
        startActivity(new Intent(this, WishlistActivity.class));
    }
    public void goToTransaksi(View view) {
        startActivity(new Intent(this, TransactionActivity.class));
    }

    public void goToStore(View view) {
        startActivity(new Intent(this, BigDealsActivity.class));
    }

}
