package composingmobileapps.com.purnendusample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    MyCustomRecyclerViewAdapter myCustomRecyclerViewAdapter;
    LinearLayoutManager linearLayoutManager;
    TextView textViewsomeInfo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewsomeInfo = (TextView)findViewById(R.id.textView5);
        recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        textViewsomeInfo.setText("Today");

        myCustomRecyclerViewAdapter = new MyCustomRecyclerViewAdapter(this,getPeopleList());
        linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(myCustomRecyclerViewAdapter);



    }

    private List<Person> getPeopleList(){
        List<Person> personList=new ArrayList<Person>();
        personList.add(new Person("dummyurl","Brunch this week end?","Ali Connors","I will be in your neighbourhood" ));
        personList.add(new Person("dummyurl","Summar BBQ","TO Alex","Wish I could" ));
        personList.add(new Person("dummyurl","Qui Qui","Ali Connors","Do you have Paris" ));

        return personList;
    }


}
