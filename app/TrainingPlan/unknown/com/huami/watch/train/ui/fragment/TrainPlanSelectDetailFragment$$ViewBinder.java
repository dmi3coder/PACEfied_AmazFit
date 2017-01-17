// Generated code from Butter Knife. Do not modify!
package com.huami.watch.train.ui.fragment;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TrainPlanSelectDetailFragment$$ViewBinder<T extends com.huami.watch.train.ui.fragment.TrainPlanSelectDetailFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131492926, "field 'fullScrollView'");
    target.fullScrollView = finder.castView(view, 2131492926, "field 'fullScrollView'");
    view = finder.findRequiredView(source, 2131492934, "field 'numberTrainDays'");
    target.numberTrainDays = finder.castView(view, 2131492934, "field 'numberTrainDays'");
    view = finder.findRequiredView(source, 2131492935, "field 'numberTrainMils'");
    target.numberTrainMils = finder.castView(view, 2131492935, "field 'numberTrainMils'");
    view = finder.findRequiredView(source, 2131492938, "field 'recyclerView_history'");
    target.recyclerView_history = finder.castView(view, 2131492938, "field 'recyclerView_history'");
    view = finder.findRequiredView(source, 2131492936, "method 'startNewTrainPlan'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.startNewTrainPlan();
        }
      });
  }

  @Override public void unbind(T target) {
    target.fullScrollView = null;
    target.numberTrainDays = null;
    target.numberTrainMils = null;
    target.recyclerView_history = null;
  }
}
