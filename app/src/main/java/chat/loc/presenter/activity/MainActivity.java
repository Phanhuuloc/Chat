package chat.loc.presenter.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

import com.example.phoenix.myapplication.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import chat.loc.presenter.fragment.ContactListFragment;
import chat.loc.presenter.fragment.dummy.DummyContent;

public class MainActivity extends AppCompatActivity implements ContactListFragment.OnListFragmentInteractionListener {

    @BindView(R.id.frgmt_content)
    FrameLayout frgmtContent;
    @BindView(R.id.activity_main)
    RelativeLayout activityMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initialize();
    }

    private void initialize() {
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.frgmt_content, new ContactListFragment())
                .commit();
    }

    @Override
    public void onListFragmentInteraction(DummyContent.DummyItem item) {

    }
}
