package com.faveoffate.whdatasheet;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Load extends AppCompatActivity {
    String[] stats = new String[14];
    String skills, inventory;
    boolean afterSkills, afterInventory;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.load_fragments);

        Toolbar toolbar = (Toolbar) findViewById(R.id.load_toolbar);
        setSupportActionBar(toolbar);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.load_tab_layout);
        tabLayout.addTab(tabLayout.newTab().setText("STATS"));
        tabLayout.addTab(tabLayout.newTab().setText("SKILLS"));
        tabLayout.addTab(tabLayout.newTab().setText("INVENTORY"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.load_pager);
        final LoadFragmentPageAdapter adapter = new LoadFragmentPageAdapter
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
        load();
        sendToFragments();
    }
    public void load() {
        int i = 0;
        try {
            InputStream inputStream = openFileInput("char1.txt");

            if ( inputStream != null ) {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String receiveString = "";
                StringBuilder skillsBuilder = new StringBuilder();
                StringBuilder inventoryBuilder = new StringBuilder();

                while ( (receiveString = bufferedReader.readLine()) != null ) {
                    if (receiveString.equals("skills")) {
                        afterSkills = true;
                        continue;
                    }
                    if (receiveString.equals("inventory")) {
                        afterInventory = true;
                        continue;
                    }
                    if (!afterSkills && !afterInventory) {
                        stats[i] = receiveString;
                        i++;
                    }
                    if (afterSkills && !afterInventory) {
                        skillsBuilder.append(receiveString);
                        skillsBuilder.append("\n");
                    }
                    if (afterSkills && afterInventory) {
                        inventoryBuilder.append(receiveString);
                        inventoryBuilder.append("\n");
                    }
                }
                inputStream.close();
                skills = skillsBuilder.toString();
                inventory = inventoryBuilder.toString();
            }
        }
        catch (FileNotFoundException e) {
            Log.e("Load activity ", "File not found: " + e.toString());
        } catch (IOException e) {
            Log.e("Load activity ", "Can not read file: " + e.toString());
        }
    }
    public void sendToFragments() {
        for(int i = 0; i < stats.length; i++)
            Log.d("Stats: ", stats[i]);
        Log.d("Skills: ", skills);
        Log.d("Inventory: ", inventory);
    }
}
