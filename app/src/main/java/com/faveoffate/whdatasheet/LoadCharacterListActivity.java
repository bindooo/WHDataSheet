package com.faveoffate.whdatasheet;

import android.app.ListActivity;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;

public class LoadCharacterListActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.load_charlist);

        ListView lv = (ListView) findViewById(android.R.id.list);

        PackageManager pm = getPackageManager();
        String appPath = getPackageName();

        try {
            PackageInfo p = pm.getPackageInfo(appPath, 0);
            appPath = p.applicationInfo.dataDir + "/files";
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("CharList", "Error Package name not found ", e);
        }

        ArrayList<String> arr1 = GetFiles(appPath);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(LoadCharacterListActivity.this, R.layout.mytextview, arr1);

        lv.setAdapter(adapter);
    }

    private ArrayList<String> GetFiles(String path) {

        ArrayList<String> arr2 = new ArrayList<>();
        File file = new File(path);
        File[] allfiles = file.listFiles();
        if (allfiles.length == 0) {
            return null;
        } else {
            for (int i = 0; i < allfiles.length; i++) {
                if (allfiles[i].getName().contains(".txt"))
                    arr2.add(allfiles[i].getName());
            }
        }
        return arr2;
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l, v, position, id);

        String fileName = (String) (l.getItemAtPosition(position));
        Intent i = new Intent(LoadCharacterListActivity.this, LoadActivity.class);
        i.putExtra("FILE_NAME", fileName);
        startActivity(i);
    }
}
