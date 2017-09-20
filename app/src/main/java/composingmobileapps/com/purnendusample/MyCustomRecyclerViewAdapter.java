package composingmobileapps.com.purnendusample;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by anildeshpande on 9/20/17.
 */

public class MyCustomRecyclerViewAdapter extends RecyclerView.Adapter<MyCustomRecyclerViewAdapter.MyViewHolder> {

    private static final String TAG = MyCustomRecyclerViewAdapter.class.getSimpleName();

    private Context context;
    private List<Person> personList;

    public  MyCustomRecyclerViewAdapter(Context context, List<Person> personList){
        this.context = context;
        this.personList=personList;
    }

    @Override
    public int getItemCount() {
        return personList.size();
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.row_item_layoyt_two,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Person person=personList.get(position);
        holder.circleImageView.setTag(person.getImageUrl());
        holder.textView1.setText(person.getText1());
        holder.textView2.setText(person.getText2()+" - ");
        holder.textView3.setText(person.getText3());
    }

    class MyViewHolder extends RecyclerView.ViewHolder{


        public CircleImageView circleImageView;
        public TextView textView1, textView2, textView3;

        public MyViewHolder(View view){
            super(view);
            circleImageView = (CircleImageView)view.findViewById(R.id.imagePersonPic);
            textView1 = (TextView)view.findViewById(R.id.textView1);
            textView2=(TextView)view.findViewById(R.id.textView2);
            textView3 = (TextView)view.findViewById(R.id.textView3);

        }
    }
}
