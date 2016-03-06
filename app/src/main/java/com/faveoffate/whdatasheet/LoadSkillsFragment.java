package com.faveoffate.whdatasheet;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LoadSkillsFragment extends Fragment {
    public Context context;
    TextView skillsText;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.load_skills, container, false);
    }
    public void onViewCreated(View v, Bundle savedInstanceState) {
        context = getActivity();
        skillsText = (TextView) v.findViewById(R.id.skillsText);

        skillsText.setText(((Load)context).skills);
    }
}
