package com.askjeffreyliu.camera2barcode.pager;

/**
 * Created by jeffreyliu on 3/25/17.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.askjeffreyliu.camera2barcode.R;

/**
 * A placeholder fragment containing a simple view.
 */
public class PlaceholderFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String ARG_SECTION_NUMBER = "section_number";
    private ImageView imageView;

    public PlaceholderFragment() {
    }

    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    public static PlaceholderFragment newInstance(int sectionNumber) {
        PlaceholderFragment fragment = new PlaceholderFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_test, container, false);
        imageView = (ImageView) rootView.findViewById(R.id.image);

        if (getArguments().getInt(ARG_SECTION_NUMBER) == 0) {
            imageView.setImageResource(R.drawable.qr);
        } else if (getArguments().getInt(ARG_SECTION_NUMBER) == 1) {
            imageView.setImageResource(R.drawable.datamatrix);
        } else {
            imageView.setImageResource(R.drawable.pdf417);
        }

        return rootView;
    }

    public void showOverlay(boolean show) {
        if (imageView != null) {
            imageView.setVisibility(show ? View.VISIBLE : View.GONE);
        }
    }
}
