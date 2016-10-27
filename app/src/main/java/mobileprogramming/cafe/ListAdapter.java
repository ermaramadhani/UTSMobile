package mobileprogramming.cafe;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import mobileprogramming.cafe.dummy.DummyContent.DummyItem;

/**
 * {@link RecyclerView.Adapter} that can display a {@link DummyItem} and makes a call to the

 * TODO: Replace the implementation with code for your data type.
 */
public class ListAdapter extends BaseAdapter
{
    private Activity activity;
    private int[] gambar;
    private String[] deskripsi;
    private LayoutInflater inflater;
    public ListAdapter(Activity activity, int[] gambar, String[] deskripsi)
    {
        this.activity=activity;
        this.gambar=gambar;
        this.deskripsi=deskripsi;
    }
    @Override
    public int getCount() {
        return deskripsi.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        Holder holder=new Holder();
        if (inflater==null)
            inflater=(LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.fragment_foodlist,null);
        holder.textDeskrip=(TextView) convertView.findViewById(R.id.content);
        holder.textDeskrip.setText(deskripsi[position]);
        holder.imageGambar=(ImageView) convertView.findViewById(R.id.gambar);
        holder.imageGambar.setImageResource(gambar[position]);
        return convertView;
    }

    public class Holder
    {
        TextView textDeskrip;
        ImageView imageGambar;
    }
}
