// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class FinishTrainReasonActivity$$ViewBinder<T extends com.huami.watch.train.ui.activity.FinishTrainReasonActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492877, "field 'finshReasonTitle'");
    target.finshReasonTitle = finder.castView(view, 2131492877, "field 'finshReasonTitle'");
    view = finder.findRequiredView(source, 2131492878, "field 'listView'");
    target.listView = finder.castView(view, 2131492878, "field 'listView'");
    view = finder.findRequiredView(source, 2131492876, "field 'fullScrollView'");
    target.fullScrollView = finder.castView(view, 2131492876, "field 'fullScrollView'");
  }

  @Override public void unbind(T target) {
    target.finshReasonTitle = null;
    target.listView = null;
    target.fullScrollView = null;
  }
}
