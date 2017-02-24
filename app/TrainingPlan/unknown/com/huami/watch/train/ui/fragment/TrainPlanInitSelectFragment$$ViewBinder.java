// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainPlanInitSelectFragment$$ViewBinder<T extends com.huami.watch.train.ui.fragment.TrainPlanInitSelectFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492882, "field 'recyclerView'");
    target.recyclerView = finder.castView(view, 2131492882, "field 'recyclerView'");
    view = finder.findRequiredView(source, 2131492928, "field 'fullScrollView'");
    target.fullScrollView = finder.castView(view, 2131492928, "field 'fullScrollView'");
  }

  @Override public void unbind(T target) {
    target.recyclerView = null;
    target.fullScrollView = null;
  }
}
