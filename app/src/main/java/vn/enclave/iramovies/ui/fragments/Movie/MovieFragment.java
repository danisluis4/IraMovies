package vn.enclave.iramovies.ui.fragments.Movie;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import vn.enclave.iramovies.R;
import vn.enclave.iramovies.ui.fragments.Base.IRBaseFragment;

/**
 * Created by lorence on 08/11/2017.
 * @Run:
 */

public class MovieFragment extends IRBaseFragment {
    @Override
    public View getViewLayout(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_movies, container, false);
    }

    @Override
    public void fragmentCreated() {

    }
}
