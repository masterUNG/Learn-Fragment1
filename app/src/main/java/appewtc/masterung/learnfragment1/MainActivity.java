package appewtc.masterung.learnfragment1;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements MainFragment.OnFragmentInteractionListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }   // Main Method

    @Override
    public void onFragmentInteraction(Uri uri) {

    }   // onFragmentInteraction

}   // Main Class
