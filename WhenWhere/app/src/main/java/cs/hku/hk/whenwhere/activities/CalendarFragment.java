package cs.hku.hk.whenwhere.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import cs.hku.hk.whenwhere.R;

import java.util.ArrayList;
import java.util.List;

import cs.hku.hk.whenwhere.R;
import cs.hku.hk.whenwhere.adapters.Activity_recycle;
import cs.hku.hk.whenwhere.adapters.Events_recycle;
import cs.hku.hk.whenwhere.model.Activities;
import cs.hku.hk.whenwhere.model.Events;

public class CalendarFragment extends Fragment {
    Button addButton;
    Button weekly;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.outer_fragment_calendar,null);
        addButton = (Button)view.findViewById(R.id.addEvent);
        weekly = (Button)view.findViewById(R.id.weekly);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getActivity(),AddEventActivity.class);
                startActivity(intent);
            }
        });

        weekly.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getActivity(),WeeklyActivity.class);
                startActivity(intent);
            }
        });

        return view;

    }
}
