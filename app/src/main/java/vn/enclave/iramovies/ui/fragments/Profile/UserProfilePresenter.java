package vn.enclave.iramovies.ui.fragments.Profile;

import android.content.Context;

import java.util.List;

import vn.enclave.iramovies.local.storage.entity.Reminder;
import vn.enclave.iramovies.local.storage.entity.User;

/**
 *
 * Created by lorence on 04/12/2017.
 */

public class UserProfilePresenter implements IUserProfilePresenter{

    /**
     * Context
     */
    private final Context mContext;

    /**
     * IInboxView
     */
    private IUserProfileView mUserProfileView;

    /**
     * IEditUserProfileModel
     */
    private IUserProfileModel mUserProfileModel;

    UserProfilePresenter(Context context) {
        this.mContext = context;
        mUserProfileModel = new UserProfileModel(mContext);
        mUserProfileModel.attachView(this);
    }

    @Override
    public void attachView(IUserProfileView view) {
        this.mUserProfileView = view;
    }

    @Override
    public void getUser() {
        mUserProfileModel.getUser();
    }

    @Override
    public void onSuccess(List<User> users) {
        mUserProfileView.onSuccess(users);
    }

    @Override
    public void onFailure(String message) {
    }

    @Override
    public void getListReminder() {
        mUserProfileModel.getListReminder();
    }

    @Override
    public void onReminderSuccess(List<Reminder> reminders) {
        mUserProfileView.onReminderSuccess(reminders);
    }

    @Override
    public void removeReminder(int id) {
        mUserProfileModel.removeReminder(id);
    }

    @Override
    public void onDeleteReminderSuccess(Integer id) {
        mUserProfileView.onDeleteReminderSuccess(id);
    }
}
