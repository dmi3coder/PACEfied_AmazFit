// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.adapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainFinishReasonAdapter$ViewHolder$$ViewBinder<T extends com.huami.watch.train.ui.adapter.TrainFinishReasonAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492892, "field 'iconTrainPlan'");
    target.iconTrainPlan = finder.castView(view, 2131492892, "field 'iconTrainPlan'");
    view = finder.findRequiredView(source, 2131492893, "field 'textTrainPlan'");
    target.textTrainPlan = finder.castView(view, 2131492893, "field 'textTrainPlan'");
  }

  @Override public void unbind(T target) {
    target.iconTrainPlan = null;
    target.textTrainPlan = null;
  }
}
