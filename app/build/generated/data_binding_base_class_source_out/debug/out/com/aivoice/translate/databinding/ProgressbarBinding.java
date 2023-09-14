// Generated by view binder compiler. Do not edit!
package com.aivoice.translate.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.aivoice.translate.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ProgressbarBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final TextView mTvLoading;

  @NonNull
  public final ProgressBar progressbar;

  private ProgressbarBinding(@NonNull RelativeLayout rootView, @NonNull TextView mTvLoading,
      @NonNull ProgressBar progressbar) {
    this.rootView = rootView;
    this.mTvLoading = mTvLoading;
    this.progressbar = progressbar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ProgressbarBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ProgressbarBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.progressbar, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ProgressbarBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mTvLoading;
      TextView mTvLoading = ViewBindings.findChildViewById(rootView, id);
      if (mTvLoading == null) {
        break missingId;
      }

      id = R.id.progressbar;
      ProgressBar progressbar = ViewBindings.findChildViewById(rootView, id);
      if (progressbar == null) {
        break missingId;
      }

      return new ProgressbarBinding((RelativeLayout) rootView, mTvLoading, progressbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
