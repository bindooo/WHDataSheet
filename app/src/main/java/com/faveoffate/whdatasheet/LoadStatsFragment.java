package com.faveoffate.whdatasheet;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LoadStatsFragment extends Fragment {
    public Context context;
    TextView loadMovementValue, loadWeaponSkillValue, loadBallisticSkillValue,
            loadStrengthValue, loadToughnessValue, loadWoundsValue, loadInitiativeSkillValue,
            loadAttackValue, loadLeadershipValue, loadSkillPointValue, loadFatePointValue,
            loadArmorSaveValue, loadWarpSaveValue, loadMagicPointValue;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.load_stats, container, false);
    }
    public void onViewCreated(View v, Bundle savedInstanceState) {
        context = getActivity();
        loadMovementValue = (TextView) v.findViewById(R.id.loadMovementValue);
        loadWeaponSkillValue = (TextView) v.findViewById(R.id.loadWeaponSkillValue);
        loadBallisticSkillValue = (TextView) v.findViewById(R.id.loadBallisticSkillValue);
        loadStrengthValue = (TextView) v.findViewById(R.id.loadStrengthValue);
        loadToughnessValue = (TextView) v.findViewById(R.id.loadToughnessValue);
        loadWoundsValue = (TextView) v.findViewById(R.id.loadWoundsValue);
        loadInitiativeSkillValue = (TextView) v.findViewById(R.id.loadInitiativeSkillValue);
        loadAttackValue = (TextView) v.findViewById(R.id.loadAttackValue);
        loadLeadershipValue = (TextView) v.findViewById(R.id.loadLeadershipValue);
        loadSkillPointValue = (TextView) v.findViewById(R.id.loadSkillPointValue);
        loadFatePointValue = (TextView) v.findViewById(R.id.loadFatePointValue);
        loadArmorSaveValue = (TextView) v.findViewById(R.id.loadArmorSaveValue);
        loadWarpSaveValue = (TextView) v.findViewById(R.id.loadWarpSaveValue);
        loadMagicPointValue = (TextView) v.findViewById(R.id.loadMagicPointValue);

        loadMovementValue.setText(((Load)context).stats[0]);
        loadWeaponSkillValue.setText(((Load)context).stats[1]);
        loadBallisticSkillValue.setText(((Load)context).stats[2]);
        loadStrengthValue.setText(((Load)context).stats[3]);
        loadToughnessValue.setText(((Load)context).stats[4]);
        loadWoundsValue.setText(((Load)context).stats[5]);
        loadInitiativeSkillValue.setText(((Load)context).stats[6]);
        loadAttackValue.setText(((Load)context).stats[7]);
        loadLeadershipValue.setText(((Load)context).stats[8]);
        loadSkillPointValue.setText(((Load)context).stats[9]);
        loadFatePointValue.setText(((Load)context).stats[10]);
        loadArmorSaveValue.setText(((Load)context).stats[11]);
        loadWarpSaveValue.setText(((Load)context).stats[12]);
        loadMagicPointValue.setText(((Load)context).stats[13]);
    }
}
