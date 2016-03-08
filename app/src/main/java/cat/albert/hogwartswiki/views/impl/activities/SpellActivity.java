package cat.albert.hogwartswiki.views.impl.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

import cat.albert.hogwartswiki.R;

import cat.albert.hogwartswiki.models.business.entities.Spell;
import cat.albert.hogwartswiki.presenters.impl.MainSpellViewPresenterImpl;
import cat.albert.hogwartswiki.presenters.interfaces.IMainSpellViewPresenter;
import cat.albert.hogwartswiki.views.impl.adapters.SpellListAdapter;
import cat.albert.hogwartswiki.views.interfaces.IMainSpellView;

/**
 * Created by albert on 17/02/2016.
 */
public class SpellActivity extends AppCompatActivity implements IMainSpellView, AdapterView.OnItemClickListener {

    private ProgressBar progressBar;
    private Button btnRetry;
    private IMainSpellViewPresenter presenter;
    private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        list = (ListView) findViewById(R.id.list);
        progressBar = (ProgressBar) findViewById(R.id.progress);
        btnRetry = (Button) findViewById(R.id.retry);

        presenter = new MainSpellViewPresenterImpl();
        presenter.onCreate(this, getBaseContext());
        presenter.getPersonsFromService();
    }



    @Override
    public SpellListAdapter createPersonAdapter(List<Spell> spells) {
        return new SpellListAdapter(this, spells);
    }


    public void goToDetailActivity(Spell spell) {
//        Intent intent = new Intent(this, SecondActivity.class);
//        intent.putExtra("PERSON", Parcels.wrap(character));
//        startActivity(intent);
    }

    public void createList(SpellListAdapter adapter) {
        list.setAdapter(adapter);
        list.setOnItemClickListener(this);
    }


    public void showProgressBar() {
        progressBar.setVisibility(View.VISIBLE);
    }

    public void hideProgressBar() {
        progressBar.setVisibility(View.GONE);
    }

    public void showRetryButton() {
        btnRetry.setVisibility(View.VISIBLE);
    }

    public void hideRetryButton() {
        btnRetry.setVisibility(View.GONE);
    }

    public void showList() {
        list.setVisibility(View.VISIBLE);
    }

    public void hideList() {
        list.setVisibility(View.GONE);
    }

    public void showMessage(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//        Intent i = new Intent(this, SecondActivity.class);
//
//
//        Character character = (Character) parent.getItemAtPosition(position);
//        Bundle b = new Bundle();
//        b.putSerializable(getString(R.string.intent_param_character), character);
//        i.putExtras(b);
//
//        startActivityForResult(i, INTENT_REQUEST);
//
//        presenter.onItemClicked(position);
    }
}