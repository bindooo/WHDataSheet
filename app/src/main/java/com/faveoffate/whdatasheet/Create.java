package com.faveoffate.whdatasheet;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Toast;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class Create extends AppCompatActivity {
    Context context;
    String skills, inventory;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_fragments);

        Toolbar toolbar = (Toolbar) findViewById(R.id.create_toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.create_tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("STATS"));
        tabLayout.addTab(tabLayout.newTab().setText("SKILLS"));
        tabLayout.addTab(tabLayout.newTab().setText("INVENTORY"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.create_pager);
        final CreateFragmentPageAdapter adapter = new CreateFragmentPageAdapter
                (getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
        context = getApplicationContext();
    }
    public void save(String[] stats) {
        try {
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(context.openFileOutput("char1.txt", Context.MODE_PRIVATE));
            for (int i = 0; i < stats.length; i++) {
                outputStreamWriter.write(stats[i]);
                outputStreamWriter.write("\n");
            }
            outputStreamWriter.write("skills");
            outputStreamWriter.write("\n");
            outputStreamWriter.write(skills);
            outputStreamWriter.write("\n");
            outputStreamWriter.write("inventory");
            outputStreamWriter.write("\n");
            outputStreamWriter.write(inventory);
            outputStreamWriter.write("\n");
            outputStreamWriter.close();
            Toast.makeText(Create.this, "Your shit is saved", Toast.LENGTH_LONG).show();
        } catch (IOException e) {
            Toast.makeText(Create.this, e.toString(), Toast.LENGTH_LONG).show();
        }
    }
    void onTextChanged(String text, String fragment){
        if (fragment.equals("skills"))
            this.skills=text;
        else
            this.inventory=text;
    }
}
