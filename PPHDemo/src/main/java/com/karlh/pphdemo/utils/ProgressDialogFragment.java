/**
 * Created by khirschhornjr on 6/11/14.
 */

package com.karlh.pphdemo.utils;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.ProgressDialog;
import android.os.Bundle;

/**
 * A simple dialog class that shows the status while connecting to PayPal in
 * case of OAuth login.
 */
@SuppressLint("NewApi")
public class ProgressDialogFragment extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        ProgressDialog.Builder builder = new ProgressDialog.Builder(getActivity());
        builder.setTitle("Initializing Merchant");
        builder.setMessage("Setting up merchant account...");
        builder.setCancelable(false);
        return builder.create();
    }
}
