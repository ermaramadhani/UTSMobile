package mobileprogramming.cafe;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import mobileprogramming.cafe.dummy.DummyContent;
import mobileprogramming.cafe.dummy.DummyContent.DummyItem;

import java.util.List;

public class Food extends Fragment  {

    int [] gambar={
            R.drawable.ic_menu_home,
            R.drawable.ic_menu_home,
            R.drawable.ic_menu_home,
            R.drawable.ic_menu_home,
            R.drawable.ic_menu_home,
            R.drawable.ic_menu_home,
            R.drawable.ic_menu_home,
            R.drawable.ic_menu_home,
    };

    ListView list;
    String[] judul= {"Froyo", "Gingerbread", "Ice Cream Sandwich", "Jelly Bean", "Kitkat", "Lollipop", "Marshmallow", "Nougat"};

    public Food(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        return inflater.inflate(R.layout.fragment_food, container, false);
    }


}

