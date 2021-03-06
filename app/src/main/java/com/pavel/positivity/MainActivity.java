package com.pavel.positivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recycleview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        QuotesData[] quotesData = new QuotesData[]{
                new QuotesData("The purpose of our lives is to be happy","- Dalai Lama", R.drawable.save),
                    new QuotesData("If you do what you’ve always done, you’ll get what you’ve always gotten","- Tony Robbins", R.drawable.save),
                new QuotesData("I am thankful for all of those who said NO to me. It’s because of them I’m doing it myself","-Albert Einstein", R.drawable.save),
                new QuotesData("If you’re offered a seat on a rocket ship, don’t ask what seat! Just get on.","-Sheryl Sandberg", R.drawable.save),
                new QuotesData("You get what you settle for","- Thelma and Louise", R.drawable.save),
                new QuotesData("If you don’t build your dream, someone else will hire you to help them build theirs","-Dhirubhai Ambani", R.drawable.save),
                new QuotesData("Don’t judge each day by the harvest you reap but by the seeds that you plant","-Robert Louis Stevenson", R.drawable.save),
                new QuotesData("Life is being on the wire, everything else is just waiting","-Karl Wallenda", R.drawable.save),
                new QuotesData("Pearls don’t lie on the seashore. If you want one, you must dive for it","- Chinese proverb", R.drawable.save),
                new QuotesData("The first step toward success is taken when you refuse to be a captive of the environment in which you first find yourself.","-Mark Caine", R.drawable.save),
                new QuotesData("It is never too late to be what you might have been","-George Eliot", R.drawable.save),
                new QuotesData("The question isn’t who is going to let me; it’s who is going to stop me","-Ayn Rand", R.drawable.save),
                new QuotesData("Always go with your passions. Never ask yourself if it’s realistic or not","- Deepak Chopra", R.drawable.save),
                new QuotesData("If things seem under control, you are just not going fast enough","-Mario Andretti", R.drawable.save),
                new QuotesData("Leap and the net will appear","-Zen Proverb", R.drawable.save),
                new QuotesData("Every man dies, but not every man really lives","-Braveheart", R.drawable.save),
                new QuotesData("Don’t worry about failures, worry about the chances you miss when you don’t even try.","- Jack Canfield", R.drawable.save),





        };

        QuotesAdapter quotesAdapter=new QuotesAdapter(quotesData,MainActivity.this);
        recyclerView.setAdapter(quotesAdapter);
    }
}