package org.descendant.utility;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceCategory;
import android.support.v7.preference.PreferenceScreen;
import android.support.v7.preference.PreferenceFragmentCompat;

import com.android.settings.R;
import com.android.settings.SettingsPreferenceFragment;

import com.android.internal.logging.nano.MetricsProto;

public class AggressiveBattery extends SettingsPreferenceFragment {

    @Override
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.aggressive_battery);

        PreferenceScreen preferenceScreen = getPreferenceScreen();
        mFooterPreferenceMixin.createFooterPreference().setTitle(R.string.aggressive_battery_warning_text);

    }

    @Override
    public int getMetricsCategory() {
        return MetricsProto.MetricsEvent.DESCENDANT_SETTINGS;
    }
}
