package com.faveoffate.whdatasheet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Spinner;

public class CreateStatsFragment extends Fragment {
    String[] stats = new String[14];
    Spinner movementSpinner, weaponSkillSpinner, ballisticSkillSpinner,
            strengthSpinner, toughnessSpinner, woundsSpinner, initiativeSpinner,
            attackSpinner, leadershipSpinner, skillPointSpinner, fatePointSpinner,
            armorSaveSpinner, warpSaveSpinner, magicPointSpinner;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.create_stats, container, false);
    }
    public void onViewCreated(View v, Bundle savedInstanceState) {
        movementSpinner=(Spinner) v.findViewById(R.id.movementSpinner);
        weaponSkillSpinner=(Spinner) v.findViewById(R.id.weaponSkillSpinner);
        ballisticSkillSpinner=(Spinner) v.findViewById(R.id.ballisticSkillSpinner);
        strengthSpinner=(Spinner) v.findViewById(R.id.strengthSpinner);
        toughnessSpinner=(Spinner) v.findViewById(R.id.toughnessSpinner);
        woundsSpinner=(Spinner) v.findViewById(R.id.woundsSpinner);
        initiativeSpinner=(Spinner) v.findViewById(R.id.initiativeSpinner);
        attackSpinner=(Spinner) v.findViewById(R.id.attackSpinner);
        leadershipSpinner=(Spinner) v.findViewById(R.id.leadershipSpinner);
        skillPointSpinner=(Spinner) v.findViewById((R.id.skillPointSpinner));
        fatePointSpinner=(Spinner) v.findViewById((R.id.fatePointSpinner));
        armorSaveSpinner=(Spinner) v.findViewById((R.id.armorSaveSpinner));
        warpSaveSpinner=(Spinner) v.findViewById((R.id.warpSaveSpinner));
        magicPointSpinner=(Spinner) v.findViewById((R.id.magicPointSpinner));
        Button btn = (Button) v.findViewById(R.id.saveButton);
        btn.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                stats[0] = movementSpinner.getSelectedItem().toString();
                stats[1] = weaponSkillSpinner.getSelectedItem().toString();
                stats[2] = ballisticSkillSpinner.getSelectedItem().toString();
                stats[3] = strengthSpinner.getSelectedItem().toString();
                stats[4] = toughnessSpinner.getSelectedItem().toString();
                stats[5] = woundsSpinner.getSelectedItem().toString();
                stats[6] = initiativeSpinner.getSelectedItem().toString();
                stats[7] = attackSpinner.getSelectedItem().toString();
                stats[8] = leadershipSpinner.getSelectedItem().toString();
                stats[9] = skillPointSpinner.getSelectedItem().toString();
                stats[10] = fatePointSpinner.getSelectedItem().toString();
                stats[11] = armorSaveSpinner.getSelectedItem().toString();
                stats[12] = warpSaveSpinner.getSelectedItem().toString();
                stats[13] = magicPointSpinner.getSelectedItem().toString();
                ((Create)getActivity()).save(stats);
            }
        });
    }
}
