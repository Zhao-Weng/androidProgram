import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import com.example.zweng4.test_listview.R;

class EfficientAdapter extends BaseAdapter {
    Context con;

    public EfficientAdapter(Context con) {
        this.con = con;

    }

    @Override
    public int getCount() {

        return list.size();
    }

    @Override
    public Object getItem(int position) {

        return position;
    }

    @Override
    public long getItemId(int position) {

        return position;
    }

    @Override
    public View getView(int position, View convertView,
                        ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) con
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.homemplebrowview, parent, false);

        Button row = (Button) rowView.findViewById(R.id.listbutton);


        final int n = position;
        row.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent next = new Intent(context, Home.class);
                startActivity(next);

            }
        });

        return rowView;
    }
}