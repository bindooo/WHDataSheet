package com.faveoffate.whdatasheet;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class LoadStatsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.load_stats, container, false);
    }

    public void onViewCreated(View v, Bundle savedInstanceState) {
        Context context = getActivity();

        TextView loadMovementValue = (TextView) v.findViewById(R.id.loadMovementValue);
        TextView loadWeaponSkillValue = (TextView) v.findViewById(R.id.loadWeaponSkillValue);
        TextView loadBallisticSkillValue = (TextView) v.findViewById(R.id.loadBallisticSkillValue);
        TextView loadStrengthValue = (TextView) v.findViewById(R.id.loadStrengthValue);
        TextView loadToughnessValue = (TextView) v.findViewById(R.id.loadToughnessValue);
        TextView loadWoundsValue = (TextView) v.findViewById(R.id.loadWoundsValue);
        TextView loadInitiativeSkillValue = (TextView) v.findViewById(R.id.loadInitiativeSkillValue);
        TextView loadAttackValue = (TextView) v.findViewById(R.id.loadAttackValue);
        TextView loadLeadershipValue = (TextView) v.findViewById(R.id.loadLeadershipValue);
        TextView loadSkillPointValue = (TextView) v.findViewById(R.id.loadSkillPointValue);
        TextView loadFatePointValue = (TextView) v.findViewById(R.id.loadFatePointValue);
        TextView loadArmorSaveValue = (TextView) v.findViewById(R.id.loadArmorSaveValue);
        TextView loadWarpSaveValue = (TextView) v.findViewById(R.id.loadWarpSaveValue);
        TextView loadMagicPointValue = (TextView) v.findViewById(R.id.loadMagicPointValue);
        TextView loadNameValue = (TextView) v.findViewById(R.id.loadNameValue);

        loadMovementValue.setText(((LoadActivity) context).stats[0]);
        loadWeaponSkillValue.setText(((LoadActivity) context).stats[1]);
        loadBallisticSkillValue.setText(((LoadActivity) context).stats[2]);
        loadStrengthValue.setText(((LoadActivity) context).stats[3]);
        loadToughnessValue.setText(((LoadActivity) context).stats[4]);
        loadWoundsValue.setText(((LoadActivity) context).stats[5]);
        loadInitiativeSkillValue.setText(((LoadActivity) context).stats[6]);
        loadAttackValue.setText(((LoadActivity) context).stats[7]);
        loadLeadershipValue.setText(((LoadActivity) context).stats[8]);
        loadSkillPointValue.setText(((LoadActivity) context).stats[9]);
        loadFatePointValue.setText(((LoadActivity) context).stats[10]);
        loadArmorSaveValue.setText(((LoadActivity) context).stats[11]);
        loadWarpSaveValue.setText(((LoadActivity) context).stats[12]);
        loadMagicPointValue.setText(((LoadActivity) context).stats[13]);
        loadNameValue.setText(((LoadActivity) context).stats[14]);
    }
}
