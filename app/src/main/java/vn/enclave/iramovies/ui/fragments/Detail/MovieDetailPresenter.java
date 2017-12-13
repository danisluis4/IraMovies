package vn.enclave.iramovies.ui.fragments.Detail;

import android.content.Context;

import vn.enclave.iramovies.local.storage.entity.Movie;
import vn.enclave.iramovies.local.storage.entity.Reminder;
import vn.enclave.iramovies.services.response.CastAndCrewResponse;

/**
 *
 * Created by lorence on 23/11/2017.
 */

class MovieDetailPresenter implements IMovieDetailPresenter{

    /**
     * Context
     */
    private final Context mContext;

    /**
     * IMovieDetailView
     */
    private IMovieDetailView mMovieDetailView;

    /**
     * IMovieDetailModel
     */
    private IMovieDetailModel mMovieDetailModel;

    MovieDetailPresenter(Context context) {
        this.mContext = context;
        mMovieDetailModel = new MovieDetailModel(mContext);
        mMovieDetailModel.attachView(this);
    }

    @Override
    public void attachView(IMovieDetailView view) {
        this.mMovieDetailView = view;
    }

    @Override
    public void getCastAndCrewFromApi(int movieId) {
        mMovieDetailModel.getCastAndCrewFromApi(movieId);
    }

    @Override
    public void onSuccess(CastAndCrewResponse castAndCrewResponse) {
        mMovieDetailView.onSuccess(castAndCrewResponse);
    }

    @Override
    public void onFailure(String message) {
        mMovieDetailView.onFailure(message);
    }

    @Override
    public void cancelProcessing() {
        mMovieDetailModel.cancelProcessing();
    }

    @Override
    public void deleteMovie(Movie movie) {
        mMovieDetailModel.deleteMovie(movie);
    }

    @Override
    public void deleteMovieSuccess(Movie movie) {
        if (mMovieDetailView != null) {
            mMovieDetailView.deleteMovieSuccess(movie);
        }
    }

    @Override
    public void addMovieSuccess(Movie movie) {
        if (mMovieDetailView != null) {
            mMovieDetailView.addMovieSuccess(movie);
        }
    }

    @Override
    public void addMovie(Movie movie) {
        mMovieDetailModel.addMovie(movie);
    }

    @Override
    public void addReminder(Reminder reminder) {
        mMovieDetailModel.addReminder(reminder);
    }

    @Override
    public void updateReminder(Reminder reminder) {
        mMovieDetailModel.updateReminder(reminder);
    }

    @Override
    public void updateReminderSuccess(Reminder reminder) {
        if (mMovieDetailView != null) {
            mMovieDetailView.updateReminderSuccess(reminder);
        }
    }

    @Override
    public void addReminderSuccess(Reminder reminder) {
        if (mMovieDetailView != null) {
            mMovieDetailView.addReminderSuccess(reminder);
        }
    }

    @Override
    public void getReminderMovie(int id) {
        mMovieDetailModel.getReminderMovie(id);
    }

    @Override
    public void findReminderSuccess(Reminder reminder) {
        if (mMovieDetailView != null) {
            mMovieDetailView.findReminderSuccess(reminder);
        }
    }

    @Override
    public void getMovie(Integer id) {
        mMovieDetailModel.getMovie(id);
    }

    @Override
    public void findMovieSuccess(Movie movie) {
        if (mMovieDetailView != null) {
            mMovieDetailView.findMovieSuccess(movie);
        }
    }
}
