package fi.tut.saari5.lhfirebaseaku;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private EditText nro;
    private EditText nimi;
    private ListView mAkuListView;
    private ArrayAdapter mAkuListAdapter;

    //TODO muuttujat Firebase ja DatabaseReference tarvitaan

    //TODO muuttuja ChildEventListener tarvitaan

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //TODO Firebase ja DatabaseReference kytkennät tehdään

        nro=findViewById(R.id.editTextNumero);
        nimi=findViewById(R.id.editTextNimi);
        mAkuListView = (ListView) findViewById(R.id.listView);

        List<Aku> kaikkiAkut=new ArrayList<>();
        mAkuListAdapter = new AkuArrayAdapter(this, R.layout.item_aku, kaikkiAkut);
        mAkuListView.setAdapter(mAkuListAdapter);

        //TODO ChildEventListener luodaan tässä


        //TODO Kytketään DatabaseReference ja ChildEventListener

    }
    public void onClick(View view) {
        //ArrayAdapter<Aku> adapter=(ArrayAdapter<Aku>)getListAdapter();
        Aku aku = null;

        switch (view.getId()) {
            case R.id.add:
                // save the new comment to the database
                aku = new Aku();
                aku.setKirjanNumero(nro.getText().toString());
                aku.setKirjanNimi(nimi.getText().toString());


                //TODO DatabaseReferenceen tuupataan yllä luotu aku


                tyhjenna();
                break;
            case R.id.delete:
                Log.d("aku", "delete tuli");

                break;
        }
    }
    public void tyhjenna(){
        //tyhjennys
        nro.setText("");
        nimi.setText("");
    }
}
