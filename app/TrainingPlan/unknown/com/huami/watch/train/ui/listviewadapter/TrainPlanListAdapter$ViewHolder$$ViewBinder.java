// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.listviewadapter;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainPlanListAdapter$ViewHolder$$ViewBinder<T extends com.huami.watch.train.ui.listviewadapter.TrainPlanListAdapter.ViewHolder> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492892, "field 'imageView'");
    target.imageView = finder.castView(view, 2131492892, "field 'imageView'");
    view = finder.findRequiredView(source, 2131492893, "field 'train_plan'");
    target.train_plan = finder.castView(view, 2131492893, "field 'train_plan'");
  }

  @Override public void unbind(T target) {
    target.imageView = null;
    target.train_plan = null;
  }
}
